package com.greatlearning.model;

import java.util.Scanner;

public class Employee
{
	private String firstName;
	private String lastName;
	private String department;
	
	public Employee(String firstName, String lastName)
	{
		this.firstName = firstName;
		this.lastName = lastName;
	}	

	public String getLastName()
	{
		return lastName;
	}

	public String getFirstName()
	{
		return firstName;
	}

	public void selectDepartment()
	{	
		System.out.println("Please enter the department from the following: ");
		System.out.println("1.Technical");
		System.out.println("2. Admin");
		System.out.println("3. Human Resouce");
		System.out.println("4. Legal");

		Scanner sc = new Scanner(System.in);
		int choice = sc.nextInt();	

		switch(choice)
		{
			case 1:  department = "technical"; 
				break;
			case 2:  department = "admin";
			break;
			case 3:  department = "humanresouce";
			break;
			case 4:  department = "legal";
			break;
			default: department = null;
			break;
		}		
	}

	public String getDepartment()
	{
		return department;
	}

}
