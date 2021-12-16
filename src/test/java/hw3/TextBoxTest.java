package hw3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.*;


class TextBoxTest extends BasicTest{

    @Test
    void TextBoxTest() {
        webDriver.get(url);

        webDriver.manage().window().setSize(new Dimension(1600, 1200));
        Actions actions = new Actions(webDriver);
        actions.moveToElement(webDriver.findElement(By.xpath("//h5[normalize-space()='Elements']")))
                .build().perform();
        webDriver.findElement(By.xpath(("//h5[normalize-space()='Elements']"))).click();

        webDriver.findElement(By.xpath("//span[normalize-space()='Text Box']")).click();
        By.id("userName").findElement(webDriver).sendKeys("Obivan");
        By.id("userEmail").findElement(webDriver).sendKeys("Obivan@mail.com");
        webDriver.findElement(By.xpath("//textarea[@id='currentAddress']")).sendKeys("addres");
        webDriver.findElement(By.xpath("//button[@id='submit']")).click();
        new WebDriverWait(webDriver,3)
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='border col-md-12 col-sm-12']")));

    }
}