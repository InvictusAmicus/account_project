package com.qa.app;

import java.util.HashMap;

public class Service 
{
	private static int count = 0;
	private static Service instance;
	private HashMap<Integer, Account> map;
	
	private Service()
	{
		map = new HashMap<Integer, Account>();		
	}
	
	public static Service getInstance()
	{
		if(instance == null)
		{
			instance = new Service();
		}
		return instance;
	}
	
	public void addToMap(Account a)
	{
		count++;
		map.put(count, a);
	}
	
	public boolean doesExist(int accno)
	{
		return map.containsKey(accno);
	}
	
	public Account getFromMap(int accNo)
	{
			return map.get(accNo);
	}

}
