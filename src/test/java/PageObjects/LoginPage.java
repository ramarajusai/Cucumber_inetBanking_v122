package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	
	public WebDriver ldriver;
	public LoginPage(WebDriver rdriver){
		
		ldriver=rdriver;
		
		PageFactory.initElements(rdriver, this);
	}
	
	
	@FindBy(id="Email")
	WebElement txtemail;
	
	@FindBy(id="Password")
	WebElement txtpassword;
	
	@FindBy(xpath="//button[text()='Log in']")
	WebElement loginButton;
	
	
	@FindBy(xpath="//a[text()='Logout']")
	WebElement Logout;
	
	public void setUserName(String uname) throws InterruptedException {
		
		txtemail.clear();
		
		txtemail.sendKeys(uname);
		
	}
	
	
	
	public void setPassword(String pwd) throws InterruptedException {
		
		txtpassword.clear();
	
		txtpassword.sendKeys(pwd);
		
	}
	
	public void clickOnLoginButton() {
		
		loginButton.click();
	
		
	}
	
	public void clickOnLogOutButton() {
		
		Logout.click();
	
		
	}
	
}
