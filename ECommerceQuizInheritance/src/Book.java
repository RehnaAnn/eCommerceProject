
/*
Author: Rehna Anthru
 * Sub: Test Quiz on to create an e-commerce application
 * Date: 03/11/2022
 * 1. Book class inherits from the Product class
 * 2.  Book will define the getDetails() method
 * 
*/
public class Book extends Product{
	
	//declaring the variables
	private String author;
	private String genre;
	private String isbn;

	//generating the constructors
	public Book(String name, double price, int quantity, String author) {
		super(name, price, quantity);
		this.author = author;
	}

	public Book(String name, double price, int quantity, String author, String genre, String isbn) {
		super(name, price, quantity);
		this.author = author;
		this.genre = genre;
		this.isbn = isbn;
	}
	//calling the abstract method to print the details
	public void getDetails() {

		System.out.println("We sell books on Software Development");
	}

}
