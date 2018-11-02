package automationFramework;


import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.*;
import pageObjects.*;
import utility.Constant;
import PageObjectsTest.*;

		// Import Package utility.*

		import utility.ExcelUtils;

		//import appModules.SignIn_Action;

	public class Apache_POI_TC {

		private static WebDriver driver = null;

		public static void main(String[] args) throws Exception {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\User\\Documents\\ChromeDriver\\chromedriver.exe\\");
			driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.manage().window().maximize();
			driver.get(Constant.URL);
			driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
			
			LoginPageTest.setupExcel();
			LoginPageTest.SignInTest(driver);
			
			BusinessPageTest.setupExcel();
			BusinessPageTest.addNewBusinessTest(driver);
			
			ClientsPageTest.setupExcel();
		    ClientsPageTest.AddNewClientTest(driver);
			
//			InvoicesPageTest.setupExcel();
//			InvoicesPageTest.addNewInvoiceTest(driver);
			
			driver.close();
			driver.quit();
		}
	}



