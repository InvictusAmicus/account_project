package com.qa.app;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

import org.json.simple.JSONObject;

public class Service 
{
	private int count = 0;
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
	
	public void addToMap(Account account)
	{
		count++;
		map.put(count, account);
	}
	
	public boolean doesExist(int accno)
	{
		return map.containsKey(accno);
	}
	
	public Account getFromMap(int accNo)
	{
			return map.get(accNo);
	}
	
	public void printAsJson()
	{
		/*JSONObject o = */
		try
		{
			JSONObject o = new JSONObject(map);
			String message = o.toJSONString();
			System.out.println(message);
			System.out.println(o);
		} 
		catch (Exception e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public int findAmountOfName(String string) 
	{
		int count = 0;
		JSONObject o = new JSONObject(map);
		Iterator<Account> iterator = o.values().iterator();
		while(iterator.hasNext())
		{
			Account check = iterator.next();
			if(check.getFirstName().equals("Kennedy"))
			{
				count++;
			}
		}
		return count;
	}

	public ArrayList<Account> findAccountsOfName(String string)
	{
		ArrayList<Account> list = new ArrayList<Account>();
		JSONObject o = new JSONObject(map);
		Iterator<Account> iterator = o.values().iterator();
		while(iterator.hasNext())
		{
			Account check = iterator.next();
			if(check.getFirstName().equals("Kennedy"))
			{
				list.add(check);
			}
		}
		return list;
	}
}