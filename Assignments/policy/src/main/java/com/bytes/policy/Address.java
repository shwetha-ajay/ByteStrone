package com.bytes.policy;

public class Address {
	int building_no;
	String Street;
	String place;
	
	public Address(int building_no, String street, String place) {
		super();
		this.building_no = building_no;
		Street = street;
		this.place = place;
	}

	/**
	 * @return the building_no
	 */
	public int getBuilding_no() {
		return building_no;
	}

	/**
	 * @param building_no the building_no to set
	 */
	public void setBuilding_no(int building_no) {
		this.building_no = building_no;
	}

	/**
	 * @return the street
	 */
	public String getStreet() {
		return Street;
	}

	/**
	 * @param street the street to set
	 */
	public void setStreet(String street) {
		Street = street;
	}

	/**
	 * @return the place
	 */
	public String getPlace() {
		return place;
	}

	/**
	 * @param place the place to set
	 */
	public void setPlace(String place) {
		this.place = place;
	}
	

}
