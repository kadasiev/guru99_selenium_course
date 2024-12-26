package sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocateElementByLinkedTextAndPartialLinkText {

  public static void main(String[] args) {
//    String baseUrl = "http://demo.guru99.com/test/link.html";
//    WebDriver driver = new ChromeDriver();
//
//    driver.get(baseUrl);
//    driver.findElement(By.linkText("click here")).click();
//    System.out.println("title of page is: " + driver.getTitle());
//    driver.quit();

    String baseUrl = "http://demo.guru99.com/test/accessing-link.html";
    WebDriver driver = new ChromeDriver();

    driver.get(baseUrl);
    driver.findElement(By.partialLinkText("here")).click();
    System.out.println("Title of page is: " + driver.getTitle());
    driver.quit();
  }
}
