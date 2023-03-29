package com.myshop.product.food;

import com.myshop.product.Product;

public class FoodProduct extends Product{
	String expiry_date;
	String manufacturer;
	
	public FoodProduct(int productId, String productName, int price, String expiry_date,String manufacturer) {
		super(productId,productName,price);
		this.expiry_date=expiry_date;
		this.manufacturer=manufacturer;
		
	}
	
	
	public String getExpiry_date() {
		return expiry_date;
	}
	public void setExpiry_date(String expiry_date) {
		this.expiry_date = expiry_date;
	}
	public String getManufacturer() {
		return manufacturer;
	}
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

}
