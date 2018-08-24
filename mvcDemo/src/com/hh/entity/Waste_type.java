package com.hh.entity;

public class Waste_type {

	private int id;
	private String wasteName;
	private String wasteCode;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getWasteName() {
		return wasteName;
	}
	public void setWasteName(String wasteName) {
		this.wasteName = wasteName;
	}
	public String getWasteCode() {
		return wasteCode;
	}
	public void setWasteCode(String wasteCode) {
		this.wasteCode = wasteCode;
	}
	@Override
	public String toString() {
		return "Waste_type [id=" + id + ", wasteName=" + wasteName + ", wasteCode=" + wasteCode + "]";
	}
	
	
	
	
}
