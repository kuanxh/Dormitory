package com.hxk.model;

public class Rules {

	public Rules() {
		// TODO Auto-generated constructor stub
	}
	private String field;
	private String op;
	private String data;
	public String getField() {
		return field;
	}
	public void setField(String field) {
		this.field = field;
	}
	public String getOp() {
		return op;
	}
	public void setOp(String op) {
		this.op = op;
	}
	public String getData() {
		return data;
	}
	public void setData(String date) {
		this.data = date;
	}
	@Override
	public String toString() {
		return "Rules [field=" + field + ", op=" + op + ", date=" + data + "]";
	}
	
}
