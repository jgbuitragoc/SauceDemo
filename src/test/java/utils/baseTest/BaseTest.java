package utils.baseTest;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import utils.MyDriver;

public class BaseTest {

    MyDriver driver;

    @BeforeMethod(alwaysRun = true)
    @Parameters({"browser","url"})
    public void beforeMethod(String browser,String url){
        driver = new MyDriver(browser);
        driver.getDriver().manage().window().maximize();
        navigateTo(url);
    }

    public void navigateTo(String url){
        driver.getDriver().get(url);
    }


    @AfterMethod()
    public void afterMethod(){
        driver.getDriver().close();
    }

    public WebDriver getDriver() {
        return driver.getDriver();
    }
}
