package com.yuanxin.app.app.dto.response;

import java.util.List;

import com.yuanxin.app.app.dto.model.ObjectContentApp102.Operation;


public class GetAppOperationListResponse extends Response {

	private static final long serialVersionUID = 3281405056415312352L;

	public int operationCount;
	
	public List<Operation> operationList;
}
