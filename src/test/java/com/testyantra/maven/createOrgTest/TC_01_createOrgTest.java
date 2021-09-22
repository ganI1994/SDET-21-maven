package com.testyantra.maven.createOrgTest;

import org.testng.annotations.Test;

public class TC_01_createOrgTest {

	@Test(groups="SmokeTest")
	public void createOrg()
	{
		System.out.println("Execution of createOrg");
	}
	
	@Test(groups="RegressionTest")
	public void createOrgWithInd()
	{
		System.out.println("Execution of createOrgWithInd");
	}
	
	@Test(groups="SmokeTest")
	public void createOrgWithOpp()
	{
		System.out.println("Execution of createOrgWithOpp");
	}
}
