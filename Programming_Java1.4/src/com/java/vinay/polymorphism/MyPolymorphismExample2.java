package com.java.vinay.polymorphism;

class Vipin
{

	public void getMessage()
	{
		System.out.println("Message1");
	}
}

class Vinay extends Vipin
{

	public void getMessage()
	{
		System.out.println("Message2");
	}
}

class MyPolymorphismExample2
{

	public static void main(String[] args)
	{
		Vinay obj = new Vinay();
		obj.getMessage();

		Vipin obj1 = new Vipin();
		obj1.getMessage();

		obj1 = new Vinay();
		obj1.getMessage();
	}
}
