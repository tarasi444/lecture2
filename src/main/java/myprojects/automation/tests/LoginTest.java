package myprojects.automation.tests;

import myprojects.automation.BaseScript;
import myprojects.automation.utils.Properties;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class LoginTest extends BaseScript {

    public static void main(String[] args) {

        WebDriver webDriver = getDriver();
        webDriver.get(Properties.getBaseAdminUrl());

        logIn(webDriver);
        logOut(webDriver);


    }


    public static void logIn(WebDriver driver) {

        WebElement email = driver.findElement(By.id("email"));
        email.sendKeys("webinar.test@gmail.com");

        WebElement password = driver.findElement(By.id("passwd"));
        password.sendKeys("Xcg7299bnSmMuRLp9ITw");

        WebElement buttonLogin = driver.findElement(By.name("submitLogin"));
        buttonLogin.click();

        baseSleep();
    }


    public static void logOut(WebDriver driver) {

        WebElement employeeInfo = driver.findElement(By.id("employee_infos"));
        employeeInfo.click();

        baseSleep();

        WebElement logoutButton = driver.findElement(By.id("header_logout"));
        logoutButton.click();

    }

}
