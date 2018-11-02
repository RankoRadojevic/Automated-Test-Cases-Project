package PageObjectsTest;

import org.openqa.selenium.WebDriver;
import pageObjects.BusinessPage;
import pageObjects.HomePage;
import utility.Constant;
import utility.ExcelUtils;

public class BusinessPageTest {
	public static void setupExcel() throws Exception {
		ExcelUtils.setExcelFile(Constant.Path_TestData + Constant.File_TestData, "Sheet3");
	}
     
	public static String addNewBusinessTest(WebDriver driver) throws Exception {
        Thread.sleep(1000);
		String businessName = ExcelUtils.getCellData(1, 1);
		String country = ExcelUtils.getCellData(1, 2);
		String city = ExcelUtils.getCellData(1, 3);
		String street = ExcelUtils.getCellData(1, 4);
		int Zip = ExcelUtils.getNumericalCellData(1, 5);
        String zip =  Integer.toString(Zip);
		int rNumber = ExcelUtils.getNumericalCellData(1, 6);
        String registryNumber =  Integer.toString(rNumber);
        Thread.sleep(3000);
        String bankName = ExcelUtils.getCellData(3, 1);
		String accountNumber = ""+ExcelUtils.getNumericalCellData(3, 2);
		String swiftNumber =  ""+ExcelUtils.getNumericalCellData(3, 3);
		String paymentInstruction = ExcelUtils.getCellData(3, 4);
		String currencyName = ExcelUtils.getCellData(3, 5);
		
		HomePage.getBusinessPage(driver).click();
		BusinessPage.addNewBusiness(driver);
		BusinessPage.addBusinessName(driver, businessName);
		BusinessPage.addCountry(driver, country);
		BusinessPage.addCity(driver, city);
		BusinessPage.addStreet(driver, street);
		BusinessPage.addZip(driver, zip);
		BusinessPage.addRegistryNumber(driver, registryNumber);
		
		Thread.sleep(3000);
		BusinessPage.getAddNewBankButton(driver).click();
		BusinessPage.addBankName(driver, bankName);
		BusinessPage.addAccountNumber(driver, accountNumber);
		BusinessPage.addSwiftNumber(driver, swiftNumber);
		BusinessPage.addPaymentInstructions(driver, paymentInstruction);
	    BusinessPage.addCurrency(driver, currencyName);
	    BusinessPage.addBankAccountButton(driver);
	    BusinessPage.getSaveFormButton(driver).click();
		return "Pass";
	}
	
}