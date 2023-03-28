package logout.stepDefenitions;

import ZUtility.Driver;
import ZUtility.DriverMethods;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import logout.pages.logoutNavigation;
import org.testng.annotations.BeforeClass;

public class LogoutStep  extends Driver {
logoutNavigation lg=new logoutNavigation();



    @Given("navigate to opencart")
    public void navigateToOpencart() {
getDriver().manage().deleteAllCookies();
getDriver().get("https://demo.opencart.com/");
getDriver().manage().window().maximize();
    }


    @When("User is logged in")
    public void userIsLoggedIn() {
lg.clickMethod(lg.myAccount);
lg.clickMethod(lg.loginButtonHomePage);
lg.sendKeyMethod(lg.returningCustomerEmailAddress,"loveizzy@gmail.com");
lg.sendKeyMethod(lg.returningCustomerPassword,"123456");
lg.clickMethod(lg.loginButtonHomePage);

    }

//    @And("Click on My Account")
//    public void clickOnMyAccount() {
//        lg.clickMethod(lg.myAccount);
//    }
//
//    @And("Select Logout")
//    public void selectLogout() {
//        lg.clickMethod(lg.logoutMyAccount);
//    }
//
//    @Then("Click on  Continue button")
//    public void clickOnContinueButton() {
//        lg.clickMethod(lg.);
//    }
}
