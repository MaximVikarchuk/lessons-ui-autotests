package hw3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

import static javax.accessibility.AccessibleState.VISIBLE;
import static org.junit.jupiter.api.Assertions.*;

class AlertsTest extends BasicTest{

    @Test
    void AlertsTest() {

        webDriver.get(url);


        Actions actions = new Actions(webDriver);
        actions.moveToElement(webDriver.findElement(By.xpath("//h5[normalize-space()='Alerts, Frame & Windows']")))
                .build().perform();
        webDriver.findElement(By.xpath(("//h5[normalize-space()='Alerts, Frame & Windows']"))).click();

        webDriver.findElement(By.xpath("//span[text()='Alerts']"))
                .click();
        Assert.assertEquals("Click Button to see alert", webDriver
                .findElement(By.xpath("//span[normalize-space()='Click Button to see alert']")).getText());

        webDriver.findElement(By.xpath("//button[@id='alertButton']")).click();

        Alert alert = (new WebDriverWait(webDriver,3)).until(ExpectedConditions.alertIsPresent());
        webDriver.switchTo().alert().accept();



    }

}