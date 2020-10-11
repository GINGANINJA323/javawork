package uk.ac.uos.i2p.s201951;

public class DataTypeWork {
	
	public static void main(String[] args) {
		
		// Part 1:

		int a = 1;
		int b = 2;
		int c = a + b;
		
		System.out.println(a + " + " + b + " = " + c);
		
		//Part 2: 
		
		int d = 1;
		int e = 2;
		int f = d * e;
		
		System.out.println(d + " * " + e + " = " + f);
		
		//Part 3:
		
		String name = "Ed";
		
		System.out.println("Hello, " + name);
		
		//Part 4:
		
		int num1 = 2;
		int num2 = 3;
		int num3 = 4;
		int secBuffer;
		
		System.out.println("Number 1: " + num1 + " Number 2: " + num2 + " Number 3: " + num3);
		
		secBuffer = num1;
		num1 = num3;
		num3 = num2;
		num2 = secBuffer;
		
		System.out.println("Number 1: " + num1 + " Number 2: " + num2 + " Number 3: " + num3);
		
		
	}

}
