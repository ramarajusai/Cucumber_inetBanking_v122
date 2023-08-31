package StepDefinitions;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import PageObjects.AddCustomerPage;
import PageObjects.LoginPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


@SuppressWarnings("deprecation")
public class Steps {
	
	public WebDriver driver;
	public LoginPage lp;
	public AddCustomerPage ac;
	
	
	public String fname = "anirudh";
	public String lname = "sai";
	public String company = "rockstar";
	public String email = BaseClass.randomString();
	
	@Given("User Launch Chrome Browser")
	public void user_Launch_Chrome_Browser() {
		

	   System.setProperty("webdriver.gecko.driver",
				  System.getProperty("user.dir")+"//Drivers//geckodriver.exe"); driver =new
				  FirefoxDriver();
				   lp=new LoginPage(driver);
				   ac = new AddCustomerPage(driver);
				   driver.manage().window().maximize();
	}
	
	@When("user opens URL {string}")
	public void user_opens_URL(String url) {
	  
		driver.get(url);
		
	}

	@When("user enters Email as {string} and password as {string}")
	public void user_enters_Email_as_and_password_as(String un, String pw) throws InterruptedException {
		Thread.sleep(1000);
	  lp.setUserName(un);
	  Thread.sleep(1000);
	  lp.setPassword(pw);
	  Thread.sleep(1000);
	}

	@When("click on Login")
	public void click_on_Login() throws InterruptedException {
	   lp.clickOnLoginButton();
	   Thread.sleep(1000);
	}

	@Then("Page Title should be {string}")
	public void page_Title_should_be(String title) {
	 
	 
	assertEquals(driver.getTitle(),title );
	}

	@When("user click on Logout button")
	public void user_click_on_Logout_button() throws InterruptedException {
	    lp.clickOnLogOutButton();
	    Thread.sleep(1000);
	}

	@Then("page title should be {string}")
	public void page_title_should_be(String string) {
		assertEquals(driver.getTitle(),string );
	}

	@Then("close browser")
	public void close_browser() {
	 driver.quit();
	}
////
	
	@Then("User can view dashboard")
	public void user_can_view_dashboard() throws InterruptedException {
		Thread.sleep(1000);
		assertEquals(ac.isDashboardDisplayed(), true);
		System.out.println("PASS");
	}

	@When("User click on Customers menu")
	public void user_click_on_Customers_menu() throws InterruptedException {
		Thread.sleep(1000);
		ac.clickOnAddCustomerTab();

	}

	@When("Click on Customers menu item")
	public void click_on_Customers_menu_item() throws InterruptedException {

		ac.clickOnCustomersMenu();
	}

	@When("Click on Add new button")
	public void click_on_Add_new_button() throws InterruptedException {

		ac.clickOnAddCustomerButton();

	}

	@Then("User can view Add new customer page")
	public void user_can_view_Add_new_customer_page() throws InterruptedException {

		assertEquals(ac.isAddCustomersPageDisplayed(), true);
	}

	@When("User enter Customer info")
	public void user_enter_Customer_info() throws InterruptedException {

		// ac.enterDataIntoEmailField(randomString());
		ac.enterDataIntoEmailField(email);
		ac.enterDataIntoPasswordField("test123");
		ac.enterDOB("10/23/1996");
		ac.enterDataIntoFirstNameField(fname);
		ac.enterDataIntoLastNameField(lname);
		ac.enterDataIntoCompanyName(company);

	}

	@When("Click on Save button")
	public void click_on_Save_button() throws InterruptedException {

		ac.clickOnSaveButton();
		Thread.sleep(1000);
		
	}

	@Then("User can view confirmation message {string}")
	public void user_can_view_confirmation_message(String string) {

		assertTrue(driver.findElement(By.tagName("body")).getText()
				.contains("The new customer has been added successfully."));
	}

}
