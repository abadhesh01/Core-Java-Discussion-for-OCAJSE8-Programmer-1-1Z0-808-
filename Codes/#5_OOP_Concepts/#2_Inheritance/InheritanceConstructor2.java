// Author: Rishabh Geete [Employee Id: 8115808]

// Class 1
// Super class
class Base {
	int x;
	// Constructor of super class
	Base(int _x) {
         x = _x; }
}

// Class 2
// Sub class
class Derived extends Base {

	int y;
	// Constructor of sub class
	Derived(int _x, int _y) {
		super(_x);
		y = _y;
	}

	// Method of sub class
	void Display() {
		System.out.println("x = " + x + ", y = " + y);
	}
}

public class InheritanceConstructor2 {

	// Main driver method
	public static void main(String[] args) {
		Derived d = new Derived(10, 20);
		d.Display();
	}
}
