package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {

	private static WebElement element = null;

	public static WebElement getEmailField(WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver, 5);
		element = wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='login-form-email']")));
		return element;
	}

	public static void addEmail(WebDriver driver, String email) {
		getEmailField(driver).clear();
		getEmailField(driver).sendKeys(email);
	}

	public static WebElement getPasswordField(WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver, 5);
		element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='login-pass']")));
		return element;
	}

	public static void addPassword(WebDriver driver, String password) {
		getPasswordField(driver).clear();
		getPasswordField(driver).sendKeys(password);
	}

	public static WebElement getLoginButton(WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver, 5);
		element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='v-btn__content']")));
		return element;
	}
}