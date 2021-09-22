package com.testyantra.maven.createTest;

import org.testng.annotations.Test;

public class CreateContactTest {

	@Test(groups="SmokeTest")
	public void createContact()
	{
		System.out.println("Execution of createContact");
	}
	
	@Test(groups="RegressionTest")
	public void createContactWithOrg()
	{
		System.out.println("Execution of createContactWithOrg");
	}
	
	@Test(groups="RegressionTest")
	public void createContactWithOpp()
	{
		System.out.println("Execution of createContactWithOpp");
	}
}
