package com.greatlearning.service;

import com.greatlearning.model.Employee;
import com.greatlearning.utility.PasswordGenerator;

public class CredentialService
{
	private final String COMPANY_NAME = "greatLearning";
	private final int PASSWORD_LENGTH = 8;
	private String email = "";
	private String password = "";

	public void generateEmailAddress(String firstNamelastName, String department)
	{
		email= firstNamelastName.toLowerCase() + "@" + department + "." + COMPANY_NAME + ".com";
	}

	public void generatePassword()
	{
		char[] pwd = PasswordGenerator.GeneratePassword(PASSWORD_LENGTH);
		for(int i=0 ; i<pwd.length; i++)
		{
			password += pwd[i];
		}
	}

	public void showCredentials(Employee employee)
	{
		generateEmailAddress(employee.getFirstName() + "" + employee.getLastName(), employee.getDepartment());
		generatePassword();
		
		System.out.println();
		System.out.println("Dear "+ employee.getFirstName() + " your generated credentials are as follows");
		System.out.println("Email --> "+ email);
		System.out.println("Password --> " + password);
	}
}
