package uk.ac.uos.i2p.s201951;

public class ConditionalWork {
	
	public static void main(String[] args) {
		
		// Part 1:
		
		int age = 21;
		boolean enrolled = true;
		
		if (age >= 21 && enrolled) {
			System.out.println("Allowed.");
		} else {
			System.out.println("Not allowed.");
		}
		
		// Part 2:
		
		int module1 = 60;
		int module2 = 60;
		boolean passed = false;
		
		if (module1 > 50 && module2 > 50) {
			System.out.println("Passed!");
			passed = true;
		} else if (module1 > 50 ^ module2 > 50) {
			System.out.println("Retake!");
		} else {
			System.out.println("Failed!");
		}
		
		if (passed) { //Implied boolean check.
			System.out.println("Congratulations!");
		}
	}

}
