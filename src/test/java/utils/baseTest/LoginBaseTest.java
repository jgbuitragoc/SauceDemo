package utils.baseTest;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import pages.InventoryPage;
import pages.LoginPage;

public class LoginBaseTest extends BaseTest{
    protected InventoryPage inventory;

    @BeforeMethod
    @Parameters({"username","password"})
    public void beforePurchase(String username,String password){
        LoginPage loginPage = new LoginPage(getDriver());
        inventory = loginPage.Login(username,password);
    }
}
