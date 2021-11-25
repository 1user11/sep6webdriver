import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

public class TestBase {

    WebDriver driver;

    @Parameters({"browser"})
    @BeforeSuite
    public void suiteSetup(@Optional("Chrome") String browser) {
        String os = System.getProperty("os.name");

        if (os.contains("Mac")) {
            System.setProperty("webdriver.chrome.driver", "src/test/resources/macos/m1/chromedriver4638");
            System.setProperty("webdriver.gecko.driver", "src/test/resources/macos/m1/geckodriverAarch64");
        }

        if (os.contains("Windows")) {
            System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
            System.setProperty("webdriver.gecko.driver", "src/test/resources/geckodriver.exe");
        }

        if (browser.equalsIgnoreCase("Firefox")) {
            driver = new FirefoxDriver();
        }

        if (browser.equalsIgnoreCase("Chrome")) {
            driver = new ChromeDriver();
        }
    }

    @AfterSuite
    public void afterSuite() {
        driver.quit();
    }

}
