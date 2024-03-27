package junitpkg;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alllinkvalidation {
	String baseurl="https://www.google.com";
    ChromeDriver driver;
@Before
public void setUp()
{
  driver=new ChromeDriver()	;
  driver.get(baseurl);
}
@Test
public void test()
{
	List<WebElement> li=driver.findElements(By.tagName("a"));
	System.out.println("total link count="+li.size());
	for(WebElement ele:li){
		{
			String link=ele.getAttribute("href");
			verify(link);
		}
	}
	
}
private void verify(String link) {
	try {
	URL u=new URL(link);
	HttpURLConnection con=(HttpURLConnection)u.openConnection();
	int code =con.getResponseCode();
	if(code==200)
	{
		System.out.println("response code is 200--successful");	
	}
	else if(code==404)
	{
		System.out.println("response code is 404--broken link");
	}
	else
	{
		System.out.println("not excepted");
	}
	}catch(Exception e)
	{
		System.out.println(e.getMessage());
	}
 }
}
