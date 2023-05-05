package com.bytes.exercise2;

import java.time.LocalDate;
import java.util.List;

public class Order {
	long Id;
	String status;
	LocalDate orderDate;
	LocalDate deliveryDate;
	List<Product>products;
	Customer customer;
	public Order(long id, String status, LocalDate orderDate, LocalDate deliveryDate,List<Product> products,Customer customer) {
		super();
		Id = id;
		this.status = status;
		this.orderDate = orderDate;
		this.deliveryDate = deliveryDate;
		this.products=products;
		this.customer=customer;
		
	}
	
	public long getId() {
		return Id;
	}
	void setId(long id) {
		Id = id;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	public LocalDate getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(LocalDate orderDate) {
		this.orderDate = orderDate;
	}
	
	public LocalDate getDeliveryDate() {
		return deliveryDate;
	}

	public void setDeliveryDate(LocalDate deliveryDate) {
		this.deliveryDate = deliveryDate;
	}
	public List<Product> getProducts() {
		return products;
	}
	
	public void setProducts(List<Product> products) {
		this.products = products;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public String toString() {
		return "Employee [Id: " + getId() + ", orderdate: " + getOrderDate() + ", delivery date: "
				+ getDeliveryDate() + "]";
	}
	
}
