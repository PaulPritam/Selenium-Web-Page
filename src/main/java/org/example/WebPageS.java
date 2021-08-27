package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebPageS {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:/Users/Pritam Paul/Downloads/demo1/SeleniumWebPage/" +
                "src/driver/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");

        Thread.sleep(3000);
        //Change language exactly after opening
        driver.findElement(By.xpath("//a[contains(text(),'English (UK)')]")).click();

//        Finding web element by using By.linkText
        driver.findElement(By.linkText("Create New Account")).click();

        //Second way for finding element by using 'contains'
//        driver.findElement(By.xpath("//a[contains(text(),'Create New Account')]")).click();

        Thread.sleep(3000);

        //Sending data to fill the fields
//        driver.findElement(By.name("firstname")).sendKeys("Paul");
        driver.findElement(By.xpath("//body[1]/div[3]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]")).sendKeys("User2");

        driver.findElement(By.name("lastname")).sendKeys("Pritam");

        //Sending phone number
        driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[1]/div[2]/div[1]/div[1]/input[1]")).sendKeys("8918433980");

        //Sending pasword
        driver.findElement(By.id("password_step_input")).sendKeys("RandomPassword");

        //Sending values for Date of Birth fields
        Select dob = new Select(driver.findElement(By.id("day")));
        dob.selectByVisibleText("11");

        Select mob = new Select(driver.findElement(By.id("month")));
        mob.selectByVisibleText("Jul");

        Select yob = new Select(driver.findElement(By.id("year")));
        yob.selectByVisibleText("1997");

        //Select gender
        WebElement maleID = driver.findElement(By.xpath("//label[contains(text(),'Male')]"));
        Thread.sleep(3000);
        maleID.click();


    }
}
