package testngpkg;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Datepicker {

	ChromeDriver driver;
	String baseurl="https://www.goibibo.com/flights/?utm_source=google&utm_medium=cpc&utm_campaign=DF-Brand-EM&utm_adgroup=Only%20Goibibo&utm_term=!SEM!DF!G!Brand!RSA!108599293!6504095653!617695092667!e!goibibo!c!&gad_source=1&gclid=Cj0KCQiA84CvBhCaARIsAMkAvkJ4joJd34NjNKTXJcTrJ6_NynMPR13f5XwcSyVa7iGlMqTvDTKIEOQaAqouEALw_wcB";
@BeforeTest
public void setup()
{
	driver=new ChromeDriver();
}
@BeforeMethod
public void urlopen()
{
	driver.get(baseurl);
	driver.manage().window().maximize();
}
@Test
public void datepick()
{
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.navigate().refresh();
	driver.findElement(By.xpath("//*[@id=\"root\"]/div[4]/div/div/div[1]/div[3]/div/p[1]")).click();
	
	while(true)
	{
		WebElement month=driver.findElement(By.xpath("//*[@id=\"root\"]/div[4]/div/div/div[1]/div[3]/div[2]/div[2]/div/div/div[2]/div[1]/div[1]/div"));
		String monthtext=month.getText();
		System.out.println(monthtext);
		if(monthtext.equals("May 2024"))
		{
			break;
		}
		else
		{
			driver.findElement(By.xpath("//*[@id=\"root\"]/div[4]/div/div/div[1]/div[3]/div[2]/div[2]/div/div/div[1]/span[2]")).click();
		}
		
	}
	List<WebElement>li=driver.findElements(By.xpath("//*[@id=\"root\"]/div[4]/div/div/div[1]/div[3]/div[2]/div[2]/div/div/div[2]/div[1]/div[3]"));
	for(WebElement ele :li)
	{
		String date= ele.getText();
		if(date.equals("16"))
		{
			ele.click();
		}
		
	}

	driver.findElement(By.xpath("//*[@id=\"root\"]/div[4]/div/div/div[1]/div[3]/div[2]/div[3]/span[2]")).click();
}
}

