package hw3;


import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


class CheckBoxTest extends BasicTest{

    @Test
    void CheckBoxTest() {

        webDriver.get(url);

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

    }

}