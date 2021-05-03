package Test.Object;

import org.openqa.selenium.*;


public class Login extends BaseClass {

	private static WebElement element = null;

	public Login(WebDriver driver) {

		super(driver);
	}

	public static WebElement userNameTxt() {
		try {
			element = driver.findElement(By.xpath("//input[@id='email']"));

		} catch (Exception e) {
			System.out.println("Not found Email text field in Login page");
		}

		return element;

	}

	public static WebElement passTxt() {
		try {
			element = driver.findElement(By.xpath("//input[@id='passwd']"));
		} catch (Exception e) {
			System.out.println("Not found Password text field in Login page");
		}

		return element;

	}
	
	public static WebElement loginBtn() {
		try {
			element = driver.findElement(By.xpath("//button[@id='SubmitLogin']"));
		} catch (Exception e) {
			System.out.println("Not found Login button in Login page");
		}

		return element;

	}
	
}
