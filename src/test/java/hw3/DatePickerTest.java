package hw3;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.interactions.Actions;

import static org.junit.jupiter.api.Assertions.*;

class DatePickerTest extends BasicTest{

    @Test
    void DatePickerTest() {

        webDriver.get(url);

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

    }
}