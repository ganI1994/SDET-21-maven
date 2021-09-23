package com.testyantra.maven.createTest;

import org.testng.annotations.Test;

public class CreateContactTest {

	@Test(groups="SmokeTest")
	public void createContact()
	{
		System.out.println("Execution of createContact");
		String BROWSER=System.getProperty("browser");
		System.out.println(BROWSER);
	}
	
	@Test(groups="RegressionTest")
	public void createContactWithOrg()
	{
		System.out.println("Execution of createContactWithOrg");
		String ENV=System.getProperty("env");
		System.out.println(ENV);
	}
	
	@Test(groups="RegressionTest")
	public void createContactWithOpp()
	{
		System.out.println("Execution of createContactWithOpp");
	}
	@Test(groups="RegressionTest")
	public void createContactWithLead()
	{
		System.out.println("Execution of createContactWithLead");
	}
}
