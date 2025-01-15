package test1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

//@Test(groups = {"run"})
public class FirstTest {

  private static final ThreadLocal<WebDriver> driver = new ThreadLocal<>();

  //public void verifyHomepageTitle() {}
  @BeforeMethod(groups = {"run"})
  public void setUp() {
    driver.set(new ChromeDriver());
  }

  @AfterMethod
  public void tearDown() {
    driver.get().quit();
  }

  @Test
  public void test1() {
    driver.get().get("http://google.com");
  }

  @Test(groups = {"run"})
  public void test2() {
    driver.get().get("http://google.com");
  }

  @Test
  public void test3() {
    driver.get().get("http://google.com");
  }
}
