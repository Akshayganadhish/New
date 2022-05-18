import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import POM_Login.Login1;
import POM_Login.LoginHome;
import POM_Login.LoginPin;
import Resource.BaseClass;
import Resource.UtilityClass;

@Test
public class A extends BaseClass {

	Login1 log;
	LoginPin pin;
	LoginHome ho;

	@BeforeClass
	public void setupBrowser() throws IOException {
		openBrowser();
		log = new Login1(driver);
		pin = new LoginPin(driver);
		ho = new LoginHome(driver);

	}

	@BeforeMethod
	public void login(String Browser) throws EncryptedDocumentException, IOException, Exception {
		log.enteruName(UtilityClass.getTData(0, 0));
		log.enterPass(UtilityClass.getTData(0, 1));
		log.clicklBtn();
		Thread.sleep(2000);
		pin.enterPin(UtilityClass.getTData(0, 2));
		pin.clickCBtn();
	}

	@Test

	public void verifyName() throws EncryptedDocumentException, IOException {
		String expResult = ho.actResult();
		Assert.assertEquals(UtilityClass.getTData(0, 4), expResult);
		ho.ss();
	}

	@AfterMethod
	public void Test(ITestResult it) throws IOException {
		it.getStatus();
		if (it.getStatus() == it.FAILURE) {
			UtilityClass.getSnapShot(driver, 101);
		}
	}

	@AfterClass
	public void tearDown() {
		closeBrowser();
	}

}
