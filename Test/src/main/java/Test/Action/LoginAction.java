package Test.Action;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;

import Test.Object.BaseClass;
import Test.Object.Login;
import Test.Utility.utility;

public class LoginAction {
	public static void inputEmail(String email) {
		Login.userNameTxt().sendKeys(email);
	}

	public static void inputPass(String pass) {
		Login.passTxt().sendKeys(pass);
	}

	public static void clickLoginBtn() throws Exception {
		Login.loginBtn().click();
	}
}
