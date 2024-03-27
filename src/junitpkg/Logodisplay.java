package junitpkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Logodisplay {
	String baseurl="https://register.rediff.com/register/register.php?FormName=user_details";
    ChromeDriver driver;
@Before
public void setUp()
{
  driver=new ChromeDriver()	;
  driver.get(baseurl);
}
@Test
public void logotest()
{

	boolean logo=driver.findElement(By.xpath("//*[@id='wrapper']/table[1]/tbody/tr[1]/td[1]/img")).isDisplayed();
	if(logo)
	{
		System.out.println("logo is displayed");
	}
	else
	{
		System.out.println("logo is not displayed");
	}
//	boolean radio=driver.findElement(By.xpath("//*[@id='tblcrtac']/tbody/tr[24]/td[3]/input[1]")).isSelected();
//	if(radio)
//	{
//		System.out.println("male radio is selected");
//	}
//	else
//	{
//		System.out.println("male radio is not selected");
//	}

}

}
