package com.yuanxin.app.app.dto.response;

import java.util.List;

import com.yuanxin.app.app.entity.gen.Wiztalkconfig;

public class WizConfigRespons extends Response {

	private static final long serialVersionUID = 5412666525061779465L;

	
	public List<Wiztalkconfig> innerWizconfigs;
	public List<Wiztalkconfig> outWizconfigs;
	
}
