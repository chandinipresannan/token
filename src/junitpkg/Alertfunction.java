package junitpkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertfunction {
	ChromeDriver driver;
	String baseurl="file:///C:/Users/Lenovo/Desktop/chandini/Alert.html";

  @Before
	public void beforetest()
	{
	 driver=new ChromeDriver();
	 driver.get(baseurl);
    }
  @Test
  public void test()
  {
	  driver.findElement(By.xpath("/html/body/input[1]")).click();
	  
	  Alert a=driver.switchTo().alert();
	  String alerttext=a.getText();
	  System.out.println("alerttext:"+alerttext);
	  a.accept();
	  driver.findElement(By.xpath("/html/body/input[2]")).sendKeys("anu");
	  driver.findElement(By.xpath("/html/body/input[3]")).sendKeys("p");
	  driver.findElement(By.xpath("/html/body/input[4]")).click();
  }
}
