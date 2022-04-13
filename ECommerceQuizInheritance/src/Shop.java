import java.util.Scanner;
/*
Author: Rehna Anthru
 * Sub: Test Quiz on to create an e-commerce application
 * Date: 03/11/2022
 * The array will give you an error now that Product is abstract. Modify the objects 
inside the array to call respective subclass’s constructor.
 * Notes: Inside the while/do-while loop, remove the if statement that checks if the user has 
entered a number between 0 and 4, (you will replace it with a try-catch block once 
exception is handled). This will cause your program to crash with an 
ArrayIndexOutOfBoundsException if the user enters any number other than 
0,1,2,3,4. Catch that exception and break; the loop inside the catch block.
 * 
 */
public class Shop {

	static double totalAmount=0;

	//static array of 5 products
	static Product [] inventory = {new Apparel("Business Ritual Women’s Long Sleeve Top", 65.39, 4, 'L', "Blue"), 
			new Book("The Art of Computer Programming ", 190.54, 9, "Donald E. Knuth"), 
			new Apparel("Men’s Business Casual Shirt",  57.10, 2 , 'M', "Teal"),
			new Bath("Organic Turmeric Soap", 11.25, 1 ),
			new Book("Head First Design Pattern", 37.35, 3 , "Eric Freeman", "Software", "abc")};

	//static method to return the menu and to loop through the inventory
	static void displayMenu() {

		System.out.println("Enter the product index (0 to 4) you want to buy. To exit the shopping cart, enter any number other than 0 to 4");

		for(int i=0; i<=inventory.length-1; i++) {
			
			System.out.println(i + ":"+ inventory[i].getName());
		}

	}

	public static void main(String[] args) {

		int userInput;
		Scanner input=new Scanner(System.in);

		//running a do while loop to that runs between user inputs 0-4		
		do {
			//calling the display method
			displayMenu();
			userInput=input.nextInt();

			//calling buy method with a nested if condition 
			//if(userInput >=0 && userInput<=4 ) {			
			//implementing a try catch block to throw an exception when the user enters invalid input
			try {
				
				if(inventory[userInput].buy()) {

					System.out.println("Your purchase was successful");
					totalAmount=totalAmount + inventory[userInput].getPrice();					
				}			
				else {

					System.out.println("Sorry! This product is out of stock");
				}
			}
			catch(ArrayIndexOutOfBoundsException e) { //ArrayIndexOutOfBoundsException if the user enters any number other than 0,1,2,3,4

				System.out.println("Invalid request: " + userInput); //error message for the user for an invalid input

				break;
			}
			
		} while(userInput >=0 && userInput<=4);

		//generating the total amount after the do while loop as ended
		System.out.println("Thank you for shopping with us! The Total amount is " + totalAmount);	

		input.close();
	}
}