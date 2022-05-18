package hey;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Geck {
	@Test(priority = -4)
	void Test() {
		System.out.println("Hi");
	}
	
	
	@Test (priority = -5)
	void Test1() {
		System.out.println("BYe");
	}
}
