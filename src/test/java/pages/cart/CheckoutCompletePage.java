package pages.cart;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.basePage.BasePage;

public class CheckoutCompletePage extends BasePage {
    public CheckoutCompletePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(className = "title")
    private WebElement checkoutTitle;

    @FindBy(className = "complete-header")
    private WebElement checkoutSuccessMessage;



    public boolean checkoutTitleIsVisible() {
        waitElementVisibility(checkoutTitle);
        return checkoutTitle.isDisplayed()
                &&
                checkoutTitle.getText().equalsIgnoreCase("checkout: complete!");
    }

    public boolean checkoutSuccessMessageIsVisible(){
        waitElementVisibility(checkoutSuccessMessage);
        return checkoutSuccessMessage.isDisplayed()
                &&
                checkoutSuccessMessage.getText().equalsIgnoreCase("thank you for your order!");
    }
}
