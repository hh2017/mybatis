package com.hh.entity;


public class Waste {

	private Waste_type waste_type;
	private int getwaste_id;
	private String name;
	private String code;
	public Waste_type getWaste_type() {
		return waste_type;
	}
	public void setWaste_type(Waste_type waste_type) {
		this.waste_type = waste_type;
	}
	public int getGetwaste_id() {
		return getwaste_id;
	}
	public void setGetwaste_id(int getwaste_id) {
		this.getwaste_id = getwaste_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	@Override
	public String toString() {
		return "Waste [waste_type=" + waste_type + ", getwaste_id=" + getwaste_id + ", name=" + name + ", code=" + code
				+ "]";
	}

	
	
}
