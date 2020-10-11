package uk.ac.uos.i2p.s201951;

public class ConditionalWork {
	
	public static String printOutcome(boolean outcome, String name) {
		if (outcome) {
			return("Condition " + name + " is true");
		} else {
			return("Condition " + name + " is false");
		}
	}
	
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
		
		//Part 3:
		
		boolean i1 = false;
		boolean i2 = true;
		boolean i3 = true;
		
		if (i1 || i2 || i3) {
			System.out.println("A");
			System.out.println(printOutcome(i1, "i1"));
			System.out.println(printOutcome(i2, "i2"));
			System.out.println(printOutcome(i3, "i3"));
		}
		
		if (i1 && i2 && i3) {
			System.out.println("B");
			System.out.println(printOutcome(i1, "i1"));
			System.out.println(printOutcome(i2, "i2"));
			System.out.println(printOutcome(i3, "i3"));
		}
		
		if (i1 || (i2 && i3)) {
			System.out.println("C");
			System.out.println(printOutcome(i1, "i1"));
			System.out.println(printOutcome(i2, "i2"));
			System.out.println(printOutcome(i3, "i3"));
		}
		
		if ((i1 && i2) || (i2 && i3)) {
			System.out.println("D");
			System.out.println(printOutcome(i1, "i1"));
			System.out.println(printOutcome(i2, "i2"));
			System.out.println(printOutcome(i3, "i3"));
		}
		
		if ((i1 && (i2 || i3)) || (i2 && i3)) {
			System.out.println("E");
			System.out.println(printOutcome(i1, "i1"));
			System.out.println(printOutcome(i2, "i2"));
			System.out.println(printOutcome(i3, "i3"));
		}
		
		if ((i1 && i2) && i3 == false) {
			System.out.println("F");
			System.out.println(printOutcome(i1, "i1"));
			System.out.println(printOutcome(i2, "i2"));
			System.out.println(printOutcome(i3, "i3"));
		}
		
	}

}
