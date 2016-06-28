package com.java.vinay.accessSpecifiers.extra;

import com.java.vinay.accessSpecifiers.*;

class B extends A
{

	public void getData()
	{
		// getMessage1();
		// getMessage2();
		getMessage3();
		getMessage4();
	}

}

class MyAccessSpecifiersExample1
{

	public static void main(String[] args)
	{

		B obj = new B();
		obj.getData();

		System.out.println();
		System.out.println();
		System.out.print("*****************************");
		System.out.println();
		System.out.println();

		A obj1 = new A();
		// obj1.getMessage1();
		// obj1.getMessage2();
		// obj1.getMessage3();  // Since, getMessage3 will be accessible only by extending the corresponding class
		obj1.getMessage4();

	}
}
