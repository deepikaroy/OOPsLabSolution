package com.greatlearning.utility;
import java.util.Random;

public class PasswordGenerator
{
	public static char[] GeneratePassword(int length)
	{		
		String chars = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz!@#$%&+-=";
		Random rnd = new Random();
		char[] pwd = new char[length];
		
		for(int i=0; i<pwd.length; i++)
		{
			pwd[i] = chars.charAt(rnd.nextInt(chars.length()));
		}
		
		return pwd;
	}
}
