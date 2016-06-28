package com.java.vinay.exception;

@SuppressWarnings("serial")
class BusinessLogicException extends Exception
{

	public BusinessLogicException(String exceptionValue)
	{
		super(exceptionValue);
	}
}

public class MyExceptionExample1
{

	public static void computeBusinessLogic(int value) throws BusinessLogicException
	{
		if (value > 5)
		{
			throw new BusinessLogicException("Input Value is Greater");
		}
	}

	public static void main(String args[])
	{
		int a = 6;
		try
		{
			computeBusinessLogic(a);
		}
		catch (Exception exception)
		{
			System.out.println(exception);
		}
		finally
		{
			System.out.println("Finally will run always");
		}

		float b = 0.0f;
		try
		{
			b = 5 / 0;
		}
		catch (ArithmeticException arithmeticException)
		{
			System.out.println("arithmeticException  :: " + arithmeticException);
		}
		System.out.println("Value of b is " + b);
		
		try
		{
			b = 5 / 1;
		}
		finally
		{
			System.out.println("Finally can be used without catch");
		}

		System.out.println("Value of b is " + b);

	}
}