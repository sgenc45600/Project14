package steps;

import cucumber.api.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import poms.ContactPage;
import poms.MainPage;
import poms.ParentClass;
import poms.SpecialsPage;
import utils.BaseDriver;

public class SpecialsSteps {

    WebDriver driver = BaseDriver.getDriver();
    MainPage mainPage = new MainPage();
    ContactPage contactPage = new ContactPage();
    ParentClass parentClass = new ParentClass();
    SpecialsPage specialsPage=new SpecialsPage();

    @Then("^Click Specials$")
    public void clickSpecials() {

        mainPage.findElementAndClickFunction("specials");
    }

    @Then("^Sort by price Lowest First$")
    public void sortByPriceLowestFirst() {
        specialsPage.selectList("sortByButton","Price: Lowest first");

    }

    @Then("^Find out the number of the special items$")
    public void findOutTheNumberOfTheSpecialItems() {

        specialsPage.getNumberOfItems();

    }

    @Then("^Check the discounted prices$")
    public void checkTheDiscountedPrices() {
        specialsPage.checkThePrices(specialsPage.oldPrices,specialsPage.currentPrices,specialsPage.discountPercent);

            }

}
