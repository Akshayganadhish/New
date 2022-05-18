package hey;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Chr {
	
	@DataProvider (name = "inp")
	public Object[][] Test(){
		return new Object[][] {
			{"Hi", "Bye"}
		};
	}
	@Test(dataProvider = "inp")
	public void Te(String input, String input1) {
		System.out.println(input+input1);
	}
	
}
