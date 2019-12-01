package com.java.restaurant.main;

import java.util.Scanner;

/*
 * Variable Description
 * 
 * ********************************************************************** 
 * Main Menu - "Starter,"Main Course","Desserts", "Beverages" 
 * Starter - "Salad","Soup","Papad"
 * Main Course - "Roti","Paneer Masala","Daal","Rice",
 * Desserts - "Icecream", "Almond Chocolate", "Gulab Jaam"
 * Beverages -"Pepsi","Water","Ice Tea","Coffee"
 * ***********************************************************************
 * int choice -  Used to handle the main Switch case
 * int starterChoice - Used to get the choice of starter from user
 * int starterQuantity - Used to get the quantity of starter from user
 * int starterTotalAmount - Used to calculate total amount of starter ordered
 * int mainCourseChoice - Used to get the choice of main course from user
 * int mainCourseQuantity - Used to get the quantity of main course from user
 * int mainCourseTotalAmount - Used to calculate total amount of main course ordered
 * int desertChoice - Used to get the choice of dessert from user
 * int desertQuantity - Used to get the quantity of desert from user
 * int desertTotalAmount - Used to calculate total amount of desert ordered
 * int beveragesChoice - Used to get the choice of beverages from user
 * int beveragesQuantity - Used to get the quantity of beverages from user
 * int beveragesTotalAmount - Used to calculate total amount of beverages ordered
 * int foodSubAmount -  Used to calculate the sub amount of each category
 * double totalBill - Calculates total amount of food bill ordered
 * double taxAmount - Used to calculate the 18% tax on totalBill 
 * double billToBePaid -Used to calculate the total amount to be paid by the customer including tax
 * 
 */

public class Restaurant_Management {

