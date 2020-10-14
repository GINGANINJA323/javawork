package uk.ac.uos.s201951.i2p;

import java.util.*;

public class W3PracticalArrayLists {

	static void basicArrayLists() {
		
		// Basic ArrayList stuff.
		
		ArrayList<Integer> example = new ArrayList<Integer>();
		
		example.add(1);
		example.add(2);
		example.add(3);
		example.add(4);
		example.add(5);
		example.add(6);
		example.add(7);
		example.add(8);
		example.add(9);
		example.add(10);
		
		System.out.println("ArrayList example: " + example);
		
		ArrayList<Integer> exampleTwo = new ArrayList<Integer>(10);
		
		for (int i = 1; i <= 10; i++) {
			exampleTwo.add(i);
		}
		
		System.out.println("ArrayList exampleTwo: " + exampleTwo);
	}
	
	static void credentialCheck(Scanner userIn) {
		
		// Credential pair check using ArrayLists.
		
		ArrayList<String> usernames = new ArrayList<String>(Arrays.asList("David", "Jim", "JJ"));
		ArrayList<String> passwords = new ArrayList<String>(Arrays.asList("Password1", "Hello", "AnotherPassword"));
		
		System.out.print("Enter a username: ");
		String username = userIn.nextLine();
		System.out.print("Enter a password: ");
		String password = userIn.nextLine();
		
		for(int i = 0; i < usernames.size(); i++) {
			if (usernames.contains(username) && passwords.get(usernames.indexOf(username)).equals(password)) {
				System.out.println("Welcome!");
				return;
			}
		}
		
		System.out.println("Login failed.");
	}
	
	static int randomNumberGenerator(int max) {
		
		// Creates random ints using nextInt.
		
		Random rng = new Random();
		int x = rng.nextInt(max + 1); // + 1 for consistent inclusivity.
		
		if (x == 0) {
			return 1; // as nextInt starts for 0 (inclusive), return 1 instead to satisfy task requirements.
		}
		
		return x;
	}
	
	static void squaring() {
		
		// ArrayLists used to square and print values.
		
		ArrayList<Integer> numbers = new ArrayList<Integer>(100);
		ArrayList<Integer> squareNumbers = new ArrayList<Integer>(100);
		
		for (int i = 0; i <= 100; i++) {
			numbers.add(i, randomNumberGenerator(1000));
			squareNumbers.add(i, numbers.get(i) * numbers.get(i));
			System.out.println(numbers.get(i) + " squared is " + squareNumbers.get(i));
		}
	}
	
	static void searchArrayList(Scanner userIn) {
		
		// Search through ArrayList of cities.
		
		ArrayList<String> cities = new ArrayList<String>(Arrays.asList("Brussels", "Paris", "London", "Cairo", "Mombasa", "Edinburgh", "Berlin", "Belfast", "Warsaw", "Washington D.C"));
		
		System.out.print("City search: ");
		String userSearch = userIn.nextLine();
		
		if (cities.contains(userSearch)) {
			int searchIndex = cities.indexOf(userSearch);
			System.out.println("Result: " + cities.get(searchIndex) + " at " + searchIndex);
		} else {
			System.out.println("Not found.");
		}
	}
	
	public static void main(String[] args) {
		basicArrayLists();
		squaring();
		
		// Use one scanner for efficiency.
		
		Scanner userIn = new Scanner(System.in);
		
		credentialCheck(userIn);
		searchArrayList(userIn);
		
		userIn.close();
	}

}
