package Test.TestCase;

import static org.testng.Assert.assertEquals;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import Test.Action.HomepageAction;
import Test.Action.LoginAction;
import Test.Object.BaseClass;
import Test.Object.Homepage;
import Test.Object.Login;
import Test.Utility.utility;

/**
 * Author: Le Kim Phung
 */
public class TestCase {

	public static WebDriver driver = null;
	public WebDriverWait checkWaitExplicit, checkWaitExplicit2;

	// Configuration and initial for web
	@BeforeSuite
	public void initializeWeb() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/login.html");
		checkWaitExplicit = new WebDriverWait(driver, 10);
		new BaseClass(driver);
		BaseClass.Delay(4000);
	}

	@Test
	public void login() throws Exception {

		/*
		 * Wait for visibility of login page
		 */
		checkWaitExplicit.until(ExpectedConditions.visibilityOf(Login.userNameTxt()));

		/*
		 * Login page
		 */
		LoginAction.inputEmail(utility.Email);
		LoginAction.inputPass(utility.Password);
		LoginAction.clickLoginBtn();


		// delay time
		BaseClass.Delay(2000);

		/*
		 * Verify User login successfully or not
		 */
		boolean expect = true;
		boolean actual = (HomepageAction.checkMessageText(utility.MessageTextExpect));	
		assertEquals(actual, expect);

	}

	
}