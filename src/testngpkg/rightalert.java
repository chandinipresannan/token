package testngpkg;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class rightalert {
	ChromeDriver driver;
	String baseurl="https://demo.guru99.com/test/simple_context_menu.html";
	@BeforeTest
	public void setup() 
	{
		driver=new ChromeDriver();
		driver.get(baseurl);
	}
	@Test
	public void righttest()
	{
		 
		WebElement ele=driver.findElement(By.xpath("//*[@id=\"authentication\"]/span"));
		WebElement edit=driver.findElement(By.xpath("//*[@id=\"authentication\"]/ul/li[1]/span"));
		WebElement doub=driver.findElement(By.xpath("//*[@id=\"authentication\"]/button"));
		Actions act=new Actions(driver);
		act.contextClick(ele);
		act.click(edit);
		act.perform();
		Alert a=driver.switchTo().alert();
		a.accept();
		act.doubleClick(doub);
		act.perform();
		String alerttext=a.getText();
		System.out.println("alerttext:"+alerttext);
		a.accept();
		
		
	}
}
