package trial;

import java.util.Scanner;
//import Scanner to help read user input
public class input {

	public input() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter your name");//taking the user name
		String firstName = sc.nextLine();
		System.out.println("Please enter your surname");//taking the user surname
		String surName = sc.nextLine();
		System.out.println("Please enter your telephone number");//taking the user telephone number
		String telephoneNumber = sc.nextLine();/* all inputs are strings because the user
		may choose to enter the country code as part of telephone number*/
		
		
		if (firstName.isEmpty() || surName.isEmpty()  ) {
			System.out.println("Either your name or surname field is empty!!");
			/*user is made aware that he/she did not fill either of their names*/
		}
		else if (telephoneNumber.length() > 0) {
			System.out.println(firstName + " your telephone number is " + telephoneNumber);
			/*this segment is executed if all fields are filled*/
		}
		else {
			System.out.println(firstName + " is your name, but you did not enter your telephone number!"); 
			//this segment is executed if names are filled but not the telephone number
		}
	}

}
