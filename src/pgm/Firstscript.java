package pgm;

import org.openqa.selenium.chrome.ChromeDriver;

public class Firstscript {

	public static void main(String[] args) {
		   
		
		ChromeDriver driver=new ChromeDriver();//to lauch chrome browser
		driver.get("https://www.google.com");//url
	
		String s="Google";
		String st=driver.getTitle();
		
		if(st.equals(s))
		{
			System.out.println("True");
		}
		
		else
		{
			System.out.println("false");
		}

		driver.quit();
	}

}
