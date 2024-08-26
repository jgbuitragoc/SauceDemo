package tests;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import pages.InventoryPage;
import pages.LoginPage;
import utils.baseTest.BaseTest;

public class LoginTest extends BaseTest {

    @Test
    @Parameters({"username","password"})
    public void login(String username,String password){
        LoginPage loginPage = new LoginPage(getDriver());
        InventoryPage inventory = loginPage.Login(username,password);
        Assert.assertTrue(inventory.logoTxtIsVisible(),"The logo text is not visible");
    }

}
