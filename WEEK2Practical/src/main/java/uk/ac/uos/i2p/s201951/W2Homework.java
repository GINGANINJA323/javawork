package uk.ac.uos.i2p.s201951;

public class W2Homework {

	public static void main(String[] args) {
		
		//Homework 1-1: solution using standard if/else ladder.
		
		int n = 3;
		int modN = n % 2;
		
		if (modN > 0) {
			System.out.println("ODD");
		} else if (modN == 0 && n < 6) {
			System.out.println("Low even");
		} else {
			System.out.println("High even");
		}
		
		//Homework 1-2: solution using nested if/else.
		
		if (modN == 0) {
			if (n < 6) {
				System.out.println("Low even");
			} else {
				System.out.println("High even");
			}
		} else {
			System.out.println("ODD");
		}
		
		//Homework 2-1: Password system using if/else.
		
		String password = "winter";
		
		if (password == "winter") {
			System.out.println("Open window.");
		} else if (password == "summer") {
			System.out.println("Open door");
		} else {
			System.out.println("DESTRUCT");
		}
		
		//Homework 2-2: Password system using switch case.
		
		switch (password) {
		case "summer":
			System.out.println("Open door");
			break;
		case "winter":
			System.out.println("Open window");
			break;
		default:
			System.out.println("DESTRUCT");
		}
		
		//Homework 3: Advice switch
		
		String country = "USA";
		
		switch (country) {
		case "UK":
			System.out.println("Likes tea.");
			break;
		case "USA":
			System.out.println("Fast cars.");
			break;
		case "China":
			System.out.println("Very big.");
			break;
		case "France":
			System.out.println("Good food.");
			break;
		default:
			System.out.println("No advice available.");
		}
	}

}
