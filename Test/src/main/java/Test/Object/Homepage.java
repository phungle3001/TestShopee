package Test.Object;

import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Homepage extends BaseClass {
	private static WebElement element = null;

	public Homepage(WebDriver driver) {
		super(driver);
	}

	// Message display after login successfully - element
	public static WebElement messageText() {		
		try {
			element = driver.findElement(By.xpath("//div[@class='error-copy']//h3"));
		} catch (Exception e) {
			System.out.println("Not found message in Homepage");
		}
	
		return element;
	}

}
