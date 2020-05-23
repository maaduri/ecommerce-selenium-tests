package com.apex.ecommerce.signon.page;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.WebDriver;
import com.apex.ecommerce.signon.constant.SiononConstant;

public class SignonPage implements SiononConstant{
	
@FindBy(name=EMAIL_NAME_LOCATOR)
WebElement emailIdElm;
@FindBy(name=PWD_NAME_LOCATOR)
WebElement passwordElm;
@FindBy(linkText =LOGIN_BTN_LINK_TEXT_LOCATOR)
WebElement loginBtnElm;

public SignonPage(WebDriver driver)
{
PageFactory.initElements(driver,this);
}
public void clickonLoginBtn(String email, String pwd) throws InterruptedException{

//Enter the email
  emailIdElm.sendKeys(email);
  Thread.sleep(1000);
  //enter the passowrd
  passwordElm.sendKeys(pwd);
  Thread.sleep(1000);
  //click on th ebutton
  loginBtnElm.click();
 }
}



