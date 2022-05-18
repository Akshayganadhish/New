package POM_Login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Resource.UtilityClass;

public class Login1 
{
	
	@FindBy(xpath="//input[@type='text']")
	private WebElement uName;
	
	@FindBy(xpath="//input[@type='password']")
	private WebElement pass;
	
	@FindBy(xpath="//button[@type='submit']")
	private WebElement lBtn;
	
	public Login1(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	
	public void enteruName(String uNameValue) {
		uName.sendKeys(uNameValue);
	}
	
	public void enterPass(String enterPassValue) {
		pass.sendKeys(enterPassValue);
	}
	public void clicklBtn() {
		lBtn.click();
	}
}
