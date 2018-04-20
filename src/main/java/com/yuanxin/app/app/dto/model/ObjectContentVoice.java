package com.yuanxin.app.app.dto.model;

import com.yuanxin.app.app.dto.response.ResponseUpload;


public class ObjectContentVoice extends ObjectContent {

	private static final long serialVersionUID = -1347663935996419372L;
	
//	@JsonIgnore(true)
	public String filePath;
	
	public String fileExtention;
	public String fileMimeType;
	
	public long voiceLength;
	
//	@JsonIgnore(true)
	public boolean isListened;
	
	public ResponseUpload responseUpload;
}
