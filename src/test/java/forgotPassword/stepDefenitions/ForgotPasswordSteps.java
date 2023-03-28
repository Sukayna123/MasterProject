package forgotPassword.stepDefenitions;

import ZUtility.Driver;
import forgotPassword.pages.ForgotPasswordPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class ForgotPasswordSteps {
    ForgotPasswordPage fp=new ForgotPasswordPage();
    @Given("Navigate to web site")
    public void navigateToWebSite() {
        Driver.getDriver().get("http://opencart.abstracta.us/index.php?route=common/home");
    }

    @And("Click on Forgotten Password link from Login page")
    public void clickOnForgottenPasswordLinkFromLoginPage() {
        fp.clickMethod(fp.getMyAccount());
        fp.clickMethod(fp.getLoginButtonHomePage());
        fp.clickMethod(fp.getForgotPasswordLoginPage());
    }
    @Then("Enter any invalid formatted email address into the {string} field")
    public void enterAnyInvalidFormattedEmailAddressIntoTheField(String emailAddress) {
        fp.sendKeyMethod(fp.getEmailAddressBoxForgotPasswordPage(), emailAddress);
        fp.clickMethod(fp.getContinueButtonForgotPasswordPage());
        Assert.assertTrue(fp.getWarningMessageNoEmailFound().isDisplayed());
    }


    @And("Click on Forgotten Password option from the Right Column")
    public void clickOnForgottenPasswordOptionFromTheRightColumn() {
        fp.clickMethod(fp.getForgotPasswordRightColumn());
    }
}
