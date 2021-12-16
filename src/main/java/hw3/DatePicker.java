package hw3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import static java.util.concurrent.TimeUnit.SECONDS;

public class DatePicker {

    public static void main(String[] args) throws InterruptedException {
        WebDriver webDriver = WebDriverManager.chromedriver().create();

        webDriver.manage().timeouts().implicitlyWait(3, SECONDS);

        webDriver.get("https://demoqa.com/");

        webDriver.manage().window().setSize(new Dimension(1600, 1200));
        Actions actions = new Actions(webDriver);
        actions.moveToElement(webDriver.findElement(By.xpath("//h5[normalize-space()='Widgets']")))
                .build().perform();
        webDriver.findElement(By.xpath(("//h5[normalize-space()='Widgets']"))).click();

        webDriver.findElement(By.xpath("//span[normalize-space()='Date Picker']")).click();

        webDriver.findElement(By.xpath("//input[@id='datePickerMonthYearInput']")).click();
        webDriver.findElement(By.xpath("//div[@aria-label='Choose Tuesday, December 14th, 2021']")).click();
        webDriver.findElement(By.xpath("//input[@id='dateAndTimePickerInput']")).click();
        webDriver.findElement(By.xpath("//div[@aria-label='Choose Tuesday, December 14th, 2021']")).click();
        webDriver.findElement(By.xpath("//li[normalize-space()='18:00']")).click();

        Thread.sleep(2000);

        webDriver.quit();

    }
}
