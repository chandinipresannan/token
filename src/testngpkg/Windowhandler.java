package testngpkg;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Windowhandler {
	ChromeDriver driver;
	String baseurl="https://demo.guru99.com/popup.php";
@BeforeTest
public void setup()
{
	driver=new ChromeDriver();
	driver.get(baseurl);
}
	@Test
	public void windowhanler()
	{
		String parentwindow=driver.getWindowHandle();
		System.out.println("parent windoe title"+driver.getTitle());
		driver.findElement(By.xpath("/html/body/p/a")).click();
		
	    Set<String>	allwindowhandler=driver.getWindowHandles();	
	    
	    for(String handle:allwindowhandler)
	    {
	    	if(!handle.equalsIgnoreCase(parentwindow)) {
	   
	    	driver.switchTo().window(handle);
	    	driver.findElement(By.xpath("/html/body/form/table/tbody/tr[5]/td[2]/input")).sendKeys("anu123gmail.com");
	    	driver.close();
	    }
	    driver.switchTo().window(parentwindow);
	}

}
}
