package myprojects.automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseScript {

    public static WebDriver getDriver() {
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\resources\\chromedriver.exe");

        return new ChromeDriver();
    }

    public static void baseSleep() {

        try {

            Thread.sleep(1000);

        } catch (InterruptedException e) {

            System.out.println("main sleep interrupted");
        }


    }
}


