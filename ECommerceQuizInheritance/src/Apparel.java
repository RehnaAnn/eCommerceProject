/*
Author: Rehna Anthru
 * Sub: Test Quiz on to create an e-commerce application
 * Date: 03/11/2022
 * 1. The Apparel Class – will inherit from Product Class
 * 2. Book will define the getDetails() method
*/
public class Apparel extends Product{
	
	//declaring the variables
	private char size;
	private String color;

	//generating the constructors 
	public Apparel(String name, double price, int quantity, char size, String color) {
		super(name, price, quantity);
		this.size = size;
		this.color = color;
	}
	
	//calling the abstract method to print the details
	public void getDetails() {

		System.out.println("We sell different kinds of business clothes for both men and women");
	}
}
