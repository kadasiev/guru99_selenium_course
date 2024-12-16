package sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickOnImage {

  public static void main(String[] args) {
    String adminPageTitle = "Zoommer.ge";

    WebDriver driver = new ChromeDriver();
    driver.get("https://zoommer.ge/mobiluri-telefonebi-c855");

    driver.findElement(By.xpath("//*[@class='main-logo']")).click();

    try {
      Thread.sleep(1000);
    } catch (InterruptedException ignored) {}

    if (adminPageTitle.equals(driver.getTitle()))
      System.out.println("Pass");

    driver.quit();
  }
}
