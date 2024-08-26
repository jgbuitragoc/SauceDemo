package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.basePage.BasePage;

public class MainPage extends BasePage {
    public MainPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "button#react-burger-menu-btn")
    private WebElement burgerMenuBtn;

    @FindBy(id = "logout_sidebar_link")
    private WebElement logoutLink;

    public LoginPage logout(){
        burgerMenuBtn.click();
        waitElementVisibility(logoutLink);
        logoutLink.click();
        return new LoginPage(driver);
    }


}
