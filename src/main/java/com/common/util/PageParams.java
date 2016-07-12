package com.common.util;

public class PageParams {
	
	private Integer pagenum;
	private Integer pagesize;
	private Integer recordendindex;
	private Integer recordstartindex;
	
	
	public Integer getPagenum() {
		return pagenum;
	}
	public void setPagenum(Integer pagenum) {
		this.pagenum = pagenum;
	}
	public Integer getPagesize() {
		return pagesize;
	}
	public void setPagesize(Integer pagesize) {
		this.pagesize = pagesize;
	}
	public Integer getRecordendindex() {
		return recordendindex;
	}
	public void setRecordendindex(Integer recordendindex) {
		this.recordendindex = recordendindex;
	}
	public Integer getRecordstartindex() {
		return recordstartindex;
	}
	public void setRecordstartindex(Integer recordstartindex) {
		this.recordstartindex = recordstartindex;
	}


}
