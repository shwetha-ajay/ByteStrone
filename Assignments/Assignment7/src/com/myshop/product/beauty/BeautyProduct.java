package com.myshop.product.beauty;
import com.myshop.product.*;


public class BeautyProduct extends Product{
	public BeautyProduct( int productId, String productName, int price,String brand,  String expiryDate) {
		super(productId,productName,price);
		this.brand=brand;
		this.expiryDate=expiryDate;
	
	}
	
	String brand;
	String expiryDate;
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getExpiryDate() {
		return expiryDate;
	}

}
