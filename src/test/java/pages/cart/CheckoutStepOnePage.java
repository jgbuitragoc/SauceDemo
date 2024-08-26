package pages.cart;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.basePage.BasePage;

public class CheckoutStepOnePage extends BasePage {
    public CheckoutStepOnePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(className = "title")
    private WebElement checkoutTitle;

    @FindBy(id = "first-name")
    private WebElement firstNameInput;

    @FindBy(id = "last-name")
    private WebElement lastNameInput;

    @FindBy(id = "postal-code")
    private WebElement zipcodeInput;

    @FindBy(css = "input#continue")
    private WebElement continueBtn;

    public CheckoutStepTwoPage fillPersonalInformationAndContinue(String firstname, String lastname, String zipcode) {
        firstNameInput.sendKeys(firstname);
        lastNameInput.sendKeys(lastname);
        zipcodeInput.sendKeys(zipcode);
        continueBtn.click();
        return new CheckoutStepTwoPage(driver);
    }

    public boolean checkoutTitleIsVisible() {
        waitElementVisibility(checkoutTitle);
        return checkoutTitle.isDisplayed()
                &&
                checkoutTitle.getText().equalsIgnoreCase("checkout: your information");
    }


}
