package sample;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElements {

  public static void main(String[] args) {
    WebDriver driver = new ChromeDriver();
    driver.get("http://demo.guru99.com/test/ajax.html");
    List<WebElement> elements = driver.findElements(By.name("name"));
    System.out.println("Number of elements:" + elements.size());

    for (int i = 0; i < elements.size(); i++) {
      System.out.println("Radio button text:" + elements.get(i).getAttribute("value"));
    }
    for (WebElement element : elements) {
      System.out.println("Radio button text:" + element.getAttribute("value"));
    }
    driver.quit();
  }
}
