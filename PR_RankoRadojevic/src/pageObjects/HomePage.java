package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {

	private static WebElement element = null;
	

	public static WebElement getInvoicesPage(WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		element = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//a[@id='nav-bar-invoices']//div[@class='v-btn__content']")));
		return element;
	}

	public static WebElement getBusinessPage(WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		element = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//a[@id='nav-bar-business']//div[@class='v-btn__content']")));
		return element;
	}

	public static WebElement getClientsPage(WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		element = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//a[@id='nav-bar-clients']//div[@class='v-btn__content']")));
		return element;
	}
}