package hw3;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static java.util.concurrent.TimeUnit.SECONDS;

public class Alerts
{
    public static void main(String[] args) throws InterruptedException {

        WebDriver webDriver = WebDriverManager.chromedriver().create();


        webDriver.manage().timeouts().implicitlyWait(3, SECONDS);

        webDriver.get("https://demoqa.com/");

        webDriver.manage().window().setSize(new Dimension(1600, 1200));
        Actions actions = new Actions(webDriver);
        actions.moveToElement(webDriver.findElement(By.xpath("//h5[normalize-space()='Alerts, Frame & Windows']")))
                .build().perform();
        webDriver.findElement(By.xpath(("//h5[normalize-space()='Alerts, Frame & Windows']"))).click();

        webDriver.findElement(By.xpath("//span[text()='Alerts']")).click();

        webDriver.findElement(By.xpath("//button[@id='alertButton']")).click();


        Alert alert = (new WebDriverWait(webDriver,3)).until(ExpectedConditions.alertIsPresent());
        webDriver.switchTo().alert().accept();


        Thread.sleep(2000);

        webDriver.quit();

    }


}
