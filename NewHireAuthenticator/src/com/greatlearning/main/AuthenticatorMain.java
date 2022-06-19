package com.greatlearning.main;

import java.util.Scanner;

import com.greatlearning.model.Employee;
import com.greatlearning.service.CredentialService;

public class AuthenticatorMain
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter your first name: ");
		String firstName = sc.nextLine();
		System.out.println("Enter your last name: ");
		String lastName = sc.nextLine();

		Employee emp1 = new Employee(firstName, lastName);
		emp1.selectDepartment();
		if(emp1.getDepartment()== null || emp1.getDepartment()== "")
		{
			System.out.println("Please enter valid department id.");
		}
		else
		{		
			CredentialService service = new CredentialService();
			service.showCredentials(emp1);	
		}
	}

}
