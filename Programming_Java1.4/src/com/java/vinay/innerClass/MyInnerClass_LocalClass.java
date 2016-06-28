package com.java.vinay.innerClass;

class Outer1
{

	private int i = 10;

	public void getOuterClassData()
	{
		System.out.println("Outer Class Calling");
		abstract class Inner1
		{

			public abstract void getInner2ClassData();

			public void getInner1ClassData()
			{
				System.out.println("Inner Class 1 Calling and value of i is " + i);
			}
		}
		final class Inner2 extends Inner1
		{

			public void getInner2ClassData()
			{
				System.out.println("Inner Class 2 Calling and value of i is " + i);
			}
		}
		
		class Inner3 
		{
			public void getInner3ClassData()
			{
				System.out.println("Inner Class 3 Calling and value of i is " + i);
			}
		}
		Inner2 obj = new Inner2();
		obj.getInner1ClassData();
		obj.getInner2ClassData();
		
		Inner3 obj3 = new Inner3();
		obj3.getInner3ClassData();
	}
}

public class MyInnerClass_LocalClass
{

	public static void main(String args[])
	{
		Outer1 obj = new Outer1();
		obj.getOuterClassData();
	}
}
