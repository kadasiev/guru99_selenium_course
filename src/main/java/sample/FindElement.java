package sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElement {

  public static void main(String[] args) {
    WebDriver driver = new ChromeDriver();
    driver.manage().window().maximize();

    driver.get("http://demo.guru99.com/test/ajax.html");

    // Find the radio button for “No” using its ID and click on it
    WebElement radioButton = driver.findElement(By.id("no"));
    radioButton.click();

    //Click on Check Button
    driver.findElement(By.id("buttoncheck")).click();
  }
}
