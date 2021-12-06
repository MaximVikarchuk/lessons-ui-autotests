//package ru.gb.lessons;
//
//import io.github.bonigarcia.wdm.WebDriverManager;
//import org.openqa.selenium.By;
//import org.openqa.selenium.Dimension;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Actions;
//
//
//public class App
//{
//    public static void main( String[] args ) throws InterruptedException {
//
//        WebDriver webDriver = WebDriverManager.chromedriver().create();
//
//        webDriver.get("https://crm.geekbrains.space/");
//
//        webDriver.manage().window().setSize(new Dimension(1500, 720));
//
//        webDriver.findElement(By.name("_username")).sendKeys("Applanatest1");
//        webDriver.findElement(By.name("_password")).sendKeys("Student2020!");
//        webDriver.findElement(By.name("_submit")).click();
//
//        Actions actions = new Actions();
//
//
//        Thread.sleep(10000);
//
//        webDriver.quit();
//
//    }
//
//
//}
