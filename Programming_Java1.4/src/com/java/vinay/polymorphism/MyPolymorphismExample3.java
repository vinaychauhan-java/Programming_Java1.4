package com.java.vinay.polymorphism;

@SuppressWarnings("serial")
class GenericException extends Exception
{

	public GenericException(String exceptionMessage)
	{
		super(exceptionMessage);
	}
}

@SuppressWarnings("serial")
class BusinessException extends GenericException
{

	public BusinessException(String exceptionMessage)
	{
		super(exceptionMessage);
	}
}

@SuppressWarnings("serial")
class AnotherException extends Exception
{

	public AnotherException(String exceptionMessage)
	{
		super(exceptionMessage);
	}
}

class X
{

	public void showMessage(String message)
	{
		System.out.println("Message from X Class (showMessage):: " + message);
	}

	// Overloading of the ShowMessage Method with two parameters
	public void showMessage(String message1, String message2)
	{
		System.out.println("Message from X Class (showMessage with two arguments):: " + message1 + " " + message2);
	}

	// private methods will be not be accessible from outside world
	private void showPrivateMessage(String message)
	{
		System.out.println("Message from X Class (showPrivateMessage):: " + message);
	}

	// private methods will be not be accessible from outside world but if extended using higher accessibility then it
	// could be accessed.
	private void showAnotherPrivateMessage(String message)
	{
		System.out.println("Message from X Class (showAnotherPrivateMessage):: " + message);
	}

	// Return Type will never leads to Overloading
	// public String showMessage(String message) {
	// System.out.println(message);
	// return message+" Chauhan";
	// }

	// Throwing an exception will never leads to Overloading
	// public String showMessage(String message) throws Exception{
	// System.out.println(message);
	// return message+" Chauhan";
	// }

	public void showExceptionMessage1(String message)
	{
		System.out.println("Message from X Class (showExceptionMessage1):: " + message);
	}

	public void showExceptionMessage2(String message) throws GenericException
	{
		System.out.println("Message from X Class (showExceptionMessage2):: " + message);
	}
}

class Y extends X
{

	// Cann't reduce the visibility during OverRiding
	// private void showMessage(String message) {
	// System.out.println(message);
	// }

	// private methods will be not be accessible from outside world
	private void showPrivateMessage(String message)
	{
		System.out.println("Message from Y Class (showPrivateMessage):: " + message);
	}

	// Scope can be enlarged during the OverRiding
	protected void showAnotherPrivateMessage(String message)
	{
		System.out.println("Message from Y Class (showAnotherPrivateMessage):: " + message);
	}

	// Will not get compiled if parent class method is not holding the throws clause with the same exception.
	// public void showExceptionMessage1(String message) throws BusinessException{
	// System.out.println(message);
	// }

	// Visibility cannot be reduced
	// protected void showExceptionMessage1(String message){
	// System.out.println(message);
	// }

	// Method will override only when either the same exception/child class exception is used.
	public void showExceptionMessage2(String message) throws BusinessException
	{
		System.out.println("Message from Y Class (showExceptionMessage2):: " + message);
	}

	public void showExceptionMessage3(String message) throws AnotherException
	{
		System.out.println("Message from Y Class (showExceptionMessage2):: " + message);
	}

}

public class MyPolymorphismExample3
{

	public static void main(String[] args)
	{
		Y obj1 = new Y();
		obj1.showMessage("Vinay");
		obj1.showMessage("Vnay", "Chauan");

		// Can't access the private message
		// obj1.showPrivateMessage("Vnay");

		// Could be access as accessibility has been increased in the sub-class
		obj1.showAnotherPrivateMessage("Vnay");

		obj1.showExceptionMessage1("Vinay");
		try
		{
			obj1.showExceptionMessage2("ErrorMessage");
		}
		catch (Exception ex)
		{
			System.out.println(ex);
		}

	}
}
