//Demo to show how methods of robot class work
package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.awt.*;
import java.awt.event.KeyEvent;

public class RobotKeyMouse {
    public static void main(String[] args) throws AWTException, InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:/Users/Pritam Paul/Downloads/demo1/SeleniumWebPage/src/driver/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.co.in");
        Robot robot = new Robot();

        robot.mouseMove(300,500);
        robot.keyPress(KeyEvent.VK_ALT);
        robot.keyPress(KeyEvent.VK_F4);
        Thread.sleep(1000);
    }
}
