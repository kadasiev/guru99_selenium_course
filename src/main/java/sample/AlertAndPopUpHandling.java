package sample;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertAndPopUpHandling {

  public static void main(String[] args) {
    WebDriver driver = new ChromeDriver();

    // Alert Message handling
    driver.get("https://demo.guru99.com/test/delete_customer.php");

    driver.findElement(By.name("cusid")).sendKeys("53920");
    driver.findElement(By.name("submit")).submit();

    // Switching to Alert
    Alert alert = driver.switchTo().alert();

    // Capturing alert message.
    String alertMessage= alert.getText();

    // Displaying alert message
    System.out.println(alertMessage);
    try {
      Thread.sleep(3000);
    } catch(Exception ignored) {}

    // Accepting alert
    alert.accept();
  }
}
