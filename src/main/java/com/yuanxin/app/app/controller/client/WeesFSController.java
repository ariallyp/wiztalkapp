package com.yuanxin.app.app.controller.client;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import net.weedfs.client.AssignParams;
import net.weedfs.client.Assignation;
import net.weedfs.client.ReplicationStrategy;
import net.weedfs.client.WeedFSClient;
import net.weedfs.client.WeedFSClientBuilder;
import net.weedfs.client.net.WriteResult;

import org.apache.commons.io.IOUtils;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;

import com.yuanxin.app.app.util.HttpUtil;
import com.yuanxin.framework.logging.Logger;
import com.yuanxin.framework.logging.LoggerFactory;

@Controller
@RequestMapping(value = "/client/weedfs")
public class WeesFSController {

	/**
	 * multipartResolver
	 */
	@Resource
	private CommonsMultipartResolver multipartResolver;
	
    @Value("${fileServePath}")
    private String fileServePath;//文件服务器地址
    
    @Value("${applicationurl}")   
    private String applicationurl;
	
    /**
     * LOG
     */
    private static Logger LOG = LoggerFactory.getLogger(WeesFSController.class);
    

	@RequestMapping(value = "/upload", method = { RequestMethod.GET,RequestMethod.POST })
	@ResponseBody
	public Object upload(HttpServletRequest request,
			HttpServletResponse resp, HttpSession session) throws Exception {
		Map<String,Map<String, Object>> result = new HashMap<String,Map<String, Object>>();
		 Map<String, Object>  retData = new HashMap<String, Object>();
		// 调用服务完成上载
		MultipartHttpServletRequest multipartRequest = (MultipartHttpServletRequest) request;
		if (!multipartResolver.isMultipart(multipartRequest)) {
			throw new RuntimeException("未获取到上载的文件！");
		}

		// srcfname 是指 文件上传标签的 name=值
		MultiValueMap<String, MultipartFile> multfiles = multipartRequest
				.getMultiFileMap();
		if (multfiles == null || multfiles.size() <= 0) {
			throw new RuntimeException("未获取到上载的文件！");
		}

		for (String srcfname : multfiles.keySet()) {
			MultipartFile mfile = multfiles.getFirst(srcfname);
			String fileNameOld = mfile.getOriginalFilename();

			String fileName = fileNameOld;
			if (fileName == null || fileName.isEmpty()) {
				continue;
			}
            //1保存文件到WeedFs
            LOG.info("%s","开始上传文件");
            URL url = new URL(fileServePath);
            WeedFSClient client = WeedFSClientBuilder.createBuilder().setMasterUrl(url).build();
            Assignation a = client.assign(new AssignParams("", ReplicationStrategy.None));
            // System.out.println(a.weedFSFile.fid + " assigned");
            WriteResult rs = client.write(a.weedFSFile, a.location, mfile.getInputStream(),  mfile.getOriginalFilename());
            LOG.info("%s","上传文件:"+rs.getName()+"-文件ID："+rs.getFid());
           
            retData.put("fid", rs.getFid());
            retData.put("fileName", rs.getName());
            retData.put("error", null);
            retData.put("size", rs.getSize());
            retData.put("fileUrl", applicationurl.concat("/app/client/weedfs/download/").concat(rs.getFid()));
            result.put("responseUpload", retData);
            
            /**
             * "responseUpload": {
			        "error": null,
			        "fid": "32,025f5ff8c9d9",
			        "fileName": "epic_crop_20160331144640.jpg",
			        "fileUrl": "120.24.160.24:5084/32,025f5ff8c9d9",
			        "size": 5821
			    },

             */
		}
		result.put("responseUpload", retData);
		return result;
	}

	
    @RequestMapping("/download/{fileId}")
    public void download(@PathVariable  String fileId,HttpServletRequest request,HttpServletResponse response){
        //获取网站部署路径(通过ServletContext对象)，用于确定下载文件位置，从而实现下载
        try {
//            WeedFSFile wfile = new WeedFSFile(fileId);
//            URL url = new URL(fileServePath);
//            WeedFSClient client = WeedFSClientBuilder.createBuilder().setMasterUrl(url).build();
//            List<Location> locations = client.lookup(wfile.getVolumeId());
//	        if (locations.size() == 0) {
//	            return;
//	        }
//
//	        InputStream is = client.read(wfile, locations.get(0));
//            //3.通过response获取ServletOutputStream对象(out)
//            OutputStream output = response.getOutputStream();
//            IOUtils.copy(is, output);
//            IOUtils.closeQuietly(is);
//            IOUtils.closeQuietly(output);
            
            String addr=fileServePath;
			try {
				addr = getdownloadurl(fileId) + "/" + fileId;
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
            byte[] respond = HttpUtil.doGet(addr);
    		if(respond==null){
    			return;
    		}
			OutputStream output = response.getOutputStream();
			IOUtils.copy(new ByteArrayInputStream(respond), output);
			IOUtils.closeQuietly(output);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
	// 获取下载地址
	private String getdownloadurl(String fid) throws ParseException {
		byte[] info = HttpUtil.doGet(fileServePath + "/dir/lookup?volumeId=" + fid + "&pretty=y");
		if(info==null){
			return fileServePath;
		}
		String weedfslocation = new String(info);
		JSONParser parser = new JSONParser();
		JSONObject obj = (JSONObject) parser.parse(weedfslocation);
		JSONArray locations = (JSONArray) obj.get("locations");
		JSONObject locallocation = (JSONObject) locations.get(0);
		String url = locallocation.get("url").toString();
		return "http://"+url;
	}
	
}
