import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import java.math.BigDecimal;
import java.util.List;

public class AmazonSearchTest extends TestBase {


    //1. Navigate to the Amazon page
    //2. Type the query and submit
    //3. Specify our result to get more correct search result
    //3a.See first item from the search result

    @Test
    public void testSearchAndVerifyResults() throws InterruptedException {
        navigateToAmazonPage();
        typeQueryAndSubmit();
        getResults();
    }

    private void getResults() throws InterruptedException {
        List<WebElement> elements = driver.findElements(By.xpath(
                "//span[contains(@class,'a-text-normal')][contains(text(),'Green')][contains(text(),'Blackout')]"));
        Thread.sleep(3000);
        WebElement result = elements.get(1);
        result.click();

        //driver.findElement(By.xpath("//span[contains(@class,'a-text-normal')][contains(text(),'Green')][contains(text(),'Blackout')][1]")).click();
        Thread.sleep(3000); // to have time to see the result
    }

    private void typeQueryAndSubmit() {
        String idValue = "twotabsearchtextbox";
        WebElement textInput = driver.findElement(By.id(idValue));
        textInput.sendKeys("green curtains 84 inch length");
        textInput.submit();
    }

    private void navigateToAmazonPage() {
        driver.get("https://www.amazon.com/");
    }
}
