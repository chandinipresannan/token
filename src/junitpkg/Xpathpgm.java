package junitpkg;

import java.time.Duration;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpathpgm {
	ChromeDriver driver;
	String baseurl="https://www.instagram.com";
	@Before
	public void before()
	{ 
		driver=new ChromeDriver();
		driver.get(baseurl);
	}
	@Test
	public void instatest()
	{
		
		driver.findElement(By.xpath("//form[@id='loginForm']/div/div[1]/div/label/input")).sendKeys("abc@gmail.com");
		driver.findElement(By.xpath("//form[@id='loginForm']/div/div[2]/div/label/input")).sendKeys("abc12");
		driver.findElement(By.xpath("//form[@id='loginForm']/div/div[3]")).submit();
	}

}
