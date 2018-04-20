package com.yuanxin.app.app.dto.model;

import com.yuanxin.app.app.dto.response.ResponseUpload;


/**
 * @author liuxue
 *
 */
public class ObjectContentImage extends ObjectContent {

	private static final long serialVersionUID = -4377658450482863186L;

	public int width;

	public int height;

//	@JsonIgnore(true)
	public String filePath;
	
	public String fileExtention;

	public String fileMimeType;

	public ResponseUpload responseUpload;
}
