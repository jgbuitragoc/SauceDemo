package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.basePage.BasePage;

public class LoginPage extends BasePage {
    public LoginPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "div.login_logo")
    private WebElement title;
    @FindBy(id = "user-name")
    private WebElement usernameInput;
    @FindBy(id = "password")
    private WebElement passwordInput;
    @FindBy(id = "login-button")
    private WebElement loginBtn;

    public InventoryPage Login(String username,String password){
        usernameInput.sendKeys(username);
        passwordInput.sendKeys(password);
        loginBtn.click();
        return new InventoryPage(driver);
    }

    public boolean logoTxtIsVisible() {
        waitElementVisibility(title);
        return title.isDisplayed()
                &&
                title.getText().equalsIgnoreCase("swag labs");
    }
}
