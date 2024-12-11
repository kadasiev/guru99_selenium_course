package sample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitle {

  public static void main(String[] args) {
    WebDriver driver = new ChromeDriver();

    String baseUrl = "http://demo.guru99.com/test/newtours/";
    String expectedTitle = "Welcome: Mercury Tours";
    String actualTitle;

    driver.get(baseUrl);
    actualTitle = driver.getTitle();

    if (actualTitle.contentEquals(expectedTitle)){
      System.out.println("Test Passed!");
    } else {
      System.out.println("Test Failed");
    }
    driver.close();
  }
}
