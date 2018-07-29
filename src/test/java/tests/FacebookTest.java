package tests;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.Test;
import org.junit.Assert;

import java.util.concurrent.TimeUnit;


public class FacebookTest {

    public WebDriver driver;

    @Test
    public void anExampleTest() {
        System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
        // Start a new Chrome browser instance and maximize the browser window
        driver = new ChromeDriver();
        driver.manage().window().maximize();

        // Navigate to the Amazon.com home page
        driver.get("https://www.facebook.com/");

        WebElement username = driver.findElement(By.xpath("//*[@id=\"email\"]"));
        username.click();
        username.sendKeys("yourusername");
//        TimeUnit.SECONDS.sleep(3);

        WebElement password = driver.findElement(By.xpath("//*[@id=\"pass\"]"));
        password.click();
        password.sendKeys("yourpassword");
//        TimeUnit.SECONDS.sleep(3);

        password.sendKeys(Keys.ENTER);

        driver.quit();

    }
}
