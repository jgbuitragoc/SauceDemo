package tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import pages.*;
import pages.cart.CartPage;
import pages.cart.CheckoutCompletePage;
import pages.cart.CheckoutStepOnePage;
import pages.cart.CheckoutStepTwoPage;
import utils.baseTest.BaseTest;
import utils.baseTest.LoginBaseTest;

public class PurchaseAProductTest extends LoginBaseTest {

    @Test
    @Parameters({"firstname","lastname","zipcode"})
    public void purchaseAProduct(String firstname, String lastname, String zipcode){
        CartPage cartPage = this.inventory.addProductsToCartAndCheckout();
        Assert.assertTrue(cartPage.cartTitleIsVisible(),"Cart title not found");

        CheckoutStepOnePage checkoutStepOnePage = cartPage.clickCheckout();
        Assert.assertTrue(checkoutStepOnePage.checkoutTitleIsVisible(),"Checkout one title not found");

        CheckoutStepTwoPage checkoutStepTwoPage = checkoutStepOnePage.
                fillPersonalInformationAndContinue(firstname,lastname,zipcode);
        Assert.assertTrue(checkoutStepTwoPage.checkoutTitleIsVisible(),"Checkout two title not found");

        CheckoutCompletePage checkoutCompletePage = checkoutStepTwoPage.clickFinish();
        Assert.assertTrue(checkoutCompletePage.checkoutTitleIsVisible(),"Checkout final title not found");
        Assert.assertTrue(checkoutCompletePage.checkoutSuccessMessageIsVisible(),"Checkout success message not found");
    }

}
