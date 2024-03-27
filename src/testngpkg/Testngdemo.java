package testngpkg;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Testngdemo {
//@beforesuite
//@beforetest
//@beforeclass
//@beforemethod
//@test
//@aftermethod
//@afterclass
//@aftertest
//@aftersuite
	
	@BeforeTest
	public void setup()
	{
		System.out.println("browser open");
	}
	@BeforeMethod
	public void urlloading()
	{
		System.out.println("url loading");
	}
	@Test(priority=2,invocationCount = 3)
	public void test1()
	{
		System.out.println("test1");
	}
	@Test(priority = 1)
	public void test2()
	{
		System.out.println("test2");
	}
	@Test(priority=3,enabled=false)
	public void test3()
	{
		System.out.println("test3");
	}
	@AfterMethod
	public void aftermethod()
	{
		System.out.println("after method");
	}
	@AfterTest
	public void aftertest() {
		System.out.println("after test");
	}
	

}
