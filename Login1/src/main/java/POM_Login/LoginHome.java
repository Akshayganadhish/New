package POM_Login;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginHome 
{
	@FindBy(xpath="//span[@class='nickname']")
	private WebElement name;
	
	public LoginHome(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	
	public String actResult() {
		
		String value=name.getText();
		return value;	
	}
	
	public File ss() throws IOException {
		File file = name.getScreenshotAs(OutputType.FILE);
		File tgt=new File("C:\\Users\\admin\\eclipse-workspace\\Login1\\ScreenShot\\ig.png"); 
		FileHandler.copy(file, tgt);
		return file;
	}
	
}
