package com.bytes.assignment;

public class Address {
	int buildingNo;
	String street;
	String district;
	String state;
	
	
	public Address(int buildingNo,String street,String district,String state) {
		this.buildingNo=buildingNo;
		this.street=street;
		this.district=district;
		this.state=state;
	}


public int getBuildingNo() {
	return buildingNo;
}
public String getStreet() {
	return street;
}
public String getDistrict() {
	return district;
}
public String getState() {
	return state;
}
public void setBuildingNo(int buildingNo) {
	this.buildingNo=buildingNo;
}
public void setStreet(String street) {
	this.street=street;
}
public void setDistrict(String district) {
	this.district=district;
}
public void setState(String state) {
	this.state=state;
}

}

