package com.apex.ecommerce.registration.page;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.apex.ecommerce.registration.constant.RegistrationConstant;

public class RegistrationPage implements RegistrationConstant{
	
	@FindBy(linkText=ACCOUNT_LINK_LOCATOR )
	 private WebElement accountLinkElm;
	@FindBy(linkText=SIGN_UP_LINK_LOCATOR)
	WebElement signupLinkElm;
	@FindBy(xpath=GENDER_VALUE_LOCATOR)
	WebElement radioBtnElm;
	@FindBy(xpath=FIRSTNAME_LOCATOR)
	WebElement fnameElm;
	@FindBy(xpath=LASTNAME_LOCATOR)
	WebElement lnameElm;
	@FindBy(name=DAY_LOCATOR)
	WebElement dayElm;
	@FindBy(xpath=MONTH_LOCATOR)
	WebElement monthElm;
	@FindBy(css=YEAR_LOCATOR)
	WebElement yearElm;
	@FindBy(css=EMAIL_NAME_LOCATOR)
	WebElement emailElm;
	@FindBy(css=HOUSENO_LOCATOR)
	WebElement housenoElm;
	@FindBy(css=ADDRESS_LOCATOR)
	WebElement addElm;
	@FindBy(css=CITY_LOCATOR)
	WebElement cityElm;
	@FindBy(css=STATE_LOCATOR)
	WebElement stateElm;
	@FindBy(css=COUNTRY_LOCATOR)
	WebElement countryElm;
	@FindBy(xpath=POSTCODE_LOCATOR)
	WebElement pcodeElm;
	@FindBy(css=PHONE_LOCATOR)
	WebElement phoneElm;
	@FindBy(css=FAX_LOCATOR)
	WebElement faxElm;
	@FindBy(css=PASSWORD_LOCATOR)
	WebElement passwordElm;
	@FindBy(css=CPASSWORD_LOCATOR)
	WebElement cpasswordElm;
	@FindBy(css=GENDER_VALUE1_LOCATOR)
	WebElement gederElm;
	@FindBy(xpath=TERMS_LOCATOR)
	WebElement termsElm;
	@FindBy(name=SUBMIT_NAME_LOCATOR)
	WebElement submitElm;
	
	private WebDriver registerPageDriver;
	public RegistrationPage(WebDriver driver)
	{
	PageFactory.initElements(driver,this);
	registerPageDriver = driver;
	
	}
	public  void clickonSignupBtn(String fn,String ln,String day, String mon, String yr,
            String email,String houseno, String add, String city,String st,
            String country, String pcode, String ph, String fax, String pwd, String cpwd) throws InterruptedException
      {

	    //Click on SignUp link
		signupLinkElm.click();
		//if(radioBtnElm.isSelected())
			
		//Click on radio button
		radioBtnElm.click();
		//Enter the first name
		fnameElm.sendKeys(fn);
		//Enter the last name
		lnameElm.sendKeys(ln);
		//Enter the day value
		Thread.sleep(1000);
		dayElm.sendKeys(day);
		//Enter the month value
		monthElm.sendKeys(mon);
		//Enter the year value
		yearElm.sendKeys(yr);
		//Enter the email
		emailElm.sendKeys(email);
		//Enter the house no
		housenoElm.sendKeys(houseno);
		//Enter the address
		addElm.sendKeys(add);
	    //Enter the city
	    cityElm.sendKeys(city);
	    //Enter the state
	    stateElm.sendKeys(st);
	    //Enter the country
	    countryElm.sendKeys(country);
	    //Enter the Post code
	    pcodeElm.sendKeys(pcode);
	    //Enter the phone Number
	    phoneElm.sendKeys(ph);
	    //Enter the city
	    faxElm.sendKeys(fax);
	  //Enter the city
	    passwordElm.sendKeys(pwd);
	  //Enter the city
	    cpasswordElm.sendKeys(cpwd);
	    //Click the radio button
	    gederElm.click();
	    //click the check box
	    termsElm.click();
	    //submit  the form
	    submitElm.click();
	 
	    WebElement element  = registerPageDriver.findElement(By.className("fntstyle"));
        String str = element.getText();
	    System.out.println(str);
	    String url= registerPageDriver.getCurrentUrl();
	    Assert.assertEquals("Thank you for signing up. Your account is now created and you can log in by clicking the ACCOUNT button in the main menu above.", str);
   }
	
