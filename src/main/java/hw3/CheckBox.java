package hw3;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static java.util.concurrent.TimeUnit.SECONDS;

public class CheckBox
{
    public static void main(String[] args) throws InterruptedException {
        WebDriver webDriver = WebDriverManager.chromedriver().create();

        webDriver.manage().timeouts().implicitlyWait(3, SECONDS);

        webDriver.get("https://demoqa.com/");

        webDriver.manage().window().setSize(new Dimension(1600, 1200));
        Actions actions = new Actions(webDriver);
        actions.moveToElement(webDriver.findElement(By.xpath("//h5[normalize-space()='Elements']")))
                .build().perform();

        webDriver.findElement(By.xpath(("//h5[normalize-space()='Elements']"))).click();

        webDriver.findElement(By.xpath("//span[normalize-space()='Check Box']")).click();

        webDriver.findElement(By.xpath("//button[@title='Toggle']")).click();
        webDriver.findElement(By.xpath("//li[3]//span[1]//button[1]//*[name()='svg']")).click();
        webDriver.findElement(By.xpath("//span[contains(text(),'Word File.doc')]")).click();
        new WebDriverWait(webDriver,3)
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[text()='wordFile']")));



        Thread.sleep(5000);

        webDriver.quit();

    }


}
