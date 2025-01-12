package testngpkg;

import java.io.IOException;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class Reportgeneration {
ExtentHtmlReporter reporter;
ExtentReports extent;
ExtentTest test;
ChromeDriver driver;
String baseurl="https;//www.facebook.com";
 
@BeforeTest
public void beftest()
{
	reporter=new ExtentHtmlReporter("./Report/myreport.html");
	reporter.config().setDocumentTitle("Automationreport");
	reporter.config().setDocumentTitle("functional test");
	reporter.config().setTheme(Theme.DARK);
	extent=new ExtentReports();
	extent.attachReporter(reporter);
	extent.setSystemInfo("hostname", "localhost");
	extent.setSystemInfo("os","window11");
	extent.setSystemInfo("testname","abc");
	extent.setSystemInfo("Browser name","chrome");
	
}
@Test
  public void fbtitileverification()
  {
	test=extent.createTest("fbtitileverification");
	String exp="facebook";
	String act=driver.getTitle();
	Assert.assertEquals(act, exp);
	
}
@AfterTest
public void teardown()
{
	extent.flush();
}

@AfterMethod
public void browserclose(ITestResult result) throws IOException
{
	if(result.getStatus()==ITestResult.FAILURE) {
		test.log(Status.FAIL,"test case failed is"+result.getName());
		test.log(Status.FAIL,"test case failed is"+result.getThrowable());
	}
		else if(result.getStatus()==ITestResult.SKIP)
		{
			test.log(Status.SKIP,"test case skipped is"+result.getName());
		}
		else if(result.getStatus()==ITestResult.SUCCESS)
		{
			test.log(Status.PASS, "test case  passed is"+result.getName());
		}
	}
}

