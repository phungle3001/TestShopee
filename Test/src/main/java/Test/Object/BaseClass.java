package Test.Object;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Duration;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class BaseClass {
	public static WebDriver driver;
	public  BaseClass(WebDriver driver){
		BaseClass.driver = driver;
	}	
	
	public static void Delay (int ms) throws InterruptedException
	{
		Thread.sleep(ms);
	}

}
