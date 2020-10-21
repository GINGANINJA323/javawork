package uk.ac.uos.i2p.s201951;

class DemoChain {
	
	int value1;
	int value2;
	
	DemoChain() {
		value1 = 1;
		value2 = 2;
		
		System.out.println("Inside 1st constructor");
	}
	
	DemoChain(int a) {
		value1 = a;
		System.out.println("Inside 2nd constructor.");
	}
	
	public void display() {
		System.out.println("Value1 === " + value1);
		System.out.println("Value2 === " + value2);
	}
	
	public static void main(String args[]) {
		DemoChild d1 = new DemoChild();
		d1.display();
	}
}

class DemoChild extends DemoChain {
	int value3;
	int value4;
	
	DemoChild() {
		super(5);
		
		value3 = 3;
		value4 = 4;
		System.out.println("Inside Child constructor");
	}
	
	public void display() {
		System.out.println("Value1 === " + value1);
		System.out.println("Value2 === " + value2);
		System.out.println("Value3 === " + value3);
		System.out.println("Value4 === " + value4);
	}
}
