package pagepkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class Fbclickpage {

	WebDriver driver;
	
	By fbclick=By.xpath("//*[@id=\"reg_pages_msg\"]/a");
	By fbsign=By.xpath("//*[@id=\"blueBarDOMInspector\"]/div/div[2]/div/div/span/a");
	 
	public Fbclickpage(WebDriver driver)
	{
		this.driver=driver;
	}
	public void click()
	{
		driver.findElement(fbclick).click();
	}
	
	public String titileverification()
	{
		String title=driver.getTitle();
		return title;

	
}
	public void sign()
	{
		driver.findElement(fbsign).click();
		
	}
}
