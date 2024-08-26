package pages.cart;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.basePage.BasePage;

public class CheckoutStepTwoPage extends BasePage {
    public CheckoutStepTwoPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(className = "title")
    private WebElement checkoutTitle;

    @FindBy(css = "button#finish")
    private WebElement finishBtn;

    public CheckoutCompletePage clickFinish() {
        finishBtn.click();
        return new CheckoutCompletePage(driver);
    }

    public boolean checkoutTitleIsVisible() {
        waitElementVisibility(checkoutTitle);
        return checkoutTitle.isDisplayed()
                &&
                checkoutTitle.getText().equalsIgnoreCase("checkout: overview");
    }

}
