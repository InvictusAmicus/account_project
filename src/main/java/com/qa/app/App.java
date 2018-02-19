package com.qa.app;

public class App 
{
	private static Service service = Service.getInstance();
		
	public static void main(String[] args)
	{
		service.addToMap(new Account("John", "Gordon", 1));
		service.addToMap(new Account("Tony", "Shannon", 2));
		
		int accNo = 1;
	//	printAcc(accNo);
		accNo = 3;
	//	printAcc(accNo);
		
		service.printAsJson();
		
	}

	private static void printAcc(int accNo)
	{
		if(service.doesExist(accNo))
		{
			System.out.println(service.getFromMap(accNo));
		}
		else
		{
			System.out.println("Account doesn't exist");
		}
	}
}
