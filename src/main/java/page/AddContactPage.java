package page;

import java.util.Random;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.Zip;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AddContactPage extends BasePage {

	WebDriver drivers;

	public AddContactPage(WebDriver drivers) {
		this.drivers = drivers;

	}

	@FindBy(how = How.XPATH, using = "//input[@id='account']")
	WebElement FULL_NAME_ELEMENT;
	@FindBy(how = How.XPATH, using = "//select[@name='cid']")
	WebElement COMPANY_NAME_ELEMENT;;
	@FindBy(how = How.XPATH, using = "//input[@id='email']")
	WebElement EMAIL_ELEMENT;
	@FindBy(how = How.XPATH, using = "//input[@id='phone']")
	WebElement PHONE_NUMBER_ELEMENT;
	@FindBy(how = How.XPATH, using = "//input[@id='address']")
	WebElement ADDRESS_ELEMENT;
	@FindBy(how = How.XPATH, using = "//input[@id='city']")
	WebElement CITY_ELEMENT;
	@FindBy(how = How.XPATH, using = "//input[@id='state']")
	WebElement STATE_REGION_ELEMENT;
	@FindBy(how = How.XPATH, using = "//input[@id='zip']")
	WebElement ZIPCODE_ELEMENT;
	@FindBy(how = How.XPATH, using = "//select[@id='country']")
	WebElement COUNTRY_ELEMENT;
	@FindBy(how = How.XPATH, using = "//select[@id='tags']")WebElement TAG_ELEMENT;
	@FindBy(how = How.XPATH, using = "//select[@id='group']")WebElement GROUP_ELEMENT;
	@FindBy(how = How.XPATH, using = "//input[@id='password']")WebElement PASSWORD_ELEMENT;
	@FindBy(how = How.XPATH, using = "//input[@id='cpassword']")WebElement CONFIRM_PASSWORD_ELEMENT;
	@FindBy(how = How.XPATH, using = "//*[@id=\"rform\"]/div[1]/div[2]/div[5]/div/div/div/label[1]")WebElement Welcome_Email_ELEMENT;
	@FindBy(how = How.XPATH, using = "//button[@id='submit']") WebElement SAVE_ELEMENT;

	public void insertFullName(String username) {

		FULL_NAME_ELEMENT.sendKeys(username + generateRandomNo(999));
	}

	public void selectCompany(String company_NAME_ELEMENT) {
	
		selectFromDropdown(COMPANY_NAME_ELEMENT,company_NAME_ELEMENT );
	}

	public void insertEmail(String email_ELEMENT) {
		
		EMAIL_ELEMENT.sendKeys(generateRandomNo(999) +email_ELEMENT);
		
	}

	public void insertPhone(String phone_NUMBER_ELEMENT) {
		PHONE_NUMBER_ELEMENT.sendKeys(phone_NUMBER_ELEMENT + generateRandomNo(999));	
	}

	public void insertAddress(String address_ELEMENT) {
		ADDRESS_ELEMENT.sendKeys(generateRandomNo(999) +address_ELEMENT );
	
	}

	public void insertCity(String city_ELEMENT) {
		CITY_ELEMENT.sendKeys(city_ELEMENT);
		
	}

	public void insertState(String state_REGION_ELEMENT) {
		STATE_REGION_ELEMENT.sendKeys(state_REGION_ELEMENT);
		
	}

	public void insertZipcode(String zipcode_ELEMENT) {
		ZIPCODE_ELEMENT.sendKeys(zipcode_ELEMENT + generateRandomNo(9999));
		
	}

	public void selectCountry(String country_Element) {
		
		selectFromDropdown(COUNTRY_ELEMENT, country_Element);
	}

	public void selectTag(String tag_Element) {
		
		selectFromDropdown(TAG_ELEMENT, tag_Element);
	}

	public void selectGroup(String group_Element) {
		
		selectFromDropdown(GROUP_ELEMENT , group_Element);
	}

	public void insertPassword(String password_Element) {
		PASSWORD_ELEMENT.sendKeys(password_Element);
		
	}

	public void insertConfirmPassword(String confirm_Password_Element) {
		
		CONFIRM_PASSWORD_ELEMENT.sendKeys(confirm_Password_Element);
	}

	public void clickWelcomeEmailButton() {
		
		Welcome_Email_ELEMENT.click();
	}

	public void saveAddcontact() {
		
		SAVE_ELEMENT.click();
	}


	
}
