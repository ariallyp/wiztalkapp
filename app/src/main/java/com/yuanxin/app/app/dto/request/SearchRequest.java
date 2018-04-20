package com.yuanxin.app.app.dto.request;


public class SearchRequest extends Request {

	public static final String SEARCH_TYPE_APP = "app";
	public static final String SEARCH_TYPE_USER = "user";
	
	public String searchKey;
	
	public String searchType;
	
	public int pageNo;
	
	public int pageCount;

	public String getSearchKey() {
		return searchKey;
	}

	public void setSearchKey(String searchKey) {
		this.searchKey = searchKey;
	}

	public String getSearchType() {
		return searchType;
	}

	public void setSearchType(String searchType) {
		this.searchType = searchType;
	}

	public int getPageNo() {
		return pageNo;
	}

	public void setPageNo(int pageNo) {
		this.pageNo = pageNo;
	}

	public int getPageCount() {
		return pageCount;
	}

	public void setPageCount(int pageCount) {
		this.pageCount = pageCount;
	}
	
}
