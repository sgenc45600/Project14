package poms;

import org.testng.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import utils.BaseDriver;
import java.util.List;

public class SpecialsPage extends ParentClass {

    WebElement myElement;

    public SpecialsPage() {
        PageFactory.initElements(BaseDriver.getDriver(), this);
    }

    @FindBy(css = "a[title='Printed Chiffon Dress']>img")
    private WebElement printedChiffonDress;

    @FindBy(xpath = "(//a[@class='add_to_compare'])[1]")
    private WebElement printedChiffonDressAddToCompare;

    @FindBy(css = "a[title='Printed Summer Dress']>img")
    private WebElement printedSummerDress;

    @FindBy(xpath = "(//a[@class='add_to_compare'])[2]")
    private WebElement printedSummerDressAddToCompare;

    @FindBy(css = "form[class='compare-form'] button[type='submit']")
    private WebElement compareButton;

    @FindBy(css = "li>a[class='button lnk_view btn btn-default']")
    private WebElement continueShopping;

    @FindBy(css = "select[id='selectProductSort']")
    private WebElement sortByButton;

    public By productList=By.xpath("//div[@class='product-container']");
    public By currentPrices=By.cssSelector("li>div>div>div>span[itemprop='price']");
    public By oldPrices=By.cssSelector("li>div>div>div>span[class='old-price product-price']");
    public By discountPercent=By.cssSelector("li>div>div>div>span[class='price-percent-reduction']");


    public void selectList(String elementName, String menuOption) {

        switch (elementName) {
            case "sortByButton":
                myElement = sortByButton;
                break;
        }
        Select statusDropdown = new Select(myElement);
        statusDropdown.selectByVisibleText(menuOption);
    }

    public int getNumberOfItems() {
        List<WebElement> list=BaseDriver.getDriver().findElements(productList);
        System.out.println("Number of items: "+list.size());
        return list.size();
    }
    public void checkThePrices(By oldPrices, By currentPrices, By discountPercent){
        List<WebElement> oldPriceList=BaseDriver.getDriver().findElements(oldPrices);
        List<WebElement> currentPriceList=BaseDriver.getDriver().findElements(currentPrices);
        List<WebElement> discountPercentList=BaseDriver.getDriver().findElements(discountPercent);

        Double oldPrice,currentPrice,discountPercents;
        for(int i=0; i<oldPriceList.size();i++){
            oldPrice=Double.parseDouble(oldPriceList.get(i).getText().replaceAll("[^0-9.]",""));
            currentPrice=Double.parseDouble(currentPriceList.get(i).getText().replaceAll("[^0-9.]",""));
            discountPercents=Double.parseDouble(discountPercentList.get(i).getText().replaceAll("[^0-9.]",""));

            System.out.println("old price:"+oldPrice);
            System.out.println("current price:"+currentPrice);
            System.out.println("percent:"+discountPercents+"\n");

            Assert.assertEquals(currentPrice,oldPrice-oldPrice*(discountPercents/100),0.1);
        }



    }
}