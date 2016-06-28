package com.java.vinay.superCalling;

class LetsMakeCall
{

	public LetsMakeCall()
	{
		System.out.println("LetsMakeDefaultCall");
	}

	public LetsMakeCall(String value)
	{
		System.out.println("LetsMakeCall :: " + value);
	}
}

class AA extends LetsMakeCall
{

	// If parentClass is extended and we are using the parameterised constructor
	// then for the successful execution of the program here we have to make either
	// (1) Default Constructor in Parent Class
	// (2) or Have to create a Paramterized Constructor in Parent Class
	public AA(String value)
	{
		// super(value); // Do Comment/UnComment and verify the results
		System.out.println("Value from AA is " + value);
	}

	public void getData(String value)
	{
		System.out.println("Data Value from AA is " + value);
	}

}

class BB extends AA
{

	public BB(String value1, String value2)
	{
		super(value1);
		System.out.println("Value from BB is " + value2);
		super.getData("Hello World");
	}
}

public class MySuperExample2
{

	public static void main(String args[])
	{
		BB obj = new BB("Vipin", "Vinay");
	}
}
