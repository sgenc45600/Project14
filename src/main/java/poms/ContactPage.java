package poms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import utils.BaseDriver;

public class ContactPage extends ParentClass {
    WebDriver driver = BaseDriver.getDriver();
    WebElement myElement;

    public ContactPage() {
        PageFactory.initElements(BaseDriver.getDriver(), this);
    }

    @FindBy(id = "id_contact")
    private WebElement idContact;

    @FindBy(css = "[name=id_order]")
    private WebElement idOrder;

    @FindBy(id = "message")
    private WebElement message;

    @FindBy(id = "submitMessage")
    private WebElement submitMessage;

    @FindBy(css = "select[style='display: inline-block;']")
    private WebElement idProduct;

    @FindBy(css ="a[class='logout']")
    private WebElement signOut;


    public void findElementAndClickFunction(String elementName) {

        switch (elementName) {
            case "submitMessage":
                myElement = submitMessage;
                break;
            case "signOut":
                myElement = signOut;
                break;
        }
        clickFunction(myElement);
    }

    public void selectList(String elementName, String menuOption) throws InterruptedException {

        switch (elementName) {
            case "id_contact":
                myElement = idContact;
                break;
            case "id_order":
                myElement = idOrder;
                break;

            case "id_product":
                myElement = idProduct;
                break;


        }

    //    Thread.sleep(3000);
        Select statusDropdown = new Select(myElement);
        statusDropdown.selectByVisibleText(menuOption);

    }

    public void findElementAndSendKeysFunction(String elementName, String Keys) {
        switch (elementName) {
            case "message":
                myElement = message;
                  break;
        }
        sendKeysFunction(myElement, Keys);
    }

}

