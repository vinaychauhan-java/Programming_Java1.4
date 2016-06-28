package com.java.vinay.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class VinayPrg2
{

	public static void main(String[] args)
	{
		Employee[] empArr = new Employee[4];
		empArr[0] = new Employee(10, "Vipin Chauhan", 30, 30000);
		empArr[1] = new Employee(30, "Swastik Chauhan", 18, 20000);
		empArr[2] = new Employee(20, "Ananya Chauhan", 10, 25000);
		empArr[3] = new Employee(40, "Priya Chauhan", 22, 15000);

		Arrays.sort(empArr);
		System.out.println("** Default Sorting of Employees list:\n" + Arrays.toString(empArr));

		// sort employees array using Comparator by Salary
		Arrays.sort(empArr, Employee.SalaryComparator);
		System.out.println("\n** Employees list sorted by Salary:\n" + Arrays.toString(empArr));
		// sort employees array using Comparator by Age
		Arrays.sort(empArr, Employee.AgeComparator);
		System.out.println("\n** Employees list sorted by Age:\n" + Arrays.toString(empArr));
		// sort employees array using Comparator by Name
		Arrays.sort(empArr, Employee.NameComparator);
		System.out.println("\n** Employees list sorted by Name:\n" + Arrays.toString(empArr));

		empArr[1] = new Employee(10, "Vipin Chauhan-101", 30, 30000); // used for creating the Data-Set
		Arrays.sort(empArr, new EmployeeComparatorByIdAndName());
		System.out.println("\n** Employees list sorted by ID and Name:\n" + Arrays.toString(empArr));

		List<Employee> list = new ArrayList<Employee>();
		list.add(new Employee(10, "Vipin Chauhan", 30, 30000));
		list.add(new Employee(30, "Swastik Chauhan", 18, 20000));
		list.add(new Employee(20, "Ananya Chauhan", 10, 25000));
		list.add(new Employee(40, "Priya Chauhan", 22, 15000));
		list.add(new Employee(10, "Vipin Chauhan-101", 30, 30000));
		Collections.sort(list, new EmployeeComparatorByIdAndName());
		System.out.println("\n**  Employees Collection based list sorted by ID and Name:");
		for (Employee emp : list)
		{
			System.out.println(emp);
		}

	}

}

class Employee implements Comparable<Employee>
{

	private int id;
	private String name;
	private int age;
	private long salary;

	public int getId()
	{
		return id;
	}

	public String getName()
	{
		return name;
	}

	public int getAge()
	{
		return age;
	}

	public long getSalary()
	{
		return salary;
	}

	public Employee(int id, String name, int age, int salary)
	{
		this.id = id;
		this.name = name;
		this.age = age;
		this.salary = salary;
	}

	@Override
	public int compareTo(Employee emp)
	{
		// let's sort the employee based on id in ascending order
		// returns a negative integer, zero, or a positive integer as this employee id
		// is less than, equal to, or greater than the specified object.
		return (this.id - emp.id);
	}

	@Override
	// this is required to print the user friendly information about the Employee
	public String toString()
	{
		return "[id=" + this.id + ", name=" + this.name + ", age=" + this.age + ", salary=" + this.salary + "]";
	}

	// All the below implementations of Comparator interface are anonymous classes.
	/**
	 * Comparator to sort employees list or array in order of Salary
	 */
	public static Comparator<Employee> SalaryComparator = new Comparator<Employee>()
	{

		@Override
		public int compare(Employee e1, Employee e2)
		{
			return (int)(e1.getSalary() - e2.getSalary());
		}
	};

	/**
	 * Comparator to sort employees list or array in order of Age
	 */
	public static Comparator<Employee> AgeComparator = new Comparator<Employee>()
	{

		@Override
		public int compare(Employee e1, Employee e2)
		{
			return e1.getAge() - e2.getAge();
		}
	};

	/**
	 * Comparator to sort employees list or array in order of Name
	 */
	public static Comparator<Employee> NameComparator = new Comparator<Employee>()
	{

		@Override
		public int compare(Employee e1, Employee e2)
		{
			return e1.getName().compareTo(e2.getName());
		}
	};
}

class EmployeeComparatorByIdAndName implements Comparator<Employee>
{

	@Override
	public int compare(Employee o1, Employee o2)
	{
		int flag = o1.getId() - o2.getId();
		if (flag == 0)
		{
			flag = o1.getName().compareTo(o2.getName());
		}
		return flag;
	}

}
