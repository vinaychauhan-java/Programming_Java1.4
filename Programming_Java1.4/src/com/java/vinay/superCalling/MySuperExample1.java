package com.java.vinay.superCalling;

class A {

	public A(String value) {
		System.out.println("Value from A is " + value);
	}

	public void getData(String value) {
		System.out.println("Data Value from A is " + value);
	}

}

class B extends A {

	public B(String value1, String value2) {
		super(value1);
		System.out.println("Value from B is " + value2);
		super.getData("Hello World");
	}
}

public class MySuperExample1 {

	public static void main(String args[]) {
		B obj = new B("Vipin", "Vinay");
	}
}
