package poms;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.BaseDriver;

public class SpecialsPage extends ParentClass{

    WebElement myElement;

    public SpecialsPage() {
        PageFactory.initElements(BaseDriver.getDriver(),this);
    }

    @FindBy(css="a[title='Printed Chiffon Dress']>img")
    private WebElement printedChiffonDress;

    @FindBy(xpath="(//a[@class='add_to_compare'])[1]")
    private WebElement printedChiffonDressAddToCompare;

    @FindBy(css="a[title='Printed Summer Dress']>img")
    private WebElement printedSummerDress;

    @FindBy(xpath="(//a[@class='add_to_compare'])[2]")
    private WebElement printedSummerDressAddToCompare;

    @FindBy(css = "form[class='compare-form'] button[type='submit']")
    private WebElement compareButton;

    @FindBy(css = "li>a[class='button lnk_view btn btn-default']")
    private WebElement continueShopping;

    public void findElementAndClickFunction(String elementName) {

        switch (elementName) {
//            case "SigInButton":
//                myElement = signInButton;
//                break;
//            case "SubmitButton":
//                myElement = submitButton;
//                break;
//            case "contacLink":
//                myElement = contacLink;
//                break;
        }
        clickFunction(myElement);
    }

}
