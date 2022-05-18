package POM_Login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPin 
{
	@FindBy(xpath="//input[@type='password']")
	WebElement pin;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement cBtn;
	
	public LoginPin(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	
	public void enterPin(String pinValue) {
		pin.sendKeys(pinValue);
	}
	
	public void clickCBtn() {
		cBtn.click();
	}
	
}
