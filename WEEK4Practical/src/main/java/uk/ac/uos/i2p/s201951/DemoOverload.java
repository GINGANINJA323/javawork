package uk.ac.uos.i2p.s201951;

class DemoOverload {

	int value1;
	int value2;
	
	DemoOverload() {
		value1 = 10;
		value2 = 20;
		
		System.out.println("Inside 1st constructor.");
	}
	
	DemoOverload(int a) {
		value1 = a;
		System.out.println("Inside 2nd constructor.");
	}
	
	DemoOverload(int a, int b) {
		value1 = a;
		value2 = b;
		System.out.println("Inside 3rd constructor.");
	}
	
	public void display() {
		System.out.println("Value1 === " + value1);
		System.out.println("Value2 === " + value2);
	}
	
	public static void main(String args[]) {
		DemoOverload d1 = new DemoOverload();
		DemoOverload d2 = new DemoOverload(30);
		DemoOverload d3 = new DemoOverload(30, 40);
		d1.display();
		d2.display();
		d3.display();
	}
	
}
