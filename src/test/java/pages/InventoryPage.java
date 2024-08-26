package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.cart.CartPage;

public class InventoryPage extends MainPage {
    public InventoryPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(className = "app_logo")
    private WebElement appLogoTxt;

    @FindBy(id = "add-to-cart-sauce-labs-backpack")
    private WebElement addBackpackToCartBtn;

    @FindBy(id = "add-to-cart-sauce-labs-bike-light")
    private WebElement addBikeLightToCartBtn;

    @FindBy(id = "add-to-cart-sauce-labs-bolt-t-shirt")
    private WebElement addBoltShirtToCartBtn;

    @FindBy(className = "shopping_cart_link")
    private WebElement shoppingCartLink;

    public CartPage addProductsToCartAndCheckout(){
        addBackpackToCartBtn.click();
        addBikeLightToCartBtn.click();
        addBoltShirtToCartBtn.click();
        shoppingCartLink.click();
        return new CartPage(driver);
    }


    public boolean logoTxtIsVisible() {
        waitElementVisibility(appLogoTxt);
        return appLogoTxt.isDisplayed()
                &&
                appLogoTxt.getText().equalsIgnoreCase("swag labs");
    }
}
