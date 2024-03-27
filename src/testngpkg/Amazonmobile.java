package testngpkg;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Amazonmobile {
ChromeDriver driver;
String baseurl="https://www.amazon.in/?&tag=googhydrabk1-21&ref=pd_sl_7hz2t19t5c_e&adgrpid=155259815513&hvpone=&hvptwo=&hvadid=678802104188&hvpos=&hvnetw=g&hvrand=2059173055970201611&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9149272&hvtargid=kwd-10573980&hydadcr=14453_2371562&gad_source=1";

@BeforeTest
public void setup()
{
  driver=new ChromeDriver();
  driver.get(baseurl);
}
@Test
public void amazonmobile() throws Exception
{
	driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("mobiles",Keys.ENTER);
	String exp="Amazon.in : mobiles";
	String act=driver.getTitle();
	if(exp.equals(act))
	{
		System.out.println("Title match");
		
	}
	else
	{
		System.out.println("Title not match");
	}
	String parentwindow=driver.getWindowHandle();
	System.out.println("parent windoe title"+driver.getTitle());
	driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[6]/div/div/span/div/div/div/div[1]/div/div[2]/div/span/a/div/img")).click();
	
	Set<String>	allwindowhandler=driver.getWindowHandles();	
	
    
    for(String handle:allwindowhandler)
    {
    	if(!handle.equalsIgnoreCase(parentwindow))
    	{
         driver.switchTo().window(handle);
         Thread.sleep(3000);
         driver.findElement(By.xpath("//*[@id=\"add-to-cart-button\"]")).click();
         Thread.sleep(3000);
         driver.close();
    	}
    	driver.switchTo().window(parentwindow);
    	}
}
}
