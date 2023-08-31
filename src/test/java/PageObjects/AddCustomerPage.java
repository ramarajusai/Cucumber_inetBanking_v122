package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.WaitHelper;

public class AddCustomerPage {

	public WebDriver ldriver;

	public AddCustomerPage(WebDriver rdriver) {

		ldriver = rdriver;

		PageFactory.initElements(rdriver, this);
	}

	@FindBy(xpath = "//div[@class=\"content-header\"]/h1")
	WebElement dashboard;

	@FindBy(xpath = "//ul[@class=\"nav nav-pills nav-sidebar flex-column nav-legacy\"]/li[4]")
	WebElement customersTab;

	@FindBy(xpath = "//p[text()=' Customers']")
	WebElement customersMenu;

	@FindBy(xpath = "//i[@class=\"fas fa-plus-square\"]")
	WebElement addButton;

	@FindBy(id = "Email")
	WebElement emailField;

	@FindBy(id = "Password")
	WebElement passwordField;

	@FindBy(id = "FirstName")
	WebElement firstNameField;

	@FindBy(id = "LastName")
	WebElement lastNameField;

	@FindBy(xpath = "//div[@class=\"raw\"]/div[1]/input")
	WebElement maleGender;

	@FindBy(xpath = "//div[@class=\"raw\"]/div[2]/input")
	WebElement femaleGender;

	@FindBy(id = "DateOfBirth")
	WebElement dob;

	@FindBy(id = "Company")
	WebElement company;

	@FindBy(xpath = "//button[@name=\"save\"]")
	WebElement saveButton;

	@FindBy(id = "customer-cards")
	WebElement addCustomersPage;

	public void clickOnAddCustomerTab() {
		customersTab.click();

	}

	public void clickOnCustomersMenu() throws InterruptedException {
		Thread.sleep(3000);
		customersMenu.click();

	}

	public void clickOnAddCustomerButton() throws InterruptedException {
		Thread.sleep(3000);
		addButton.click();

	}

	public void enterDataIntoEmailField(String email) {

		WaitHelper wh = new WaitHelper(ldriver);
		wh.WaitForElement(emailField, 3000);
		emailField.sendKeys(email);

	}

	public void enterDataIntoPasswordField(String password) throws InterruptedException {
		Thread.sleep(3000);
		passwordField.sendKeys(password);

	}

	public void enterDataIntoFirstNameField(String fname) throws InterruptedException {
		Thread.sleep(3000);
		firstNameField.sendKeys(fname);

	}

	public void enterDataIntoLastNameField(String lname) throws InterruptedException {
		Thread.sleep(3000);
		lastNameField.sendKeys(lname);

	}

	public void enterDataIntoCompanyName(String cname) throws InterruptedException {
		Thread.sleep(3000);
		company.sendKeys(cname);

	}

	public void selectMaleGender() throws InterruptedException {
		Thread.sleep(3000);

		maleGender.click();

	}

	public void enterDOB(String dateOfBirth) throws InterruptedException {
		Thread.sleep(3000);
		dob.sendKeys(dateOfBirth);

	}

	public void clickOnSaveButton() throws InterruptedException {
		saveButton.click();
		Thread.sleep(2000);

	}

	public boolean isDashboardDisplayed() throws InterruptedException {
		Thread.sleep(3000);

		return dashboard.isDisplayed();
	}

	public boolean isAddCustomersPageDisplayed() throws InterruptedException {
		Thread.sleep(3000);

		return addCustomersPage.isDisplayed();
	}
	


}
