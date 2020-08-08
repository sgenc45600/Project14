package poms;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.BaseDriver;

public class ParentClass {

    WebDriver driver;
    WebDriverWait wait;

    public ParentClass() {
        driver = BaseDriver.getDriver();
        this.wait = new WebDriverWait(driver, 10);

//           jlkl
    }

    public void clickFunction(WebElement element) {
        waitUntilClickable(element);
        element.click();
    }

    public void waitUntilClickable(WebElement element) {
        wait.until(ExpectedConditions.elementToBeClickable(element));

    }
    public void sendKeysFunction(WebElement element , String value){

        waitUntilVisible(element);
        element.clear();
        element.sendKeys(value);

    }
    public void waitUntilVisible(WebElement elementToWait){

        wait.until(ExpectedConditions.visibilityOf(elementToWait));
    }
}