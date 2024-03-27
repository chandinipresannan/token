package junitpkg;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class Junitdemo {
	ChromeDriver driver;
	String baseurl="https://www.facebook.com";
  @Before
	public void beforetest()
	{
	 driver=new ChromeDriver();
	 driver.get(baseurl);
	}
  @Test
  public void test()
  {
	  String sr="Facebook";
	  String s=driver.getTitle();
	  if(s.contains(sr))
	  {
		  System.out.println("pass");
	  }
	  else
	  {
		  System.out.println("fail");
	  }
  }
  @After
  public void aftertest()
  {
	  driver.quit();
  }
  
}