	public  void clickonSignupBtnWithoutTermsConditions(String fn,String ln,String day, String mon, String yr,
            String email,String houseno, String add, String city,String st,
            String country, String pcode, String ph, String fax, String pwd, String cpwd) throws InterruptedException
      {

	    //Click on SignUp link
		signupLinkElm.click();
		//Click on radio button
		radioBtnElm.click();
		//Enter the first name
		fnameElm.sendKeys(fn);
		//Enter the last name
		lnameElm.sendKeys(ln);
		//Enter the day value
		Thread.sleep(1000);
		dayElm.sendKeys(day);
		//Enter the month value
		monthElm.sendKeys(mon);
		//Enter the year value
		yearElm.sendKeys(yr);
		//Enter the email
		emailElm.sendKeys(email);
		//Enter the house no
		housenoElm.sendKeys(houseno);
		//Enter the address
		addElm.sendKeys(add);
	    //Enter the city
	    cityElm.sendKeys(city);
	    //Enter the state
	    stateElm.sendKeys(st);
	    //Enter the country
	    countryElm.sendKeys(country);
	    //Enter the Post code
	    pcodeElm.sendKeys(pcode);
	    //Enter the phone Number
	    phoneElm.sendKeys(ph);
	    //Enter the city
	    faxElm.sendKeys(fax);
	  //Enter the city
	    passwordElm.sendKeys(pwd);
	  //Enter the city
	    cpasswordElm.sendKeys(cpwd);
	    //Click the radio button
	    gederElm.click();
	    //submit  the form
	    submitElm.click();
	   
	    WebElement element1  = registerPageDriver.findElement(By.className("msg"));
	    String str = element1.getText();
		System.out.println(str);
		Assert.assertEquals("You must agree to the terms and conditions before you can sign up.", str);
   }
	
	
	public  void clickonSignupBtnWithoutEmail(String fn,String ln,String day, String mon, String yr,
                                              String houseno, String add, String city,String st,
                                              String country, String pcode, String ph, String fax, String pwd, String cpwd) throws InterruptedException
      {

	    //Click on SignUp link
		signupLinkElm.click();
		//Click on radio button
		radioBtnElm.click();
		//Enter the first name
		fnameElm.sendKeys(fn);
		//Enter the last name
		lnameElm.sendKeys(ln);
		//Enter the day value
		Thread.sleep(1000);
		dayElm.sendKeys(day);
		//Enter the month value
		monthElm.sendKeys(mon);
		//Enter the year value
		yearElm.sendKeys(yr);
		//Enter the house no
		housenoElm.sendKeys(houseno);
		//Enter the address
		addElm.sendKeys(add);
	    //Enter the city
	    cityElm.sendKeys(city);
	    //Enter the state
	    stateElm.sendKeys(st);
	    //Enter the country
	    countryElm.sendKeys(country);
	    //Enter the Post code
	    pcodeElm.sendKeys(pcode);
	    //Enter the phone Number
	    phoneElm.sendKeys(ph);
	    //Enter the city
	    faxElm.sendKeys(fax);
	    //Enter the city
	    passwordElm.sendKeys(pwd);
	    //Enter the city
	    cpasswordElm.sendKeys(cpwd);
	    //Click the radio button
	    gederElm.click();
	    //click the check box
	    termsElm.click();
	    //submit  the form
	    submitElm.click();
	   
	    WebElement element1  = registerPageDriver.findElement(By.className("msg"));
	    String str = element1.getText();
		System.out.println(str);
		Assert.assertEquals("This email address is already registered.", str);
   }
	
}
