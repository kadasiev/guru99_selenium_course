package sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectValueFromDropDown {

  public static void main(String[] args) {
    String baseURL = "https://demo.guru99.com/test/newtours/register.php";
    WebDriver driver = new ChromeDriver();
    driver.get(baseURL);

    Select countriesDropDown = new Select(driver.findElement(By.name("country")));
    countriesDropDown.selectByVisibleText("ANTARCTICA");

    //Selecting Items in a Multiple SELECT elements
    driver.get("http://jsbin.com/osebed/2");
    Select fruitsDropDown = new Select(driver.findElement(By.id("fruits")));
    fruitsDropDown.selectByVisibleText("Banana");
    fruitsDropDown.selectByIndex(1);
  }
}
