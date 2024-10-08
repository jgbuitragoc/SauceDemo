package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.cart.CartPage;
import utils.baseTest.LoginBaseTest;

public class RemoveProductsFromCartTest extends LoginBaseTest {

    @Test
    public void removeProductsFromCart(){
        CartPage cartPage = this.inventory.addProductsToCartAndCheckout();
        Assert.assertTrue(cartPage.cartTitleIsVisible(),"Cart title not found");

        cartPage.removeProductsFromCart();
        Assert.assertTrue(cartPage.checkThereIsNoProducts(),"There is products found.");
    }
}
