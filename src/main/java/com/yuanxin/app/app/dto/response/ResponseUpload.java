package com.yuanxin.app.app.dto.response;

/**
 * 
 * {
 * <p>
 * "fid": "3,4629f0e314",
 * <p>
 * "fileName": "sample04.jpg",
 * <p>
 * "fileUrl": "115.29.107.77:5083/3,4629f0e314",
 * <p>
 * "size": 1722664
 * <p>
 * }
 * 
 * @author liuxue
 *
 */
public class ResponseUpload {
	
	public String fid;
	
	public String fileName;
	
	public String fileUrl;
	
	public long size;
	
	/**
	 * EOF
	 */
	public String error;

	public String getFid() {
		return fid;
	}

	public void setFid(String fid) {
		this.fid = fid;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public String getFileUrl() {
		return fileUrl;
	}

	public void setFileUrl(String fileUrl) {
		this.fileUrl = fileUrl;
	}

	public long getSize() {
		return size;
	}

	public void setSize(long size) {
		this.size = size;
	}

	public String getError() {
		return error;
	}

	public void setError(String error) {
		this.error = error;
	}

	
}
