package com.yuanxin.app.app.dto.response;

import java.util.List;

import com.yuanxin.app.app.dto.model.Member;
import com.yuanxin.app.app.entity.gen.Skin;



//@JsonIgnoreProperties(ignoreUnknown=true)
public class GetSkinListResponse extends Response {

	private static final long serialVersionUID = 5412666525061779465L;

	public int skinListSize;
	
	public List<Skin> skinList;
}
