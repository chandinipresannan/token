package textpkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pagepkg.Fbclickpage;

public class Fbtestclick {

	WebDriver driver;
	@BeforeTest
	public void setup() {
	
	 driver=new ChromeDriver();
	 driver.get("https://www.facebook.com");
	
	}
	@Test
	public void test()
	{
		Fbclickpage ob=new Fbclickpage(driver);
		ob.click();
		String actual=ob.titileverification();
		Assert.assertEquals(actual, "Facebook");
		ob.sign();
		
		
	}
}
