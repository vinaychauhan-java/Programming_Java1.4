package com.java.vinay.innerClass;

interface MyContents1
{
	public String getdata();
}

abstract class MyContents2
{
	public abstract String getdata();
}

class MyContents3
{
	public String getdata(){
		return "Default Value";
	}
}

class MyClass
{
	public MyContents1 getMyClassData1()
	{
		return new MyContents1()
		{
			private String data = "Vipin Chauhan from Interface";
			public String getdata()
			{
				return data;
			}
		};
	}
	public MyContents2 getMyClassData2()
	{
		return new MyContents2()
		{
			private String data = "Vipin Chauhan from Abstract Class";
			public String getdata()
			{
				return data;
			}
		};
	}
	public MyContents3 getMyClassData3()
	{
		return new MyContents3()
		{
			private String data = "Vipin Chauhan from Default Value";
//			public String getdata()
//			{
//				return data;
//			}
		};
	}
}

public class MyInnerClass_Anonymous
{

	public static void main(String[] args)
	{
		MyClass obj = new MyClass();
		System.out.println("Value is : "+obj.getMyClassData1().getdata());
		System.out.println("Value is : "+obj.getMyClassData2().getdata());
		System.out.println("Value is : "+obj.getMyClassData3().getdata());
	}
}
