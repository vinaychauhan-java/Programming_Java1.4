package com.java.vinay.polymorphism;

class A
{
	public int Sum(int a, int b)
	{
		return (a + b);
	}

	public int Sum(int a, int b, int c)
	{
		return (a + b + c);
	}

	public float Sum(float a, float b, float c)
	{
		return (a + b + c);
	}
}

class MyPolymorphismExample1
{

	public static void main(String[] args)
	{
		A obj = new A();
		System.out.println("Value is " + obj.Sum(10, 20));
		System.out.println("Value is " + obj.Sum(10, 20, 30));
		System.out.println("Value is " + obj.Sum(10.2f, 20.2f, 30.2f));
	}
}
