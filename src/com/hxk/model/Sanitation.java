package com.hxk.model;

public class Sanitation {

	public Sanitation() {
		// TODO Auto-generated constructor stub
	}
	private String number;//宿舍号
	private String bed;//床
	private String floor;//地面
	private String chair;//桌椅
	private String toilet;//厕所
	private String loo;//洗手间
	private String comment;//备注
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getBed() {
		return bed;
	}
	public void setBed(String bed) {
		this.bed = bed;
	}
	public String getFloor() {
		return floor;
	}
	public void setFloor(String floor) {
		this.floor = floor;
	}
	public String getChair() {
		return chair;
	}
	public void setChair(String chair) {
		this.chair = chair;
	}
	public String getToilet() {
		return toilet;
	}
	public void setToilet(String toilet) {
		this.toilet = toilet;
	}
	public String getLoo() {
		return loo;
	}
	public void setLoo(String loo) {
		this.loo = loo;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	@Override
	public String toString() {
		return "Sanitation [number=" + number + ", bed=" + bed + ", floor=" + floor + ", table=" + chair + ", toilet="
				+ toilet + ", loo=" + loo + ", comment=" + comment + "]";
	}
	
}
