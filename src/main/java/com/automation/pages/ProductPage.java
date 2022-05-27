package com.automation.pages;

import com.automation.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductPage extends Utility {
    public ProductPage() {
        PageFactory.initElements(driver, this);
    }

    private static final Logger log = LogManager.getLogger(ProductPage.class.getName());

    @CacheLookup

    @FindBy(xpath = "//input[@id='quantity_wanted']")
    WebElement quantity;
    @CacheLookup
    @FindBy(xpath = "//select[@id='group_1']")
    WebElement size;
    @CacheLookup
    @FindBy(xpath = "//label[contains(text(),'Color')]")
    WebElement colour;
    @CacheLookup
    @FindBy(xpath = "//span[contains(text(),'Add to cart')]")
    WebElement addToCart;
    @CacheLookup
    @FindBy(xpath = "//body/div[@id='page']/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/div[4]/form[1]/div[1]/div[2]/p[1]/a[2]/span[1]/i[1]")
    WebElement addQuntity;
    @CacheLookup
    @FindBy(xpath = "//h2[normalize-space()='Product successfully added to your shopping cart']")
    WebElement popUpDisplay;
    @CacheLookup
    @FindBy(xpath = "//span[@title='Close window']")
    WebElement closeButton;

    @CacheLookup
    @FindBy(xpath = "//a[@name='White']")
    WebElement whiteColour;
    @CacheLookup
    @FindBy(xpath = "//a[@name='Orange']")
    WebElement orangeColour;
    @CacheLookup
    @FindBy(xpath = "//a[@id='color_20']")
    WebElement blueColour;
    @CacheLookup
    @FindBy(xpath = "//a[@name='Green']")
    WebElement greenColour;
    @CacheLookup
    @FindBy(xpath = "//body/div[@id='page']/div[2]/div[1]/div[3]/div[2]/ul[1]/li[2]/div[1]/div[2]/h5[1]/a[1]")
    WebElement blouse;
    @CacheLookup
    @FindBy(xpath = "//body/div[@id='page']/div[2]/div[1]/div[3]/div[2]/ul[1]/li[1]/div[1]/div[2]/h5[1]/a[1]")
    WebElement printedDress;
    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Printed Chiffon Dress')]")
    WebElement chiffonPrintedDress;
    @CacheLookup
    @FindBy(xpath = "//body/div[@id='page']/div[2]/div[1]/div[3]/div[2]/ul[1]/li[4]/div[1]/div[2]/h5[1]/a[1]")
    WebElement summerDress;
    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Faded Short Sleeve T-shirts')]")
    WebElement fadedShortSleeve;
    @CacheLookup
    @FindBy(xpath = "//header/div[3]/div[1]/div[1]/div[6]/ul[1]/li[2]/ul[1]/li[1]/a[1]")
    WebElement casualDress;
    @CacheLookup
    @FindBy(xpath = "//header/div[3]/div[1]/div[1]/div[6]/ul[1]/li[1]/ul[1]/li[1]/a[1]")
    WebElement topsSubcategory;
    @CacheLookup
    @FindBy(xpath = "//ul[@class='sf-menu clearfix menu-content sf-js-enabled sf-arrows']//li//a")
    WebElement category;

    public void clickOnCasualDress() {
        clickOnElement(casualDress);
        log.info("Clicking on Plus" + casualDress.toString());

    }
    public void clickOnPrintedDress() {
        clickOnElement(printedDress);
        log.info("Clicking on Plus" + printedDress.toString());

    }
    public void clickOnTop() {
        clickOnElement(topsSubcategory);
        log.info("Clicking on Plus" + topsSubcategory.toString());

    }


    public void clickOnPlus() {
        clickOnElement(addQuntity);
        log.info("Clicking on Plus" + addQuntity.toString());

    }

    public void clearQuantity() {
        log.info("clear Quantity" + quantity.toString());
        clearTextToElement(quantity);
    }

    public void enterQuantity(String quant) {
        sendTextToElement(quantity, quant);
        log.info("Enter quantity" + quant + " quantity field " + quantity.toString());
    }

    public void selectSize(String sizefromDD) {
        selectByVisibleTextFromDropDown(size, sizefromDD);
        log.info("Selecting Size" + sizefromDD + " from dropdown " + size.toString());
    }

    public void clickOncolor() {
        log.info("Clicking on color" + colour.toString());
        clickOnElement(colour);
    }

    public void clickOnAddToCart() {
        clickOnElement(addToCart);
        log.info("Clicking on AddToCart" + addToCart.toString());
    }

    public void changeQuantity(String numbers) {
        sendTextToElement(quantity, numbers);
        log.info("Enter  change Quantity" + numbers + " to email field " + quantity.toString());
    }

    public String verifyProductAddedToCartMessage() {
        log.info("getting Product Added To CartMessage from " + popUpDisplay.toString());
        return getTextFromElement(popUpDisplay);
    }

    public void clickOnCloseButton() {
        clickOnElement(closeButton);
        log.info("Clicking on CloseButton" + closeButton.toString());
    }

    public void selectProductName(String text) {
        if (text.equalsIgnoreCase("Printed Dress")) {
            clickOnElement(printedDress);
            log.info("Clicking on Blouse " + printedDress.toString());
        }

        if (text.equalsIgnoreCase("Faded Short Sleeve T-shirts")) {
            log.info("Clicking on Faded Short Sleeve T-shirts " + fadedShortSleeve.toString());
            clickOnElement(fadedShortSleeve);

        }
    }

    public void selectfromCategory(String main){

        if (main == "Dresses") {
                    clickOnElement(category);
                    log.info("Clicking on Colour" + category.toString());
                } else if (main == "Women") {
                    clickOnElement(category);
                    log.info("Clicking on Colour" + category.toString());
                }
            }

        }


