package pgm;

import org.openqa.selenium.chrome.ChromeDriver;

public class Pagesource {

	public static void main(String[] args) {
		 
		String s="https://www.google.com";
		ChromeDriver driver=new ChromeDriver();
		driver.get(s);
		String pg=driver.getPageSource();
		if(pg.contains("Gmail"))
		{
			System.out.println("Gmail text is present");
		}
		else
		{
			System.out.println("Gmail text is not present");
		}
		
		driver.quit();
	}

	
}
