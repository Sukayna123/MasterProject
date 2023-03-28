package forgotPassword.pages;

import ZUtility.Driver;
import ZUtility.DriverMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ForgotPasswordPage extends DriverMethods {

public ForgotPasswordPage(){
    PageFactory.initElements(Driver.getDriver(),this);
}


    @FindBy(xpath = "//a[@class='dropdown-toggle']")
    public WebElement myAccount;

    @FindBy(xpath = "//a[text()='Login']")
    public WebElement loginButtonHomePage;


    @FindBy(xpath = "//a[text()='Forgotten Password']")
    public WebElement forgotPasswordLoginPage;

    @FindBy (id = "input-email")
    public WebElement emailAddressBoxForgotPasswordPage;

    @FindBy(xpath = "//input[@type='submit']")
    public WebElement continueButtonForgotPasswordPage;

    @FindBy(xpath = "//*[@class='alert alert-danger alert-dismissible']")
    public WebElement warningMessageNoEmailFound;

    @FindBy(linkText ="https://opencart.abstracta.us:443/index.php?route=account/forgotten"  )
    public WebElement forgotPasswordRightColumn;




    public WebElement getMyAccount() {
        return myAccount;
    }

    public WebElement getLoginButtonHomePage() {
        return loginButtonHomePage;
    }

    public WebElement getForgotPasswordLoginPage() {
        return forgotPasswordLoginPage;
    }

    public WebElement getEmailAddressBoxForgotPasswordPage() {
        return emailAddressBoxForgotPasswordPage;
    }

    public WebElement getContinueButtonForgotPasswordPage() {
        return continueButtonForgotPasswordPage;
    }

    public WebElement getWarningMessageNoEmailFound() {
        return warningMessageNoEmailFound;
    }

    public WebElement getForgotPasswordRightColumn() {
        return forgotPasswordRightColumn;
    }
}
