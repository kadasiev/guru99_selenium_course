import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class FirstTestNGTest {

  public String baseUrl = "http://demo.guru99.com/test/newtours/";
  public WebDriver driver;

  @Test(groups = {"run"})
  public void verifyHomepageTitle() {
    System.out.println("launching firefox browser");
//    driver = new FirefoxDriver();
//    driver.get(baseUrl);
//    String expectedTitle = "Welcome: Mercury Tours";
//    String actualTitle = driver.getTitle();
//    Assert.assertEquals(actualTitle, expectedTitle);
//    driver.quit();
  }
}

