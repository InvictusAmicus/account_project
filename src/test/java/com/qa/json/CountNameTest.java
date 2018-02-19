package com.qa.json;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

import com.qa.app.Account;
import com.qa.app.Service;

import junit.framework.Assert;

public class CountNameTest {

	
	
	@Test
	public void testNames() 
	{
		Service s = Service.getInstance();
		s.addToMap(new Account("Kennedy","Bowers",20008));
		int number = s.findAmountOfName("Kennedy");
		Assert.assertEquals(1, number);
	}
	@Test
	public void testAccounts()
	{
		Service s = Service.getInstance();
		s.addToMap(new Account("Kennedy","Bowers",20008));
		ArrayList<Account> expected = new ArrayList<Account>();
		expected.add(new Account("Kennedy","Bowers",20008));
		ArrayList<Account> list = s.findAccountsOfName("Kennedy");
		//Assert.assertEquals(1, number);
		Assert.assertEquals(expected, list);
	}

}
