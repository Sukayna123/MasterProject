package ZUtility;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class DriverMethods {
    public WebDriverWait wait=new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));


    public void sendKeyMethod(WebElement element, String keys){
      waitUntilVisible(element);
        scrollToElement(element);
        element.clear();
        element.sendKeys(keys);
    }

    public void waitUntilVisible(WebElement element){
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    public void scrollToElement(WebElement element){
        JavascriptExecutor js=(JavascriptExecutor) Driver.getDriver();
        js.executeScript("arguments[0].scrollIntoView;",element);
    }

    public void waitUntilClickable(WebElement element){
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    public void clickMethod(WebElement element){
        waitUntilClickable(element);
        scrollToElement(element);
        element.click();
    }

    public void verifyingContainsText(WebElement element, String value){
        waitUntilVisible(element);
        Assert.assertTrue(element.getText().contains(value));
    }
    public boolean isDisplayedMethod(WebElement element){
        waitUntilClickable(element);
        return element.isDisplayed();
    }
    public void hardWait(int time ){
        try {
            Thread.sleep(1000L *time );
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

}
