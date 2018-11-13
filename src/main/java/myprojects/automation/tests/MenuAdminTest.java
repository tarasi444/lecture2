package myprojects.automation.tests;

import myprojects.automation.BaseScript;
import myprojects.automation.utils.ElementInfo;
import myprojects.automation.utils.Properties;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;

import static myprojects.automation.tests.LoginTest.logIn;


public class MenuAdminTest extends BaseScript {

    public static void main(String[] args) {

        WebDriver webDriver = getDriver();
        webDriver.get(Properties.getBaseAdminUrl());


        logIn(webDriver);

        ArrayList<ElementInfo> listElement = ElementInfo.getList();

        for (int itemNumber = 0; itemNumber < listElement.size(); itemNumber++) {

            menuItem(webDriver, listElement.get(itemNumber).getId(), listElement.get(itemNumber).getClassName(),
                    listElement.get(itemNumber).getPageTitle());

        }


    }


    public static void menuItem(WebDriver driver, String idElement, String nameClass, String pageName) {

        WebElement menuItem = driver.findElement(By.id(idElement));
        menuItem.click();

        baseSleep();

        WebElement title = driver.findElement(By.className(nameClass));
        System.out.println(title.getText());

        driver.navigate().refresh();

        baseSleep();

        WebElement check = driver.findElement(By.className(nameClass));

        System.out.println(check.getText().equals(pageName));


    }


}
