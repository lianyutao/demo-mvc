package com.example.mvc.model.request;

import java.io.Serializable;

public class PageRequest implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int pagesize=10;//每页的大小
	private int currentPage;//当前页码
	public int getPagesize() {
		return pagesize;
	}
	public void setPagesize(int pagesize) {
		this.pagesize = pagesize;
	}
	public int getCurrentPage() {
		return currentPage;
	}
	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}
	
}
