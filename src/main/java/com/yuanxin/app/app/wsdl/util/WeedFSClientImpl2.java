package com.yuanxin.app.app.wsdl.util;


import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;
import java.util.List;
import java.util.Scanner;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.mime.MultipartEntity;
import org.apache.http.entity.mime.content.FileBody;
import org.apache.http.entity.mime.content.StringBody;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import net.weedfs.client.AssignParams;
import net.weedfs.client.Assignation;
import net.weedfs.client.Location;
import net.weedfs.client.WeedFSClient;
import net.weedfs.client.WeedFSException;
import net.weedfs.client.WeedFSFile;
import net.weedfs.client.caching.LookupCache;
import net.weedfs.client.net.WriteResult;
import net.weedfs.client.status.MasterStatus;
import net.weedfs.client.status.VolumeStatus;

public class WeedFSClientImpl2 implements WeedFSClient {
	final URL masterURl;
	final HttpClient httpClient;
	final LookupCache lookupCache;
	
	public WeedFSClientImpl2(URL masterURl,HttpClient httpClient,LookupCache lookupCache) {
		this.masterURl = masterURl;
		this.httpClient = httpClient;
		this.lookupCache = lookupCache;
	}

	@Override
	public Assignation assign(AssignParams arg0) throws IOException, WeedFSException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(WeedFSFile arg0, Location arg1) throws IOException, WeedFSException {
		// TODO Auto-generated method stub

	}

	@Override
	public MasterStatus getMasterStatus() throws IOException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public VolumeStatus getVolumeStatus(Location arg0) throws IOException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Location> lookup(long arg0) throws IOException, WeedFSException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public InputStream read(WeedFSFile arg0, Location arg1) throws IOException, WeedFSException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public WriteResult write(WeedFSFile arg0, Location arg1, File arg2) throws IOException, WeedFSException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public WriteResult write(WeedFSFile arg0, Location arg1, byte[] arg2, String arg3)
			throws IOException, WeedFSException {
		// TODO Auto-generated method stub
		return null;
	}

	public WriteResult write(WeedFSFile file, Location location, InputStream inputToUpload, String fileName)
			throws IOException, WeedFSException {
		StringBuilder url = new StringBuilder();
		if (!location.url.contains("http")) {
			url.append("http://");
		}
		url.append(location.url);
		url.append('/');
		url.append(file.fid);
		File f =null;
		HttpPost post = new HttpPost(url.toString());
		MultipartEntity params = new MultipartEntity();
		String prefix = "";
		String suffix ="";
		
		if (prefix=="") {
			prefix = String.valueOf(System.currentTimeMillis());
		}
		f= File.createTempFile(prefix, suffix);
		inputstreamtofile(inputToUpload,f);
		FileBody bin = new FileBody(f);
		params.addPart("file", bin);
		params.addPart("Content-Type", new StringBody("multipart/form-data;boundar=*****"));
		params.addPart("filename", new StringBody(fileName));
		
		post.setEntity(params);
		
		try {
			HttpResponse response = httpClient.execute(post);
			String content = getContentOrNull(response);
			ObjectMapper  mapper = new ObjectMapper();
			try {
				WriteResult result = mapper.readValue(content, WriteResult.class);
				result.setFid(file.fid);
				result.setName(fileName);
				result.setPublicUrl(location.url);
				if (result.error!=null) {
					throw new WeedFSException(result.error);
				}
				return result;
			} catch (JsonMappingException | JsonParseException e) {
				throw new WeedFSException("Unable to parse JSON from weed-fs from : "+ content ,e);
			}
			
		} finally {
			post.abort();
			if (null != f) {
				f.delete();
			}
		} 
		
		 
		
	}

	private String getContentOrNull(HttpResponse response) throws UnsupportedOperationException, IOException {
		
		return converStreamToStream(response.getEntity().getContent());
	}

	private String converStreamToStream(InputStream content) {
		try(Scanner scanner = new Scanner(content,"UTF-8")){
			return scanner.useDelimiter("\\A").hasNext() ? scanner.next() : "";
		}
	}

	private void inputstreamtofile(InputStream ins, File file) {
		try {
			OutputStream os = new FileOutputStream(file);
			int bytesRead =0 ;
			byte [] buffer = new byte[8192];
			while ((bytesRead = ins.read(buffer,0,8192))!=-1) {
				os.write(buffer, 0, bytesRead);
				
			}
			os.close();
			ins.close();
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}

}