	public static void main(String[] args) {
		try {
			Scanner in = new Scanner(System.in);
			int starterChoice, starterQuantity = 0, starterTotalAmount = 0,
					mainCourseChoice, mainCourseQuantity = 0,mainCourseTotalAmount = 0,
					desertChoice, desertQuantity = 0, desertTotalAmount = 0, 
					beveragesChoice,beveragesQuantity = 0, beveragesTotalAmount = 0, 
					foodSubAmount = 0, choice;
			double taxAmount = 0, totalBill, billToBePaid;
			String foodChoice = "Y", foodSubChoice;
			System.out.println("\t\t\t**************Welcome to Jacob's Kitchen**********************");

			System.out.println();

			while (foodChoice.equalsIgnoreCase("Y")) {
				System.out.println("Starter\t\t\t:1");
				System.out.println("Main Course\t\t:2");
				System.out.println("Desserts\t\t:3");
				System.out.println("Beverages\t\t:4");
				System.out.println();
				System.out.println("Please enter your choice");

				choice = in.nextInt();

				switch (choice) {

				case 1:
					System.out.println("Welcome to Starter Menu");

					System.out.println();
					foodSubChoice = "Y";

					while (foodSubChoice.equalsIgnoreCase("Y")) {

						System.out.println("Starters\t\tPrice in Rs.");
						System.out.println();
						System.out.println("1.Salad\t\t\t150");
						System.out.println("2.Soup\t\t\t100");
						System.out.println("3.Papad\t\t\t50");
						System.out.println();
						System.out.println("Choose a starter by entering a number :");
						starterChoice = in.nextInt();	
						
						
						if (starterChoice == 1) {
							System.out.println("Enter the quantity  :");
							starterQuantity = in.nextInt();
							
							foodSubAmount = starterQuantity * 150;
							System.out.println("You've ordered:Salad = "  + starterQuantity);
							
						}
						if (starterChoice == 2) {
							System.out.println("Enter the quantity  :");
							starterQuantity = in.nextInt();
							foodSubAmount = starterQuantity * 100;
							System.out.println("You've ordered:Soup = " +  starterQuantity);
						}
						if (starterChoice == 3) {
							System.out.println("Enter the quantity  :");
							starterQuantity = in.nextInt();
							foodSubAmount = starterQuantity * 50;
							System.out.println("You've ordered:Papad = " + starterQuantity);
						}
						if (starterChoice >3 || starterChoice ==0 ) {
							System.out.println("Oops....input is not  correct");
							break;
						}	
						
					
						

						starterTotalAmount = starterTotalAmount + foodSubAmount;
						System.out.println();
						System.out.println("Do you want to place more order ? Enter Y/N");
						foodSubChoice = in.next();
					}
					break;

				/////////////////////// Main Course///////////////

				case 2:
					System.out.println("Welcome to Main Course !!");
					System.out.println();
					foodSubChoice = "Y";

					while (foodSubChoice.equalsIgnoreCase("Y")) {

						System.out.println(" Main Course\t\tPrice in Rs.");
						System.out.println();
						System.out.println("1.Roti\t\t\t\t10");
						System.out.println("2.Paneer Masala\t\t\t200");
						System.out.println("3.Daal\t\t\t\t150");
						System.out.println("4.Rice\t\t\t\t100");
						System.out.println();
						System.out.println("Choose the main course by entering a number :");
						mainCourseChoice = in.nextInt();
						
						if (mainCourseChoice == 1) {
							System.out.println("Enter a  quantity you want to buy");
							mainCourseQuantity = in.nextInt();
							foodSubAmount = mainCourseQuantity * 10;
							System.out.println("You've ordered: Roti = " + mainCourseQuantity);
						}
						if (mainCourseChoice == 2) {
							System.out.println("Enter a  quantity you want to buy");
							mainCourseQuantity = in.nextInt();
							foodSubAmount = mainCourseQuantity * 200;
							System.out.println("You've ordered:Paneer Masala = " + mainCourseQuantity);
						}
						if (mainCourseChoice == 3) {
							System.out.println("Enter a  quantity you want to buy");
							mainCourseQuantity = in.nextInt();
							foodSubAmount = mainCourseQuantity * 150;
							System.out.println("You've ordered: Daal = " + mainCourseQuantity);
						}
						if (mainCourseChoice == 4) {
							System.out.println("Enter a  quantity you want to buy");
							mainCourseQuantity = in.nextInt();
							foodSubAmount = mainCourseQuantity * 100;
							System.out.println("You've ordered: Rice = "  + mainCourseQuantity);
						}
						if (mainCourseChoice>4 || mainCourseChoice ==0 ) {
							System.out.println("Oops....input is not  correct");
							break;
						}	

						mainCourseTotalAmount = mainCourseTotalAmount + foodSubAmount;
						System.out.println();
						System.out.println("Do you want to place more order ? Enter Y/N");
						foodSubChoice = in.next();
					}

					break;

				//////////////////////////////////// Desserts///////////////

				case 3:
					System.out.println("Welcome to Desserts !!");
					System.out.println();
					foodSubChoice = "Y";

					while (foodSubChoice.equalsIgnoreCase("Y")) {

						System.out.println("Desserts\t\t\tPrice in Rs.");
						System.out.println();
						System.out.println("1.Icecream\t\t\t100");
						System.out.println("2.Almond Chocolate\t\t120");
						System.out.println("3.Gulab Jaam\t\t\t80");
						System.out.println();
						System.out.println("Choose your dessert by entering a number :");
						desertChoice = in.nextInt();
						
						if (desertChoice == 1) {
							System.out.println("Enter a  quantity you want to buy");
							desertQuantity = in.nextInt();
							foodSubAmount = desertQuantity * 100;
							System.out.println("You've ordered: Icecream = " + desertQuantity);
						}
						if (desertChoice == 2) {
							System.out.println("Enter a  quantity you want to buy");
							desertQuantity = in.nextInt();
							foodSubAmount = desertQuantity * 120;
							System.out.println("You've ordered: Almond Chocolate = " + desertQuantity);
						}
						if (desertChoice == 3) {
							System.out.println("Enter a  quantity you want to buy");
							desertQuantity = in.nextInt();
							foodSubAmount = desertQuantity * 80;
							System.out.println("You've ordered: Gulab Jaam = " + desertQuantity);
						}
						if (desertChoice>3|| desertChoice ==0 ) {
							System.out.println("Oops....input is not  correct");
							break;
						}
						

						desertTotalAmount = desertTotalAmount + foodSubAmount;
						System.out.println();
						System.out.println("Do you want to place more order ? Enter Y/N");
						foodSubChoice = in.next();
					}
					break;

				/////////////////////////////// Beverages///////////////////////

				case 4:
					System.out.println("Welcome to Beverages !!");
					System.out.println();
					foodSubChoice = "Y";

					while (foodSubChoice.equalsIgnoreCase("Y")) {
						System.out.println("Beverages\t\tPrice in Rs.");
						System.out.println();
						System.out.println("1.Pepsi\t\t\t50");
						System.out.println("2.Water\t\t\t20");
						System.out.println("3.Ice Tea\t\t60");
						System.out.println("4.Coffee\t\t40");
						System.out.println();
						System.out.println("Choose your Beverages by entering a number :");
						beveragesChoice = in.nextInt();
						
						if (beveragesChoice == 1) {
							System.out.println("Enter a  quantity you want to buy");
							beveragesQuantity = in.nextInt();
							foodSubAmount = beveragesQuantity * 50;
							System.out.println("You've ordered: Pepsi = " + beveragesQuantity);
						}
						if (beveragesChoice == 2) {
							System.out.println("Enter a  quantity you want to buy");
							beveragesQuantity = in.nextInt();
							foodSubAmount = beveragesQuantity * 20;
							System.out.println("You've ordered: Water = " + beveragesQuantity);
						}
						if (beveragesChoice == 3) {
							System.out.println("Enter a  quantity you want to buy");
							beveragesQuantity = in.nextInt();
							foodSubAmount = beveragesQuantity * 60;
							System.out.println("You've ordered: Ice Tea = " + beveragesQuantity);
						}
						if (beveragesChoice == 4) {
							System.out.println("Enter a  quantity you want to buy");
							beveragesQuantity = in.nextInt();
							foodSubAmount = beveragesQuantity * 40;
							System.out.println("You've ordered: Coffee = " + beveragesQuantity);
						}
						if (beveragesChoice>4|| beveragesChoice==0 ) {
							System.out.println("Oops....input is not  correct");
							break;
						}

						beveragesTotalAmount = beveragesTotalAmount + foodSubAmount;
						System.out.println();
						System.out.println("Do you want to place more order ? Enter Y/N");
						foodSubChoice = in.next();
					}
					break;
				default:
					System.out.println("Wrong Selection Please try again");
				}
				System.out.println("Please enter 'Y' to go to Main Menu and 'N' to ask for a bill !!!");
				foodChoice = in.next();
			}

			System.out.println("***************Jacob's Kitchen Order Summary************");
			System.out.println();
			System.out.println("***************Starter************");
			System.out.println("Total Cost of Starter = Rs." + starterTotalAmount);
			System.out.println();
			System.out.println("***************Main Course************");
			System.out.println("Total Cost of Main Course = Rs." + mainCourseTotalAmount);
			System.out.println();
			System.out.println("***************Desert************");
			System.out.println("Total Cost of Dessert = Rs." + desertTotalAmount);
			System.out.println();
			System.out.println("***************Beverages************");
			System.out.println("Total Cost of Beverages = Rs." + beveragesTotalAmount);
			System.out.println();

			totalBill = starterTotalAmount + mainCourseTotalAmount + desertTotalAmount + beveragesTotalAmount;

			System.out.println("Total Bill Amount excluding tax is = Rs." + totalBill);
			System.out.println();
			taxAmount = totalBill * 18.0 / 100.0;

			System.out.println("Tax Amount (18%) = RS. " + taxAmount);
			System.out.println();
			billToBePaid = totalBill + taxAmount;
			System.out.println("Total Bill to be paid is = Rs. " + billToBePaid);
			System.out.println();
			System.out.println("Thanks for Visiting Jacob's Kitchen\n");
			System.out.println("Visit Again!!!\n");
		} catch (Exception e) {
			System.out.println("Oops....input is not  correct");
		}

	}

}
