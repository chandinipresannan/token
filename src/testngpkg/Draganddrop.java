package testngpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Draganddrop {
 ChromeDriver driver;
 String baseurl="https://demo.guru99.com/test/drag_drop.html";
@BeforeTest
public void setup()
{
	driver=new ChromeDriver();
	driver.get(baseurl);
}
@Test
public void dragdrop()
{
	WebElement bank=driver.findElement(By.xpath("//*[@id=\"credit2\"]/a"));
	WebElement cash=driver.findElement(By.xpath("//*[@id=\"fourth\"]/a"));
	WebElement account1=driver.findElement(By.xpath("//*[@id=\"bank\"]/li"));
	WebElement amount1=driver.findElement(By.xpath("//*[@id=\"amt7\"]/li"));
	
	WebElement sales=driver.findElement(By.xpath("//*[@id=\"credit1\"]/a"));
	WebElement cash1=driver.findElement(By.xpath("//*[@id=\"fourth\"]/a"));
	WebElement account2=driver.findElement(By.xpath("//*[@id=\"loan\"]/li"));
	WebElement amount2=driver.findElement(By.xpath("//*[@id=\"amt8\"]/li"));
	
	
	Actions act=new Actions(driver);
	act.dragAndDrop(bank,account1);
	act.dragAndDrop(cash,amount1);
	act.dragAndDrop(sales,account2);
	act.dragAndDrop(cash1,amount2);
	act.perform();
	
	boolean le=driver.findElement(By.xpath("//*[@id=\"equal\"]/a")).isDisplayed();
	if(le)
	{
		System.out.println("perferct displayed");
	}
	else
	{
		System.out.println("not perfect");
	}
}
}
