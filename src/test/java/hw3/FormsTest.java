package hw3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.*;

class FormsTest extends BasicTest{

    @Test
    void FormsTest() throws InterruptedException {
        webDriver.get(url);

        webDriver.manage().window().setSize(new Dimension(1600, 1200));
        Actions actions = new Actions(webDriver);
        actions.moveToElement(webDriver.findElement(By.xpath("//h5[normalize-space()='Forms']")))
                .build().perform();
        webDriver.findElement(By.xpath(("//h5[normalize-space()='Forms']"))).click();

        webDriver.findElement(By.xpath("//span[text()='Practice Form']")).click();

        By.id("firstName").findElement(webDriver).sendKeys("Obivan");
        By.id("lastName").findElement(webDriver).sendKeys("Kinobi");
        By.id("userEmail").findElement(webDriver).sendKeys("makaka@list.ru");
        webDriver.findElement(By.xpath("//label[normalize-space()='Male']")).click();
        webDriver.findElement(By.xpath("//input[@id='userNumber']")).sendKeys("7123456776");
        webDriver.findElement(By.xpath("//button[@id='submit']")).click();

        Thread.sleep(2000);

        webDriver.findElement(By.xpath("//button[@id='closeLargeModal']")).click();

    }

}