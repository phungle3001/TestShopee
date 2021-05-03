package Test.Action;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import Test.Object.BaseClass;
import Test.Object.Homepage;
import Test.Utility.utility;

public class HomepageAction {

	// Get message display after login successfully
	public static String getMessage() {
		String st = Homepage.messageText().getText();
		return st;
	}

	// Verify message text
	public static boolean checkMessageText(String header) throws Exception {
		boolean check = false;
		if (header.equalsIgnoreCase(getMessage())) {
			check = true;
		}
		return check;
	}

}
