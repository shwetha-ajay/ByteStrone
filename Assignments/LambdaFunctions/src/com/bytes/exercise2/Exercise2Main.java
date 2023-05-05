package com.bytes.exercise2;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Exercise2Main {
	
	public static void main(String[] args) {
		Customer c1=new Customer(101,"John",1);
		Customer c2=new Customer(102,"Roy",2);
		Customer c3=new Customer(103,"Jiya",3);		
		
		Product p1=new Product(2022,"wings of fire","Books",250d);
		Product p2=new Product(2023,"doll","Toys",200.5);
		Product p3=new Product(2024,"redmi","mobile", 14000d);
		Product p4=new Product(2025,"Lenovo","Laptop",45000d);
		Product p5=new Product(2026,"vivo","mobile",20000d);
		Product p6=new Product(2027,"hp","Laptop",65000d);
		
		List<Product> products=new ArrayList<>();
		products.add(p1);
		products.add(p2);
		products.add(p3);
		products.add(p4);
		products.add(p5);
		products.add(p6);
		
		Order o1=new Order(10001,"ordered",LocalDate.of(2023, 04, 23),LocalDate.of(2023, 05, 03),Arrays.asList(p3, p4), c1);
		Order o2=new Order(10002,"ordered",LocalDate.of(2022, 8, 20),LocalDate.of(2023, 9, 10),Arrays.asList(p1, p2), c2);
		Order o3=new Order(10003,"ordered",LocalDate.of(2022, 8, 18),LocalDate.of(2023, 9, 30),Arrays.asList(p6, p2), c3);
		
		List<Order> orders=new ArrayList<>();
		orders.add(o1);
		orders.add(o2);
		orders.add(o3);
		
		//Obtain a list of products in category  “Mobile” with price > 10000 
	 
		List<Product>mobiles=products.stream().filter(p->p.getCategory().equals("mobile")).filter(p->p.getPrice()>10000).collect(Collectors.toList());
		for (Product product : mobiles) {
			System.out.println(product.getName() + " : " + product.getPrice());
		}

		//Obtain a list of order with products belong to category “Laptop” 
		
		List<Order>laptop=orders.stream().filter(order->order.getProducts().stream().anyMatch(p->p.getCategory().equals("Laptop"))).collect(Collectors.toList());
		System.out.println(laptop);					
        
		//Obtain a list of product with category = “Toys” and then apply 10% discount 
		
		List<Product> Toys = products.stream().filter(p -> p.getCategory().equals("Toys"))
				  .map(p -> new Product(p.getId(), p.getName(), p.getCategory(), p.getPrice() * 0.9))
				  .collect(Collectors.toList());
		   System.out.println(Toys);
		   
		//Obtain a list of products ordered by customer of tier 2 between 01-Aug-2022 and 01-Nov-2022 
		  List<Product> tier2Customer = orders.stream()
				    .filter(order -> order.getOrderDate().isAfter(LocalDate.of(2022, 8, 01)) && order.getOrderDate().isBefore(LocalDate.of(2022, 11, 01))) 
				    .filter(order -> order.getCustomer().getTier() == 2)
				    .flatMap(order -> order.getProducts().stream()) 
				    .collect(Collectors.toList());
		   System.out.println(tier2Customer);
		   
		//Get the cheapest products of “Books” category 
		   Optional<Product> cheapestBook = products.stream().filter(p -> p.getCategory().equals("Books"))
					.min(Comparator.comparing(Product::getPrice));

			
				System.out.println("Cheapest book: " + cheapestBook.get().getName() + ", Price: "
						+ cheapestBook.get().getPrice());
			
	    //Calculate total lump sum of all orders placed in Feb 2021 
				double totalLumpSum = orders.stream()
				        .filter(order -> order.getOrderDate().getMonth() == Month.FEBRUARY && order.getOrderDate().getYear() == 2021)
				        .mapToDouble(order -> order.getProducts().stream()
				                .mapToDouble(Product::getPrice)
				                .sum())
				        .sum();

				System.out.println("Total lump sum of orders placed in Feb 2021: " + totalLumpSum);			
}}






