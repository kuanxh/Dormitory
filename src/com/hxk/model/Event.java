package com.hxk.model;

import java.sql.Date;

public class Event {

	public Event() {
		// TODO Auto-generated constructor stub
	}
	private int id;
	private String title;
	private Date start;
	private Date end;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
	public Date getStart() {
		return start;
	}
	public void setStart(Date start) {
		this.start = start;
	}
	public Date getEnd() {
		return end;
	}
	public void setEnd(Date end) {
		this.end = end;
	}
	@Override
	public String toString() {
		return "Event [id=" + id + ", title=" + title + ", start=" + start + ", end=" + end + "]";
	}
}
