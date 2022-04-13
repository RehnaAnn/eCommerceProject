/*
Author: Rehna Anthru
 * Sub: Test Quiz on to create an e-commerce application
 * Date: 03/11/2022
 * 1. The Bath Class – will inherit from Product Class
 * 2. Book will define the getDetails() method
 */

public class Bath extends Product{
	
	//generating the constructor
	public Bath(String name, double price, int quantity) {
		super(name, price, quantity);
		// TODO Auto-generated constructor stub
	}
	
	//calling the abstract method to print the details
	public void getDetails() {

		System.out.println("“We sell organic bath products");
	}

}
