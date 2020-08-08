package steps;

import cucumber.api.java.en.*;
import org.openqa.selenium.WebDriver;
import poms.ContactPage;
import poms.MainPage;
import poms.ParentClass;
import utils.BaseDriver;

public class ContactUsSteps {
    WebDriver driver = BaseDriver.getDriver();
    MainPage mainPage = new MainPage();
    ContactPage contactPage = new ContactPage();
    ParentClass parentClass = new ParentClass();

    @Given("^I navigate to Website$")
    public void i_navigate_to_Website() throws Exception {
        driver.get("http://automationpractice.com/");
        driver.manage().window().maximize();
    }

    @When("^I click on sign in button$")
    public void i_click_on_sign_in_button() throws Exception {
        mainPage.findElementAndClickFunction("SigInButton");
    }

    @Then("^I enter email: \"([^\"]*)\" I enter password: \"([^\"]*)\"$")
    public void i_enter_email_I_enter_password(String email, String passwd) {
        mainPage.findElementAndSendKeysFunction("email", email);
        mainPage.findElementAndSendKeysFunction("passWord", passwd);

    }

    @Then("^I click submit button$")
    public void i_click_submit_button() {
        mainPage.findElementAndClickFunction("SubmitButton");

    }


    @Given("^I click on contact us button$")
    public void i_click_on_contact_us_button() {
        mainPage.findElementAndClickFunction("contacLink");

    }

    @When("^I select an \"([^\"]*)\" from Subject Heading$")
    public void i_select_an_from_Subject_Heading(String menuOption) throws InterruptedException {
        contactPage.selectList("id_contact", menuOption);
    }

    @When("^I select an \"([^\"]*)\" from Order Reference$")
    public void i_select_an_from_Order_Reference(String orderReference) throws InterruptedException {
        contactPage.selectList("id_order", orderReference);
    }

    @When("^I select product from product input$")
    public void i_select_product_from_product_input() {

    }

    @Then("^I enter \"([^\"]*)\"$")
    public void i_enter(String message) {
        contactPage.findElementAndSendKeysFunction("message", message);
    }

    @Then("^I click Send button$")
    public void i_click_Send_button() {
        contactPage.findElementAndClickFunction("submitMessage");
    }


}
