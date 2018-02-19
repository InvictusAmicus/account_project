package com.qa.app;


public class Account
{
	private String firstName;
	private String lastName;
	private int accNo;
	
	public Account(String fn, String ln, int acc)
	{
		firstName = fn;
		lastName = ln;
		accNo = acc;
	}
	
	public String getFirstName()
	{
		return firstName;
	}
	
	public String getLastName()
	{
		return lastName;
	}
	
	public int getAccNo()
	{
		return accNo;
	}
	
	public String toString()
	{
		return firstName + " " + lastName;
		
	}
	
}
