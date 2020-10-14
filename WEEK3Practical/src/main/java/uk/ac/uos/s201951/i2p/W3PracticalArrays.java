package uk.ac.uos.s201951.i2p;

import java.util.Scanner;

public class W3PracticalArrays {
	
	static void arrayManipulation() {
		
		// Array reverse and looping.
		
		int[] c = new int[10];
		
		for (int i = 0; i < 10; i++) {
			c[i] = i + 1;
			System.out.println("Array index " + i + " : " + c[i]);
		}
		
		int[] reverseC = new int[10];
		int j = reverseC.length;
		
		for (int r = 0; r < reverseC.length; r++) {
			reverseC[j - 1] = c[r];
			j--;
		}
		
		for (int x = 0; x < reverseC.length; x++) {
			System.out.println("Reversed array index " + x + " : " + reverseC[x]);
		}
	}
	
	static void credentialCheck() {
		
		// Checks arrays for valid login input.

		String[] usernames = {"David", "Jim", "JJ"};
		String[] passwords = {"Password1", "Hello", "AnotherPassword"};
		Scanner userIn = new Scanner(System.in);

		System.out.print("Enter a username: ");
		String username = userIn.nextLine();
		System.out.print("Enter a password: ");
		String password = userIn.nextLine();
		
		for(int i = 0; i < usernames.length; i++) {
			if (usernames[i].equals(username) && passwords[i].equals(password)) {
				System.out.println("Welcome!");
				userIn.close();
				return;
			}
		}
		
		System.out.println("Login failed.");
		userIn.close();
		
	}
	
	static void nameCount() {
		
		// Names and their lengths
		
		String[] friends = {"Rick", "Lee"};
		int nameLength = 0;
		
		System.out.println("I have " + friends.length + " friends.");
		
		for(int i = 0; i < friends.length; i++) {
			nameLength = nameLength + friends[i].length();
		}
		
		System.out.println("Between them my friends have " + nameLength + " characters in their names.");
	}
	
	static void basicArrays() {
		
		// Init and array looping.

		int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		
		int[] b = new int[10];
		
		for (int i = 0; i < 10; i++) {
			b[i] = i;
		}
		
	}

	public static void main(String[] args) {
		basicArrays();
		credentialCheck();
		nameCount();
		arrayManipulation();
	}

}
