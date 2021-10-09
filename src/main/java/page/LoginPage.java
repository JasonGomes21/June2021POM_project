package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage {
	WebDriver drivers;

	public LoginPage(WebDriver drivers) {
		this.drivers = drivers;

	}

	// methods//variables//Attribute//Field

	// Login Data
	String user_NAME = "demo@techfios.com";
	String password = "abc123";

	// Storing element with By my class
	By userNameField = By.xpath("//input[@id='username']");
	By passWordField = By.xpath("//*[@id=\"password\"]");
	By signInButtonField = By.xpath("/html/body/div/div/div/form/div[3]/button");

	@FindBy(how = How.XPATH, using = "//input[@id='username']")
	WebElement USERNAME_ELEEMNT;
	@FindBy(how = How.XPATH, using = "//*[@id=\"password\"]")
	WebElement PASSWORD_ELEEMNT;
	@FindBy(how = How.XPATH, using = "/html/body/div/div/div/form/div[3]/button")
	WebElement SIGNIN_BUTTON_ELEMENMT;

	//Individual methods
	
	public void insertUserName(String userName) {
		USERNAME_ELEEMNT.sendKeys(userName);
	}

	public void insertPassword(String password) {
		PASSWORD_ELEEMNT.sendKeys(password);
	}

	public void clickSigninButton() {
		SIGNIN_BUTTON_ELEMENMT.click();
	}

}
