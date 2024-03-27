package testngpkg;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Assertionpgm {
	ChromeDriver driver;
	String baseurl="https://www.facebook.com";
	@BeforeMethod
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get(baseurl);
	}
	@Test
	public void titileverification()
	{
		String exp="facebook";
		String act=driver.getTitle();
		Assert.assertEquals(act, exp);
		
	System.out.println("test1");
	}
				

}
