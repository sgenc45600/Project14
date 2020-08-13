package steps;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import poms.ContactPage;
import poms.MainPage;
import poms.OrderHistoryPage;
import poms.ParentClass;
import utils.BaseDriver;

import java.util.List;

public class OrdersHistorySteps {

    WebDriver driver = BaseDriver.getDriver();
    MainPage mainPage = new MainPage();
    ContactPage contactPage = new ContactPage();
    ParentClass parentClass = new ParentClass();
    OrderHistoryPage orderPage = new OrderHistoryPage();

    @When("^I click Order History And Details Button$")
    public void i_click_Order_History_And_Details_Button() {
        orderPage.findElementAndClickFunction("OrderHistoryButton");

    }

    @Then("^I compare Order Reference and Total Price in the Order History Page to DataTable$")
    public void i_compare_Order_Reference_and_Total_Price_in_the_Order_History_Page_to_DataTable(DataTable table) throws InterruptedException {
        List<List<String>> strings = table.asLists(String.class);
        for (int i = 0; i < strings.size(); i++) {
            for (int j = 0; j < strings.get(i).size(); j++) {
                if (strings.get(i).get(0).equals(orderPage.getTextFromList("OrderReferenceList", i)))
                    Assert.assertEquals(strings.get(i).get(1),orderPage.getTextFromList("OrderPriceList",i));
                //I get order number from web page and compare it with DataTable, if it is true. than i get order price
                //from web page and compare it with data table with Asser
            }

        }
    }
}
