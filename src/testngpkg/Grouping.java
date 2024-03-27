package testngpkg;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Grouping {
	@BeforeTest
	public void setup()
	{
		System.out.println("browser open");
	}
	@Test(groups = {"smoke"})
	public void test1()
	{
		System.out.println("test1");
	}
	@Test(groups = {"smoke","sanity"})
	public void test2()
	{
		System.out.println("test2");
	}
	@Test(groups = {"regression"})
	public void test3()
	{
		System.out.println("test3");
	}
	@Test(groups = {"sanity"})
	public void test4()
	{
		System.out.println("test4");
	}
	

}
