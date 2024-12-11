package sample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseAndQuit {

  public static void main(String[] args) {
    WebDriver driver = new ChromeDriver();
    driver.get("http://www.popuptest.com/popuptest2.html");
    //driver.close();
  }
}
