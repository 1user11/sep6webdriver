package xPath;


import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.io.IOException;

public class DropDownList extends TestBase{

    @Test
    public void testSelectOptions() {
        driver.get("https://the-internet.herokuapp.com/dropdown");

        WebElement dropDown = driver.findElement(By.xpath("//select[@id='dropdown']"));
        WebElement option1 = driver.findElement(By.xpath("//option[contains(text(),'Option 1')]"));
        WebElement option2 = driver.findElement(By.xpath("//option[contains(text(),'Option 2')]"));

        option1.click();
        Assert.assertTrue(option1.isSelected());
        String option1Text = option1.getText();
        Assert.assertEquals(option1Text, "Option 1");

        option2.click();
        Assert.assertTrue(option2.isSelected());
        String option2Text = option2.getText();
        Assert.assertEquals(option2Text, "Option 2");
    }

    @Test
    public void testSelectOptions2() throws InterruptedException {
        driver.get("https://the-internet.herokuapp.com/dropdown");

        Select dropdown = new Select(driver.findElement(By.xpath("//select[@id='dropdown']")));
        dropdown.selectByVisibleText("Option 1");
        Thread.sleep(2000);
        dropdown.selectByValue("2");
        Thread.sleep(2000);
    }
}
