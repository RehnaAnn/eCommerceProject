/*
 * Author: Rehna Anthru
 * Sub: Test Quiz on to create an e-commerce application
 * Date: 03/11/2022
 * About the product class: 
 * 1. Class has protected attributes and constructors and they will have public getters and setters.
 * 2. Create an instant method buy() that doesnt take a parameter and will return a boolean.
 * 3.  Product class will have an abstract method called getDetails() that will not take 
      any parameters and not return anything.

 */
public abstract class Product {

	//declaring the variables
	protected String name;
	protected double price;
	protected int quantity; 
	
	//abstract methos to get the product details 
	public abstract void getDetails();

	//generating Constructor
	public Product(String name, double price, int quantity) {
		super();
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	
	//generating public setters and getters 
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	public int getQuantity() {
		return quantity;
	}


	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}


	//instant method to return a boolean
	public boolean buy() { 
		
		if(this.quantity >0) {
			
			this.quantity--;
			return true;
		}
		else {			
			return false;
		}
		
	}
}
