package pageObjects;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BusinessPage {

	private static WebElement element = null;
    
	
		
	
	public static WebElement getAddNewBusiness(WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		element = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//a[@id='add-new-business']//div[@class='v-btn__content']")));
		return element;
	}

	public static void addNewBusiness(WebDriver driver) {
		getAddNewBusiness(driver).click();
	}

	public static WebElement getBusinessName(WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver, 5);
		element = wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='business-form-name']")));
		return element;
	}

	public static void addBusinessName(WebDriver driver, String businessName) {
		getBusinessName(driver).sendKeys(businessName);
	}

	public static WebElement getCountries(WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver, 5);
		element = wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='business-form-country']")));
		return element;
	}

	public static void addCountry(WebDriver driver, String countryName) {
		Actions builder = new Actions(driver);
		Actions country = builder.moveToElement(getCountries(driver)).click().sendKeys(countryName);
		country.sendKeys(Keys.DOWN).sendKeys(Keys.RETURN);
		country.perform();
	}

	public static WebElement getCity(WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver, 5);
		element = wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='business-form-city']")));
		return element;
	}

	public static void addCity(WebDriver driver, String city) {
		getCity(driver).sendKeys(city);
	}

	public static WebElement getStreet(WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver, 5);
		element = wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='business-form-street']")));
		return element;
	}

	public static void addStreet(WebDriver driver, String street) {
		getStreet(driver).sendKeys(street);
	}

	public static WebElement getZip(WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver, 5);
		element = wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='business-form-zip']")));
		return element;
	}

	public static void addZip(WebDriver driver, String zip) {
		getZip(driver).sendKeys(zip);

	}

	public static WebElement getRegistryNumber(WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver, 5);
		element = wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='business-form-reg-num']")));
		return element;
	}

	public static void addRegistryNumber(WebDriver driver, String registryNumber) {
		getRegistryNumber(driver).sendKeys(registryNumber);
	}

	public static WebElement getSaveFormButton(WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver, 5);
		element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(),'Save')]")));
		return element;
	}

	public static WebElement getBackToBusinessList(WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver, 5);
		element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"//a[@class='primary mt-5 mr-5 v-btn--active v-btn v-btn--flat v-btn--router v-btn--small']//div[@class='v-btn__content']")));
		return element;
	}
	
	public static WebElement getAddNewBankButton (WebDriver driver) {
        WebElement element = driver.findElement(By.xpath("//button[@id='business-form-add-bank-btn']//div[@class='v-btn__content']"));
        return element;
    }
    public static void addNewBankAccount (WebDriver driver) {
        getAddNewBankButton(driver).click();
    }
    public static WebElement getAddBankAccountButton (WebDriver driver) {
    	WebElement element = driver.findElement(By.xpath("//div[contains(text(),'Add bank account')]"));
		return element;
    }
    public static void addBankAccountButton (WebDriver driver) {
		getAddBankAccountButton(driver).click();
    }
    
    
    public static  WebElement getBankName (WebDriver driver){
        WebElement getBankName = driver.findElement(By.xpath("//input[@id='bank-dialog-name']"));
        return getBankName;
    }
    public static void addBankName (WebDriver driver, String bankName) {
        getBankName(driver).sendKeys(bankName);
    }
    
    
    public static  WebElement getAccountNumber (WebDriver driver){
        WebElement getAccountNumber = driver.findElement(By.xpath("//input[@id='bank-dialog-num']"));
        return getAccountNumber;
    }
    public static void addAccountNumber (WebDriver driver, String accountNumber) {
        getAccountNumber(driver).sendKeys(accountNumber);
    }
    
    
    public static  WebElement getSwiftNumber (WebDriver driver){
        WebElement getSwiftNumber = driver.findElement(By.xpath("//input[@id='bank-dialog-swf-num']"));
        return getSwiftNumber;
    }
    public static void addSwiftNumber (WebDriver driver, String swiftNumber) {
        getSwiftNumber(driver).sendKeys(swiftNumber);
    }
    
    
    public static  WebElement getPaymentInstructions (WebDriver driver){
        WebElement getPaymentInstructions = driver.findElement(By.xpath("//textarea[@id='bank-dialog-pay-inst']"));
        return getPaymentInstructions;
    }
    public static void addPaymentInstructions (WebDriver driver, String paymentInstructions) {
        getPaymentInstructions(driver).sendKeys(paymentInstructions);
    }
    
    
    public static WebElement getCurrency(WebDriver driver) {
        WebDriverWait wait = new WebDriverWait(driver, 5);
        element = wait
                .until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='v-select__selections']")));
        return element;
    }

    public static List<WebElement> getCurrencyLabel(WebDriver driver) {
        List<WebElement> currencyList = new ArrayList();
        currencyList.add(driver.findElement(By.xpath("//div[contains(text(),'Dinar')]")));
        currencyList.add(driver.findElement(By.xpath("//div[contains(text(),'Euro')]")));
        currencyList.add(driver.findElement(By.xpath("//div[contains(text(),'US Dollar')]")));
        return currencyList;
    }

    public static void addCurrency(WebDriver driver, String currencyName) {
        Actions builder = new Actions(driver);
        WebElement currencyList = getCurrency(driver);
        Actions currency = builder.moveToElement(currencyList).click();
        currency.perform();
        List<WebElement> CurrencyLabel = getCurrencyLabel(driver);
        for (WebElement e : CurrencyLabel) {
            if (e.getText().equals(currencyName)) {
                e.click();
            }
        }
    }
}