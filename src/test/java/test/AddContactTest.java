package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.AddContactPage;
import page.DashboardPage;
import page.LoginPage;
import util.BrowserFactory;

public class AddContactTest {
	
	WebDriver drivers;
	
	//TestData
		String Full_NAME_ELEMENT ="Steve"; 
		String Company_NAME_ELEMENT ="Techfios"; 
		String Email_ELEMENT ="eprkkk@gmail.com"; 
		String Phone_NUMBER_ELEMENT ="4698873201"; 
		String Address_ELEMENT ="Drive lane";
		String City_ELEMENT ="Dallas";
		String State_REGION_ELEMENT ="Texas";
		String Zipcode_ELEMENT ="k";
		String Country_Element = "Bangladesh";
		String Tag_Element = "My tags";
		String Group_Element = "June2020";
		String Password_Element = "jkjsxcv230";
		String Confirm_Password_Element = "jkjsxcv230";
		
				
	@Test
	public void validUserShouldBeAbleToAddCustomer() {
		
		drivers = BrowserFactory.init();
		
		LoginPage login = PageFactory.initElements(drivers, LoginPage.class);
		login.insertUserName("demo@techfios.com");
		login.insertPassword("abc123");
		login.clickSigninButton();
		
		DashboardPage dashboard = PageFactory.initElements(drivers, DashboardPage.class);
		dashboard.verifyDashboard();
		dashboard.clickCustomerButton();
		dashboard.clickAddCustomerButton();
		
		AddContactPage addContactPage = PageFactory.initElements(drivers, AddContactPage.class);
		addContactPage.insertFullName(Full_NAME_ELEMENT);
		addContactPage.selectCompany(Company_NAME_ELEMENT);
		addContactPage.insertEmail(Email_ELEMENT);
		addContactPage.insertPhone(Phone_NUMBER_ELEMENT);
		addContactPage.insertAddress(Address_ELEMENT);
		addContactPage.insertCity(City_ELEMENT);
		addContactPage.insertState(State_REGION_ELEMENT);
		addContactPage.insertZipcode(Zipcode_ELEMENT);
		addContactPage.selectCountry(Country_Element);
		addContactPage.selectTag(Tag_Element);
		addContactPage.selectGroup(Group_Element);
		addContactPage.insertPassword(Password_Element);
		addContactPage.insertConfirmPassword(Confirm_Password_Element);
		addContactPage.clickWelcomeEmailButton();
		addContactPage.saveAddcontact();
		
		
	
		
		


		
		
	}

}
