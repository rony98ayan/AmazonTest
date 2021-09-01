package com.qa.test.AmazonTest;

import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class listener {
	public ExtentTest Xtest;
	public void tearDown(ITestResult result)
	{
		
		if(result.getStatus()==ITestResult.FAILURE)
		{
			Xtest.log(Status.FAIL,"The status failed is"+result.getName());
			Xtest.log(Status.FAIL,"The status failed is"+result.getThrowable());
		}
		else if(result.getStatus()==ITestResult.SUCCESS)
		{
			Xtest.log(Status.PASS, "The status passed is"+result.getName());
		}
		else if(result.getStatus()==ITestResult.SKIP)
		{
			Xtest.log(Status.SKIP, "The status skipped is"+ result.getName());
		}
	}
}

