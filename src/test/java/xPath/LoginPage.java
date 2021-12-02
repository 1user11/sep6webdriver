package xPath;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

public class LoginPage extends TestBase{

    @Test
    public void testValidUsernameValidPassword() throws IOException {
        driver.get("https://the-internet.herokuapp.com/login");

        WebElement username = driver.findElement(By.xpath("//input[@id='username']"));
        WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
        WebElement loginBtn = driver.findElement(By.xpath("//i[contains(text(),'Login')]"));
        username.sendKeys("tomsmith");
        password.sendKeys("SuperSecretPassword!");
        loginBtn.click();

        String message = driver.findElement(By.xpath("//div[@id='flash']")).getText();
        Assert.assertTrue(message.contains("You logged into a secure area!"));

        File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(scrFile, new File("c:\\tmp\\login_success.png"));

        WebElement logoutBtn = driver.findElement(By.xpath("//i[contains(text(),'Logout')]"));
        logoutBtn.click();
    }

    @Test
    public void testInvalidUsernameValidPassword() throws IOException {
        driver.get("https://the-internet.herokuapp.com/login");

        WebElement username = driver.findElement(By.xpath("//input[@id='username']"));
        WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
        WebElement loginBtn = driver.findElement(By.xpath("//i[contains(text(),'Login')]"));
        username.sendKeys("tom");
        password.sendKeys("SuperSecretPassword!");
        loginBtn.click();

        String message = driver.findElement(By.xpath("//div[@class='flash error']")).getText();
        Assert.assertTrue(message.contains("Your username is invalid!"));

        File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(scrFile, new File("c:\\tmp\\login_error.png"));

    }
}
