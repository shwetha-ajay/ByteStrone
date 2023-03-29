package com.myshop.productMain;
//import com.myshop.product.Product;
import com.myshop.product.beauty.BeautyProduct;
import com.myshop.product.electronics.ElectronicProduct;
import com.myshop.product.food.FoodProduct;

public class MainClass {
	public static void main(String[] args) {
		System.out.println("Food product details: ");
		FoodProduct food=new FoodProduct(1001,"bread",35,"2023-12-31","Acme Foods");
		System.out.println("Product ID:"+food.getProductId()+" Product name: "+food.getProductName()+" Price: Rs."+food.getPrice()+" Expiry date: "+food.getExpiry_date()+" Manufacturer: "+food.getManufacturer());
	
		System.out.println("Electronic product details:  ");
		ElectronicProduct electronic=new ElectronicProduct (2001,"Smart TV",10000,"Samsung","2 years");
		System.out.println("Product ID:"+electronic.getProductId()+" Product name: "+electronic.getProductName()+" Price: "+electronic.getPrice()+" Brand: "+electronic.getBrand()+" Warranty: "+electronic.getWarranty());
	    
		System.out.println("Beauty product details:  ");
		BeautyProduct beauty=new BeautyProduct(3001,"Lipstick",129,"L'Oreal","2024-06-30");
		System.out.println("Product ID:"+beauty.getProductId()+" Product name: "+beauty.getProductName()+" Expiry date: "+beauty.getExpiryDate());
	    
	}

}
