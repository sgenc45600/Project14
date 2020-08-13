package poms;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import utils.BaseDriver;

public class ParentClass {

    WebDriver driver;
    WebDriverWait wait;

    public ParentClass() {
        driver = BaseDriver.getDriver();
        this.wait = new WebDriverWait(driver, 10);
    }

    public void clickFunction(WebElement element) {
        waitUntilClickable(element);
        element.click();
    }


    public void sendKeysFunction(WebElement element, String value) {
        waitUntilVisible(element);
        element.clear();
        element.sendKeys(value);
    }

    public void waitUntilClickable(WebElement element) {
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    public void waitUntilVisible(WebElement elementToWait) {
        wait.until(ExpectedConditions.visibilityOf(elementToWait));
    }

    public void ElementContainsText(WebElement element, String text) {
        waitUntilVisible(element);
        Assert.assertTrue(element.getText().contains(text));
    }
}


