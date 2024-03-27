package testngpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Fullautomation {

	ChromeDriver driver;
	String baseurl="https://automationexercise.com";
	@BeforeTest
	public void setup()
	{
		driver= new ChromeDriver();
		driver.get(baseurl);	
	}
	@Test
	public void testing()
	{
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[4]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/form/input[2]")).sendKeys("anu");
		driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/form/input[3]")).sendKeys("aabbcc@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/form/button")).click();
		
		driver.findElement(By.xpath("//*[@id=\"id_gender2\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("aabbcc123");
		WebElement day=driver.findElement(By.xpath("//*[@id=\"days\"]"));
		Select daydetails= new Select(day);
		daydetails.selectByValue("22");
		
		WebElement month=driver.findElement(By.xpath("//*[@id=\"months\"]"));
		Select monthdetails= new Select(month);
		monthdetails.selectByVisibleText("June");
		
		WebElement year=driver.findElement(By.xpath("//*[@id=\"years\"]"));
		Select yeardetails= new Select(year);
		yeardetails.selectByValue("2000");
		
//		JavascriptExecutor js=(JavascriptExecutor) driver;
//		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		
		driver.findElement(By.xpath("//*[@id=\"first_name\"]")).sendKeys("anu");
		driver.findElement(By.xpath("//*[@id=\"last_name\"]")).sendKeys("p");
		driver.findElement(By.xpath("//*[@id=\"company\"]")).sendKeys("luminar");
		driver.findElement(By.xpath("//*[@id=\"address1\"]")).sendKeys("anubhavan kiopuram p.o");
		driver.findElement(By.xpath("//*[@id=\"address2\"]")).sendKeys("thiruvalla,pathanamthitta");
		
		driver.findElement(By.xpath("//*[@id=\"country\"]")).sendKeys("India");
		
		
		driver.findElement(By.xpath("//*[@id=\"state\"]")).sendKeys("Kerala");
		driver.findElement(By.xpath("//*[@id=\"city\"]")).sendKeys("thiruvalla");
		driver.findElement(By.xpath("//*[@id=\"zipcode\"]")).sendKeys("689534");
		driver.findElement(By.xpath("//*[@id=\"mobile_number\"]")).sendKeys("7896543245");
		driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div/div/form/button")).click();

		
		
		
	}
}
