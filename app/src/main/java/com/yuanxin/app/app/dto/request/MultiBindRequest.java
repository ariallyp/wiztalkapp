package com.yuanxin.app.app.dto.request;

import java.util.List;

public class MultiBindRequest {
  public List<String> idList;
  
  public String bindStatus;

public List<String> getIdList() {
	return idList;
}

public void setIdList(List<String> idList) {
	this.idList = idList;
}

public String getBindStatus() {
	return bindStatus;
}

public void setBindStatus(String bindStatus) {
	this.bindStatus = bindStatus;
}
}
