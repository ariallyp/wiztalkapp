package com.yuanxin.app.app.wsdl.util;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.fileupload.FileUploadException;

import net.weedfs.client.WeedFSClient;

public class WeedFsClientUpload {

/*	 public void upload(HttpServletRequest request) throws FileUploadException, IOException {
		 WeedFSClient  client =;
		    if (ServletFileUpload.isMultipartContent(request)) {
		        FileItemIterator fileItemIterator = new ServletFileUpload().getItemIterator(request);
		        InputStream inputStream = null;
		        while (fileItemIterator.hasNext()) {
		            FileItemStream item = fileItemIterator.next();
		            if (!item.isFormField()) {
		                inputStream = item.openStream();
		                File file = new File(request.getServletContext().getRealPath("/")+"img/uploads/"+item.getName());
		                FileOutputStream fos = new FileOutputStream(file);
		                Streams.copy(inputStream, fos, true);
		                RequestResult result = client.upload(file);
		                if (result.isSuccess()) {
		                    System.out.println("uploaded file with ID "+result.getFid());
		                }
		            }
		        }
		    }
		}*/
	
	
	
}
