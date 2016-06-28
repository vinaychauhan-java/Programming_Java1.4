package com.java.vinay.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

// Sorting a list of Objects in java
public class VinayPrg1
{

	public static void main(String[] args)
	{
		int[] intArr =
		{5, 9, 1, 10};
		Arrays.sort(intArr);
		System.out.println(Arrays.toString(intArr));

		// sorting String array
		String[] strArr =
		{"A", "C", "B", "Z", "E"};
		Arrays.sort(strArr);
		System.out.println(Arrays.toString(strArr));

		List<String> strList = new ArrayList<String>();
		strList.add("A");
		strList.add("C");
		strList.add("B");
		strList.add("Z");
		strList.add("E");
		// using Collections.sort() to sort ArrayList
		Collections.sort(strList);
		for (String str : strList)
			System.out.print(" " + str);
	}
}
