package com.bytes.exercise2;

public class Product {
	long Id;
	String name;
	String category;
	private Double price;
	public Product(long id, String name, String category, Double price) {
		super();
		Id = id;
		this.name = name;
		this.category = category;
		this.price = price;
	}
	
	public long getId() {
		return Id;
	}

	public void setId(long id) {
		Id = id;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}
	
	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}
	public String toString() {
		return "Product Id: " + getId() + ", product name: " + getName() + ", category : "
				+ getCategory() + "price: "+getPrice();
	}

}
