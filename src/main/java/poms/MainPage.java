package poms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.BaseDriver;

public class MainPage extends ParentClass {

    public MainPage() {
        PageFactory.initElements(BaseDriver.getDriver(), this);
    }

    @FindBy(className = "login")
    private WebElement signInButton;

    @FindBy(id = "email")
    private WebElement email;

    @FindBy(id = "passwd")
    private WebElement passWord;

    @FindBy(id = "SubmitLogin")
    private WebElement submitButton;

    @FindBy(id = "contact-link")
    private WebElement contacLink;
    //public By deneme = By.id("contact-link");

    WebElement myElement;
    WebDriverWait wait;

    public void findElementAndClickFunction(String elementName) {

        switch (elementName) {

            case "SigInButton":
                myElement = signInButton;
                break;
            case "SubmitButton":
                myElement = submitButton;
                break;

            case "contacLink":
                myElement = contacLink;
                break;

        }
        clickFunction(myElement);
    }

    public void findElementAndSendKeysFunction(String elementName, String Keys) {
        switch (elementName) {
            case "email":
                myElement = email;
                break;
            case "passWord":
                myElement = passWord;
                break;
        }
        sendKeysFunction(myElement, Keys);
    }


}
