import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.rules.Timeout;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.concurrent.TimeUnit;

import static org.openqa.selenium.support.ui.ExpectedConditions.*;

public class MyFirstTest {

    private WebDriver driver;
    private WebDriverWait wait;

    @Before
    public void start() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
        wait = new WebDriverWait(driver, 1000);
    }

    @Test
    public void MyFirstTest() throws InterruptedException {
        driver.get("http://localhost/litecart/");
        List<WebElement> product;
        product = driver.findElements(new By.ByCssSelector(".product"));
        for (int i = 0; i < product.size(); i++) {
            product.get(i).findElement(By.xpath(".//div[contains(@class,'sticker')]"));
        }
    }





    @After
    public void stop() {
        driver.quit();
        driver = null;
    }
}