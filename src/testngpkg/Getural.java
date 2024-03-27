package testngpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Getural {
	ChromeDriver driver;
	String baseurl="https://automationexercise.com/login";
	@BeforeTest
	public void setup()
	{
		driver= new ChromeDriver();
		driver.get(baseurl);	
	}
	@Test
	public void geturl()
	{
		driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[1]/div/form/input[2]")).sendKeys("chandinipresannan@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[1]/div/form/input[3]")).sendKeys("Anukutty");
		driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[1]/div/form/button")).click();
		String expected="https://automationexercise.com/";
		String actual=driver.getCurrentUrl();
		if(expected.equals(actual))
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
	}
			
}
