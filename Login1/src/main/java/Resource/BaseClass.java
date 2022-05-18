package Resource;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BaseClass {

	public WebDriver driver;

	public void openBrowser() throws IOException {
		
	
		System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\eclipse-workspace\\Login1\\Browsers\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get(UtilityClass.getPFData("url"));
	}
	
	public void closeBrowser() {
		driver.close();
		
	}

}
