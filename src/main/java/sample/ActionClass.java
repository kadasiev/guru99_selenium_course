package sample;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class ActionClass {

  public static void main(String[] args) {
//    String baseUrl = "http://demo.guru99.com/test/newtours/";
//    WebDriver driver = new ChromeDriver();
//
//    driver.get(baseUrl);
//    WebElement link_Home = driver.findElement(By.linkText("Home"));
//    WebElement td_Home = driver
//        .findElement(By
//            .xpath("//html/body/div"
//                + "/table/tbody/tr/td"
//                + "/table/tbody/tr/td"
//                + "/table/tbody/tr/td"
//                + "/table/tbody/tr"));
//
//    Actions actions = new Actions(driver);
//    Action mouseOverHome = actions
//        .moveToElement(link_Home)
//        .build();
//
//    String bgColor = td_Home.getCssValue("background-color");
//    System.out.println("Before hover: " + bgColor);
//
//    mouseOverHome.perform();
//
//    bgColor = td_Home.getCssValue("background-color");
//    System.out.println("After hover: " + bgColor);
//    driver.close();

    String baseUrl = "http://www.facebook.com/";
    WebDriver driver = new ChromeDriver();

    driver.get(baseUrl);
    WebElement txtUsername = driver.findElement(By.id("email"));

    Actions actions = new Actions(driver);
    Action seriesOfActions = actions
        .moveToElement(txtUsername)
        .click()
        .keyDown(txtUsername, Keys.SHIFT)
        .sendKeys(txtUsername, "hello")
        .keyUp(txtUsername, Keys.SHIFT)
        .doubleClick(txtUsername)
        .contextClick()
        .build();

    seriesOfActions.perform() ;
  }
}
