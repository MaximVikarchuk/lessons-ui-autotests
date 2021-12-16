package hw3;

import org.assertj.core.api.SoftAssertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.asserts.SoftAssert;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class AccordianTest extends BasicTest{

    private Object WebElement;

    @Test
    void AccordianTest() throws InterruptedException {

        webDriver.get(url);

        webDriver.manage().window().setSize(new Dimension(1600, 1200));
        Actions actions = new Actions(webDriver);
        actions.moveToElement(webDriver.findElement(By.xpath("//h5[normalize-space()='Widgets']")))
                .build().perform();
        webDriver.findElement(By.xpath(("//h5[normalize-space()='Widgets']"))).click();

        webDriver.findElement(By.xpath("//span[text()='Accordian']")).click();

        List<WebElement> elements = webDriver.findElement(By.id("accordianContainer"))
                .findElements(By.xpath("//div[contains(@class, \"card-header\")]"));

        SoftAssertions softAssertions = new SoftAssertions();
        softAssertions.assertThat(elements.get(0).getText()).isEqualTo("What is Lorem Ipsum?");
        softAssertions.assertThat(elements.get(1).getText()).isEqualTo("Where does it come from?");
        softAssertions.assertThat(elements.get(2).getText()).isEqualTo("Why do we use it?");
        softAssertions.assertAll();



        webDriver.findElement(By.xpath("//div[@id='section1Heading']")).click();
        webDriver.findElement(By.xpath("//div[@id='section2Heading']")).click();
        webDriver.findElement(By.xpath("//div[@id='section3Heading']")).click();


        Thread.sleep(2000);
    }
}