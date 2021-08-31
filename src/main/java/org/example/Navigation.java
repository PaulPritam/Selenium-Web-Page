//Demo show how navigation interface work
package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigation {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","C:/Users/Pritam Paul/Downloads/demo1/SeleniumWebPage/src/driver/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.amazon.in/");

        driver.navigate().to("https://en-gb.facebook.com/");

        Thread.sleep(1000);
        driver.navigate().back();

        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Iphone 12");

        driver.findElement(By.id("nav-search-submit-button")).submit();

        Thread.sleep(1000);
        driver.findElement(By.className("a-truncate-full")).click();

        driver.findElement(By.partialLinkText("DEALS")).click();

    }
}