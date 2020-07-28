package org.asjy.bugproject;

import java.sql.Date;

public class BugProject {
	
	private Integer pro_id;
	
	private String pro_name;
	
	private Date start_time;
	
	private Date end_time;
	
	private Integer header;
	
	private Integer pageSize = 4 ;
	
	private Integer pageNum = 1;

	public Integer getPro_id() {
		return pro_id;
	}

	public void setPro_id(Integer pro_id) {
		this.pro_id = pro_id;
	}

	public String getPro_name() {
		return pro_name;
	}

	public void setPro_name(String pro_name) {
		this.pro_name = pro_name;
	}

	public Date getStart_time() {
		return start_time;
	}

	public void setStart_time(Date start_time) {
		this.start_time = start_time;
	}

	public Date getEnd_time() {
		return end_time;
	}

	public void setEnd_time(Date end_time) {
		this.end_time = end_time;
	}

	public Integer getHeader() {
		return header;
	}

	public void setHeader(Integer header) {
		this.header = header;
	}

	public Integer getPageSize() {
		return pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public Integer getPageNum() {
		return pageNum;
	}

	public void setPageNum(Integer pageNum) {
		this.pageNum = pageNum;
	}

	public BugProject(Integer pro_id, String pro_name, Date start_time, Date end_time, Integer header, Integer pageSize,
			Integer pageNum) {
		super();
		this.pro_id = pro_id;
		this.pro_name = pro_name;
		this.start_time = start_time;
		this.end_time = end_time;
		this.header = header;
		this.pageSize = pageSize;
		this.pageNum = pageNum;
	}

	public BugProject() {
		super();
		// TODO Auto-generated constructor stub
	}

}
