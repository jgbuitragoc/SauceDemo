package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;
import utils.baseTest.LoginBaseTest;

public class LogoutTest extends LoginBaseTest {

    @Test
    public void logout() {
        LoginPage loginPage = inventory.logout();
        Assert.assertTrue(loginPage.logoTxtIsVisible(), "The logo text is not visible");
    }
}
