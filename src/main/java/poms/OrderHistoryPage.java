package poms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import utils.BaseDriver;

import java.util.List;

public class OrderHistoryPage extends ParentClass {
    WebDriver driver = BaseDriver.getDriver();
    WebElement myElement;
    By a;

    public OrderHistoryPage() {
        PageFactory.initElements(BaseDriver.getDriver(), this);
    }

    @FindBy(css = "a[title=Orders]")
    private WebElement orderHistoryButton;

    @FindBy(css = "a[class=color-myaccount]")
    private WebElement OrderReferenceList;

    public By OrderReferenceListLocator = By.cssSelector("a[class=color-myaccount]");

    @FindBy(css = "td[class=history_price]")
    private WebElement OrderPriceList;

    public By OrderPriceListLocator = By.cssSelector("td[class=history_price]");


    public void findElementAndClickFunction(String elementName) {

        switch (elementName) {

            case "OrderHistoryButton":
                myElement = orderHistoryButton;
                break;


        }
        clickFunction(myElement);
    }

    public String getTextFromList(String referencetext, int index)  {

        switch (referencetext) {

            case "OrderReferenceList":
                a = OrderReferenceListLocator;
                break;
            case "OrderPriceList":
                a = OrderPriceListLocator;
                break;
        }

        List<WebElement> referenceNames = myElement.findElements(a);
        return referenceNames.get(index).getText();
    }
}
