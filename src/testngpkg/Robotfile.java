package testngpkg;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Robotfile {
ChromeDriver driver;
String bseurl="https://www.ilovepdf.com/word_to_pdf";
@BeforeTest
public void setup()
{
	driver=new ChromeDriver();
	driver.get(bseurl);
}
@Test
public void robotfileupload() throws Exception 
{
	driver.findElement(By.xpath("//*[@id=\"pickfiles\"]/span")).click();
	fileupload("\"C:\\Users\\Lenovo\\Documents\\Intelligent Event Management Platform.docx\"");
}
public void fileupload(String p) throws AWTException {
	StringSelection strselection=new StringSelection(p);
	Toolkit.getDefaultToolkit().getSystemClipboard().setContents(strselection,null);
	
	Robot robot=new Robot();
	robot.delay(3000);
	
	robot.keyPress(KeyEvent.VK_CONTROL);
	robot.keyPress(KeyEvent.VK_V);
	robot.keyRelease(KeyEvent.VK_V);
	robot.keyRelease(KeyEvent.VK_CONTROL);
	
	robot.delay(2000);
	robot.keyPress(KeyEvent.VK_ENTER);
	robot.keyRelease(KeyEvent.VK_ENTER);
	 
	
	
	
	
}
}
