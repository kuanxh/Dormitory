package com.hxk.model;

public class Filters {

	public Filters() {
		// TODO Auto-generated constructor stub
	}
	private String groupOp;
	private Rules rules;
	public String getGroupOp() {
		return groupOp;
	}
	public void setGroupOp(String groupOp) {
		this.groupOp = groupOp;
	}
	public Rules getRules() {
		return rules;
	}
	public void setRules(Rules rules) {
		this.rules = rules;
	}
	@Override
	public String toString() {
		return "Filters [groupOp=" + groupOp + ", rules=" + rules + "]";
	}
	
}
