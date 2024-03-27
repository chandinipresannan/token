package testngpkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Popup {
 WebDriver driver;
 @BeforeTest
 public void setup()
 {
	 ChromeOptions popup=new ChromeOptions();
	 popup.addArguments("--disable-notifications");
	 driver=new ChromeDriver(popup);
	 
 }
 @Test
 public void popup()
 {
	 driver.get("https://www.justdial.com/");
	 driver.manage().window().maximize();
 }
}
