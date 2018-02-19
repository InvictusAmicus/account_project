package com.qa.json;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

import com.qa.app.Account;
import com.qa.app.Service;

import junit.framework.Assert;

public class CountNameTest {

	Account a;
	
	@Before
	public void init()
	{
		a = new Account("Kennedy","Bowers",20008);
	}
	
	@Test
	public void testNames() 
	{
		Service s = Service.getInstance();
		s.addToMap(a);
		int number = s.findAmountOfName("Kennedy");
		Assert.assertEquals("Not 1", 1, number);
		System.out.println(number);
	}
}
