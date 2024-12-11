package sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchingBetweenFrames {

  public static void main(String[] args) {
    WebDriver driver = new ChromeDriver();
    driver.get("http://demo.guru99.com/selenium/deprecated.html");
    driver.switchTo().frame("classFrame");
    driver.findElement(By.linkText("Deprecated")).click();
    //driver.quit();
  }
}
