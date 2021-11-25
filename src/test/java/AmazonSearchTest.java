import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import java.util.List;

public class AmazonSearchTest extends TestBase {

    //1. Navigate to the Amazon page
    //2. Type the query and submit
    //3. Specify our result
    //4. View the first result from the result list

    @Parameters({"key"})
    @Test
    public void testSearchAndVerifyResults(String key) throws InterruptedException {
        navigateToAmazonPage();
        typeQueryAndSubmit(key);
        getResults();
        assert "hunter green curtains 84 inch length".equals(key);
    }

    private void getResults() throws InterruptedException {
        List<WebElement> elements = driver.findElements(By.xpath(
                "//span[contains(@class,'a-text-normal')][contains(text(),'Blackout')]"));
        Thread.sleep(5000); // to have time to see the result
        WebElement result = elements.get(0);
        result.click();
        Thread.sleep(5000); // to have time to see the result
    }

    private void typeQueryAndSubmit(String key) {
        String idValue = "twotabsearchtextbox";
        WebElement textInput = driver.findElement(By.id(idValue));
        textInput.sendKeys(key);
        textInput.submit();
    }

    private void navigateToAmazonPage() {
        driver.get("https://www.amazon.com/");
    }
}
