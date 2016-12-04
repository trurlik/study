import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import static org.openqa.selenium.support.ui.ExpectedConditions.titleIs;

/**
 * Created by trurlik_2 on 04.12.2016.
 */
public class FirstJavaTest {

    private WebDriver driver;
    private WebDriverWait wait;

    @Before
    public void start() {
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver,10);
    }

    @Test
    public void firstTest() {
        driver.get("http://software-testing.ru");
    //    wait();
    }

    @After
    public void stop() {
        driver.quit();
        driver = null;
    }


}
