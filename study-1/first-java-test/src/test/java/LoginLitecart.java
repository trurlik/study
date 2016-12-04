import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import static org.openqa.selenium.support.ui.ExpectedConditions.titleIs;

/**
 * Created by trurlik_2 on 04.12.2016.
 */
public class LoginLitecart {

    private WebDriver driver;
    private WebDriverWait wait;

    @Before
    public void start() {
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver,10);
        driver.get("http://localhost/litecart/public_html/admin/");
    }

    @Test
    public void firstTest() {
        WebElement login = driver.findElement(By.name("username"));
        login.sendKeys("admin");

        WebElement pass = driver.findElement(By.name("password"));
        pass.sendKeys("admin");

        driver.findElement(By.name("login")).click();
    }

    @After
    public void stop() {
        driver.quit();
        driver = null;
    }


}
