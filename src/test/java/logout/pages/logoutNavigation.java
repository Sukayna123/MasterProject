package logout.pages;

import ZUtility.DriverMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class logoutNavigation extends DriverMethods {

    @FindBy(xpath = "//a[@class='dropdown-toggle']")
    public WebElement myAccount;

    @FindBy(xpath = "//a[text()='Login']")
    public WebElement loginButtonHomePage;

    @FindBy(id = "input-email")
    public WebElement returningCustomerEmailAddress;

    @FindBy(id = "input-password")
    public WebElement returningCustomerPassword;

    @FindBy(xpath = "//input[@type='submit']")
    public WebElement returningCustomerLoginButton;

    @FindBy(xpath = "//a[text()='Logout']")
    public WebElement logoutMyAccount;

//    @FindBy()
//    public WebElement
//
//
//    @FindBy()
//    public WebElement
//
//
//    @FindBy()
//    public WebElement
//
//
//    @FindBy()
//    public WebElement
//
//
//    @FindBy()
//    public WebElement
//
//
//    @FindBy()
//    public WebElement
//
//    @FindBy()
//    public WebElement
//
//
//    @FindBy()
//    public WebElement
//
//    @FindBy()
//    public WebElement
//
//
//    @FindBy()
//    public WebElement
//
//
//    @FindBy()
//    public WebElement
//
//
//    @FindBy()
//    public WebElement
//
//
//    @FindBy()
//    public WebElement
//
//
//    @FindBy()
//    public WebElement
//
//
//    @FindBy()
//    public WebElement
//
//
//    @FindBy()
//    public WebElement
//
//
//    @FindBy()
//    public WebElement
//
//
//    @FindBy()
//    public WebElement
//
//
//    @FindBy()
//    public WebElement
}


