package com.java.restaurant.main;

import java.util.Scanner;

public class Restaurant_Management {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in); 
		int vstr,tvstr=0,nvstr,tnvstr=0,vfd,tvfd=0,nvfd,tnvfd=0,fd,tfd=0,amt=0,tamt=0,
				tamt1=0,tamt2=0,totald=0,damt=0,ch,d;
		double gst=0,tot,gtotal;
		String str="",choice,choice1="Y";
		System.out.println("Welocme to the multicuisine restaurant");
		
		System.out.println("Starter Corner :1");
		System.out.println("Main Course :2");
		System.out.println("Deserts :3");
		System.out.println();
		
		while(choice1.equalsIgnoreCase("Y")) { 
			System.out.println("Enter for starter : 1");
			System.out.println("Enter for main course : 2");
			System.out.println("Enter for deserts : 3");
			System.out.println();
			
			System.out.println("Enter your choice");
			
			ch = in.nextInt();
			
			switch(ch) {
			
			case 1: 
				System.out.println("Welcome to Starter Menu");
				System.out.println("Enter 'VS' for Veg Starter and Enter 'NVS' for Non-Veg Starter");
				str = in.next();
				
				if(str.equalsIgnoreCase("VS")) {
					System.out.println("Starters\t\t\t Price in Rs.");
					
					System.out.println("1.Paneer Tikka\t\t\t\t110");
					System.out.println("2.Veg Seekh Kabab\t\t\t110");
					System.out.println("3.Hara Bhara Kabab\t\t\t110");
					System.out.println("4.SHangai Sprint Roll\t\t\t150");
					System.out.println("5.American COrn Ball\t\t\t150");
					System.out.println("6.Crispy American Corn\t\t\t140");
					System.out.println("7.Crispy Chili Potato\t\t\t120");
					System.out.println("8.Crispy Chili Chana \t\t\t150");
					
					System.out.println();
					choice="Y";
					
					while(choice.equalsIgnoreCase("Y")) {
						System.out.println("Choose a Veg starter by entering a number :");
						vstr = in.nextInt();
						System.out.println("Enter a quantity :");
						tvstr = in.nextInt();
						if(vstr>=1 && vstr<=3) {
							amt = tvstr *110;
						}
						if(vstr==4 || vstr==5 || vstr ==8) {
							amt = tvstr *150;
						}
						if(vstr==6) {
							amt = tvstr *140;
						}
						if(vstr==7) {
							amt = tvstr *120;
						}
						tamt = tamt+amt;
						
						System.out.println("Do you want to place more order ? Enter Y/N");
						choice = in.next();
					}
					
				}
				
				if(str.equalsIgnoreCase("NVS")) {
					System.out.println("Non-Veg Starters\t\t\t Price in Rs.");
					
					System.out.println("1.Chicken Tikka\t\t\t\t170");
					System.out.println("2.Murgh Resmhi Kabab\t\t\t170");
					System.out.println("3.Murgh Chilli Kabab\t\t\t160");
					System.out.println("4.Chicken Sekh Kabab\t\t\t180");
					System.out.println("5.Tangadi Kabab\t\t\t\t180");
					System.out.println("6.Murgh Tandori\t\t\t\t190");
					System.out.println("7.Fish Ajwani Tikka\t\t\t190");
					System.out.println("8.Chilli CHicken \t\t\t160");
					
					System.out.println();
					choice="Y";
					
					while(choice.equalsIgnoreCase("Y")) {
						System.out.println("Choose a Non-Veg starter by entering a number :");
						nvstr = in.nextInt();
						System.out.println("Enter a quantity :");
						tnvstr = in.nextInt();
						if(nvstr==1 || nvstr==2) {
							amt = tnvstr *170;
						}
						if(nvstr==3 || nvstr==8) {
							amt = tnvstr *160;
						}
						if(nvstr==4 || nvstr==5) {
							amt = tnvstr *180;
						}
						if(nvstr==6 || nvstr==7) {
							amt = tnvstr *190;
						}
						tamt = tamt+amt;
						
						System.out.println("Do you want to place more order ? Enter Y/N");
						choice = in.next();
					}
					
				}
				break;
				
				///////////////////////Main Course///////////////
				
			case 2: 
				System.out.println("Main Course : Indian !!");
				System.out.println("Enter 'V' for Indian Veg Dishes and Enter 'NV' for Indian Non-Veg Dishes");
				str = in.next();
				
				if(str.equalsIgnoreCase("V")) {
					System.out.println("Equal to Indian Veg Dishes");
					System.out.println("Indian Veg Dishes\t\t\t Price in Rs.");
					
					System.out.println("1.Shahi Paneer\t\t\t\t180");
					System.out.println("2.Navaratna Korma\t\t\t180");
					System.out.println("3.Kadhai Paneer\t\t\t\t150");
					System.out.println("4.Malai Kofta\t\t\t\t140");
					System.out.println("5.Kadhai Vegetables\t\t\t140");
					System.out.println("6.Vegetable Pakeeza\t\t\t140");
					System.out.println("7.Shubanam Curry\t\t\t150");
					System.out.println("8.Malai COrn Palak \t\t\t150");
					
					System.out.println();
					choice="Y";
					
					while(choice.equalsIgnoreCase("Y")) {
						System.out.println("Choose a the order by entering a number :");
						vfd = in.nextInt();
						System.out.println("Enter a quantity :");
						tvfd = in.nextInt();
						if(vfd==1 || vfd==2) {
							amt = tvfd *180;
						}
						if( vfd==3 || vfd==7  ||vfd==8 ) {
							amt = tvfd *150;
						}
						if( vfd==4 || vfd==5  ||vfd==6  ) {
							amt = tvfd *140;
						}
						
						tamt1 = tamt1+amt;
						
						System.out.println("Do you want to place more order ? Enter Y/N");
						choice = in.next();
					}
					
				}
				
				if(str.equalsIgnoreCase("NV")) {
					System.out.println("Welcome to Indian Non-Veg Dishes!!");
					System.out.println("Indian Non-Veg Dishes\t\t\t Price in Rs.");
					
					System.out.println("1.Chicken Tikka Masala\t\t\t180");
					System.out.println("2.Chicken Tikka Lababdar\t\t180");
					System.out.println("3.Chicken Bharta\t\t\t150");
					System.out.println("4.Chicken Sekh Kabab\t\t\t160");
					System.out.println("5.Kadhai Chicken\t\t\t160");
					System.out.println("6.Mughlai Chicken\t\t\t160");
					System.out.println("7.Murgh Navaratna Kurma\t\t\t170");
					System.out.println("8.Chicken Do Pyaza \t\t\t170");
					
					System.out.println();
					choice="Y";
					
					while(choice.equalsIgnoreCase("Y")) {
						System.out.println("Choose the order by entering a number :");
						vfd = in.nextInt();
						System.out.println("Enter a quantity :");
						tvfd = in.nextInt();
						if(vfd==1 || vfd==2) {
							amt = tvfd *180;
						}
						if( vfd==3 ) {
							amt = tvfd *150;
						}
						if( vfd==4 || vfd==5  ||vfd==6  ) {
							amt = tvfd *160;
						}
						if( vfd==7 || vfd==8) {
							amt = tvfd *170;
						}
						
						tamt1 = tamt1+amt;
						
						System.out.println("Do you want to place more order ? Enter Y/N");
						choice = in.next();
					}
				}
				break;
				
				////////////////////////////////////Deserts///////////////
				
			case 3: 
				System.out.println("Deserts\t\t\t\t\t Price in Rs.");
				System.out.println();
				System.out.println("1.Softy Pineapple\t\t\t110");
				System.out.println("2.Softy Crunchy Chocolate\t\t90");
				System.out.println("3.Chocolate Walnut Brownie\t\t90");
				System.out.println("4.Marble Cake\t\t\t\t70");
				System.out.println("5.Mocha Magic\t\t\t\t90");
				System.out.println("6.Black Forest\t\t\t\t70");
				System.out.println("7.Mango Shake\t\t\t\t90");
				System.out.println("8.Tooty Fruity\t\t\t\t80");
					
					System.out.println();
					choice="Y";
					
					while(choice.equalsIgnoreCase("Y")) {
						System.out.println("Choose your desert by entering your number :");
						d = in.nextInt();
						System.out.println("Enter a total number of quantity you want to buy!!");
						totald = in.nextInt();
						if(d==1 ) {
							damt = totald *110;
						}
						if(d==2 || d==3 || d==5 ||d==7 ) {
							damt = totald *90;
						}
						if(d==4 || d==6 ) {
							damt = totald *70;
						}
						if(d==8 ) {
							damt = totald *80;
						}
						
						tamt2 = tamt2+damt;
						
						System.out.println("Do you want to place more order ? Enter Y/N");
						choice = in.next();
					}
					break;
					default :
						System.out.println("You have entered wrog choice");
				}
				System.out.println("Enter 'Y' to go to Main Menu!!!");
				choice1=in.next();
			}
		
			System.out.println("***************Main Cuisine Restaurant************");
			System.out.println("***************Starter************");
			System.out.println("Total Cost of starter = Rs."+tamt);
			System.out.println("***************Main Course************");
			System.out.println("Total Cost of Main Course = Rs."+tamt1);
			System.out.println("***************Desert************");
			System.out.println("Total Cost of Desert = Rs."+tamt2);
			
			tot= tamt+tamt1+ tamt2;
			
			gst= tot*18.0/100.0;
			
			System.out.println("GST= RS. "+gst);
			gtotal = tot+gst;
			System.out.println("Amount to be paid Rs. "+gtotal);
			
			System.out.println("Thanks for visiting Multicuisine restaurant");
			System.out.println("Your pleasure our comfort!!!");
			System.out.println("Visit Again!!!");
			System.out.println("Program Ends!!!");
		}
		

	}

