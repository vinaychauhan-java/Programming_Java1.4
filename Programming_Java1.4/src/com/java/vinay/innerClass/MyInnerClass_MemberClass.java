package com.java.vinay.innerClass;

class Outer
{

	private int i = 10;
	private static int j = 20;

	class InnerClass1
	{

		public InnerClass1()
		{
			System.out.println("Inner Class1 constructor");
		}

		public void getInnerClass1Data()
		{
			System.out.println("Inner Class1 Calling and value of i is " + i);
		}
	}

	static class InnerClass2
	{

		public InnerClass2()
		{
			System.out.println("Inner Class2 constructor");
		}

		public static void getInnerClass2Data()
		{
			// Cannot make a static reference to the non-static field i
			// System.out.println("Inner Class2 Calling and value of i is " + i);
			System.out.println("Inner Class2 (getInnerClass2Data) Calling and value of j is " + j);
		}

		// Cannot access directly and will be accessed using object
		public void getInnerClass2AnotherData()
		{
			System.out.println("Inner Class2 (getInnerClass2AnotherData) Calling and value of j is " + j);
		}
	}

	public void getOuterClassData()
	{
		System.out.println("Outer Class Calling");

		InnerClass1 obj = new InnerClass1();
		obj.getInnerClass1Data(); // Calling the method of Inner Class

		InnerClass2 obj1 = new InnerClass2();
		obj1.getInnerClass2Data(); // Calling the method of Static Inner Class
		obj1.getInnerClass2AnotherData();

		InnerClass2.getInnerClass2Data(); // Calling the method of Static Inner Class directly
	}
}

public class MyInnerClass_MemberClass
{

	public static void main(String args[])
	{
		Outer obj = new Outer();
		obj.getOuterClassData();

		// Outer.InnerClass1 obj1 = obj.new InnerClass1();
		Outer.InnerClass1 obj1 = new Outer().new InnerClass1();
		obj1.getInnerClass1Data();

		Outer.InnerClass2 obj2 = new Outer.InnerClass2();
		obj2.getInnerClass2Data();

	}
}
