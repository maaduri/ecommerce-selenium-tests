package com.apex.ecommerce.registration.constant;



import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public interface RegistrationConstant {
	
     String ACCOUNT_LINK_LOCATOR = "ACCOUNT";
	 String SIGN_UP_LINK_LOCATOR = "SignUp";
	 String GENDER_VALUE_LOCATOR = "//input[@name='radiobutton']"; 
	// String GENDER_VALUE_LOCATOR = "//input[@value='Male']";
	 String FIRSTNAME_LOCATOR = "//input[@id='fname']";
	 String LASTNAME_LOCATOR = "//input[@name='lname']";
	 String DAY_LOCATOR = "day";
	 String MONTH_LOCATOR = "//input[@id='month']";
	 String YEAR_LOCATOR = "input[id='year']";
	 String EMAIL_NAME_LOCATOR = "input[name='email']";
	 String HOUSENO_LOCATOR = "input[id='houseno']";
	 String ADDRESS_LOCATOR = "input[id='add1']";
	 String CITY_LOCATOR = "input[name='city']";
	 String STATE_LOCATOR = "input[name='state']";
	 String COUNTRY_LOCATOR = "input[id='country']";
	 String POSTCODE_LOCATOR = "//input[@id='postcode']";
	 String PHONE_LOCATOR = "input[id='phone']";
	 String FAX_LOCATOR = "input[id='fax']";
	 String PASSWORD_LOCATOR = "input[name='password']";
	 String CPASSWORD_LOCATOR = "input[name='cpassword']";
	 String GENDER_VALUE1_LOCATOR = "input[value='1']";
	 String TERMS_LOCATOR = "//input[@id='terms']";
	 String SUBMIT_NAME_LOCATOR = "Submit";
	 
}
