package pages.cart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.basePage.BasePage;

import java.util.List;

public class CartPage extends BasePage {
    public CartPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "button#checkout")
    private WebElement checkoutBtn;

    @FindBy(css = "button#remove-sauce-labs-backpack")
    private WebElement removeBackpackToCartBtn;

    @FindBy(css = "button#remove-sauce-labs-bike-light")
    private WebElement removeBikeLightToCartBtn;

    @FindBy(css = "button#remove-sauce-labs-bolt-t-shirt")
    private WebElement removeBoltShirtToCartBtn;

    @FindBy(className = "title")
    private WebElement cartTitle;

    public boolean cartTitleIsVisible() {
        waitElementVisibility(cartTitle);
        return cartTitle.isDisplayed()
                &&
                cartTitle.getText().equalsIgnoreCase("your cart");
    }

    public CheckoutStepOnePage clickCheckout() {
        checkoutBtn.click();
        return new CheckoutStepOnePage(driver);
    }

    public void removeProductsFromCart() {
        removeBackpackToCartBtn.click();
        removeBikeLightToCartBtn.click();
        removeBoltShirtToCartBtn.click();
    }

    public boolean checkThereIsNoProducts() {
        List<WebElement> removedProducts = driver.findElements(new By.ByCssSelector("div.removed_cart_item"));
        return removedProducts.size() == 3;
    }
}

