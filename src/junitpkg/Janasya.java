package junitpkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Janasya {
	ChromeDriver driver;
	String baseurl="https://www.janasya.com";

  @Before
	public void beforetest()
	{
	 driver=new ChromeDriver();
	 driver.get(baseurl);
	 driver.manage().window().maximize();
	}
  @Test
  public void search()throws InterruptedException
  {
	  Thread.sleep(1000);
	  driver.findElement(By.xpath("//div[@id='HeaderNavigation']/nav/ul/li[1]/a/span")).click();
	  //driver.navigate().back();
	  driver.findElement(By.xpath("//*[@id='halo-sidebar']/div[2]/div[1]/div[1]/h3")).click();
	  driver.findElement(By.xpath("//*[@id='halo-sidebar']/div[2]/div[1]/div[2]/div/ul/li[1]/a/span")).click();
	  
  }
}
  
