package registration;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.fail;

public class TestBase  {
    public WebDriver driver;
    public PageManager page = new PageManager();

    @Before
    public void setUp() throws Exception {
            System.setProperty("webdriver.chrome.driver", "chromedriver");
            page.driver = new ChromeDriver();
            page.driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        }

    @After
        public void tearDown() throws Exception {
            page.driver.quit();
            String verificationErrorString = page.verificationErrors.toString();
            if (!"".equals(verificationErrorString)) {
                fail(verificationErrorString);
        }
    }

//    public PageManager getPage() {
//        return page;
//    }
}
