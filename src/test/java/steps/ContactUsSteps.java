package steps;

import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.en.*;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
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
        driver = BaseDriver.getDriver();
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

    @And("^I select \"([^\"]*)\" from product input$")
    public void iSelectFromProductInput(String product) throws InterruptedException {
        contactPage.selectList("id_product", product);
    }

    @Then("^I enter \"([^\"]*)\"$")
    public void i_enter(String message) {
        contactPage.findElementAndSendKeysFunction("message", message);
    }

    @Then("^I click Send button$")
    public void i_click_Send_button() {
        contactPage.findElementAndClickFunction("submitMessage");

    }

//    @After
//    public void after() {
//
//        BaseDriver.getDriver().quit();
//
//    }

    @Then("^Sign out$")
    public void signOut() {
        contactPage.findElementAndClickFunction("signOut");

    }

    @Then("^I verify \"([^\"]*)\" text$")
    public void iVerifyText(String successfullyMessage) {
        // Write code here that turns the phrase above into concrete actions
        contactPage.findElementAndVerifyElementContainsText("successfullyMessage",successfullyMessage);
    }
}