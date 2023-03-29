package com.myshop.product.electronics;
import com.myshop.product.*;

public class ElectronicProduct extends Product {
	public ElectronicProduct(int productId, String productName, int price, String brand, String warranty ) {
		super(productId,productName,price);
		this.brand=brand;
		this.warranty=warranty;
		
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getWarranty() {
		return warranty;
	}
	public void setWarranty(String warranty) {
		this.warranty = warranty;
	}
	String brand;
	String warranty;

}
