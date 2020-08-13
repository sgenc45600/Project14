package steps;

import cucumber.api.java.en.Given;
import org.openqa.selenium.WebDriver;
import poms.ContactPage;
import poms.MainPage;
import poms.ParentClass;
import utils.BaseDriver;

public class OrdersHistorySteps {

    WebDriver driver = BaseDriver.getDriver();
    MainPage mainPage = new MainPage();
    ContactPage contactPage = new ContactPage();
    ParentClass parentClass = new ParentClass();

    @Given("^I click on Order History$")
    public void iClickOnOrderHistory() {
    }
}
