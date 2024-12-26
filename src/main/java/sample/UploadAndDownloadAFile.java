package sample;

import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;

public class UploadAndDownloadAFile {

  public static void main(String[] args) {
    String baseUrl = "https://demo.guru99.com/test/upload/";
    WebDriver driver = new ChromeDriver();

    driver.get(baseUrl);
    WebElement uploadElement = driver.findElement(By.id("uploadfile_0"));

    // enter the file path onto the file-selection input field
    uploadElement.sendKeys(Paths.get("src/main/resources/test.bmp")
        .toAbsolutePath()
        .toString());

    // check the "I accept the terms of service" check box
    driver.findElement(By.id("terms")).click();

    // click the "UploadFile" button
    driver.findElement(By.name("send")).click();
  }
}

class FileDownloadChromeExample {

  public static void main(String[] args) {
    // Set the download directory path
    String downloadFilePath = System.getProperty("user.dir") + "\\src\\main\\resources\\downloads";

    // Set Chrome preferences
    Map<String, Object> prefs = new HashMap<>();
    prefs.put("download.default_directory", downloadFilePath);
    prefs.put("download.prompt_for_download", false); // Disable download prompt
    prefs.put("safebrowsing.enabled", true); // Disable "This type of file can harm your computer" warning

    // Configure ChromeOptions
    ChromeOptions options = new ChromeOptions();
    options.setExperimentalOption("prefs", prefs);

    // Set WebDriver path
    System.setProperty("webdriver.chrome.driver", "C:\\chromedriver-win64\\chromedriver.exe");

    // Initialize WebDriver
    WebDriver driver = new ChromeDriver(options);

    // Navigate to the URL
    driver.get("https://unsplash.com/photos/a-woman-standing-in-a-parking-garage-next-to-a-fire-hydrant-mIrSgbi0mrc");

    // Click the download button
    // Replace with the actual locator of your download button
    driver.findElement(By.xpath("//*[@title='Download this image']")).click();

    // Add a wait for the download to complete (optional)
    try {
      Thread.sleep(5000); // Adjust the sleep time as needed
    } catch (InterruptedException e) {
      e.printStackTrace();
    }

    // Close the driver
    driver.quit();
  }
}

class FileDownloadFirefoxExample {

  public static void main(String[] args) {
    // Set the download directory path
    String downloadFilePath = System.getProperty("user.dir") + "\\src\\main\\resources\\downloads";

    // Configure Firefox profile
    FirefoxProfile profile = new FirefoxProfile();

    // Set the default directory to save downloads
    profile.setPreference("browser.download.dir", downloadFilePath);
    profile.setPreference("browser.download.folderList", 2); // 2 means custom folder

    // Configure Firefox to download files without asking
    profile.setPreference("browser.helperApps.neverAsk.saveToDisk", "*/*"); // Accept all file types
    profile.setPreference("browser.download.manager.showWhenStarting", false);
    profile.setPreference("pdfjs.disabled", true); // Disable built-in PDF viewer
    profile.setPreference("browser.download.manager.alertOnEXEOpen", false); // Skip EXE warnings

    // Configure Firefox options
    FirefoxOptions options = new FirefoxOptions();
    options.setProfile(profile);

    // Set WebDriver path
//    System.setProperty("webdriver.gecko.driver", "path/to/geckodriver");

    // Initialize WebDriver
    WebDriver driver = new FirefoxDriver(options);

    // Navigate to the URL
    driver.get("https://demo.guru99.com/test/yahoo.html");

    // Click the download button
    // Replace with the actual locator of your download button
    driver.findElement(By.id("messenger-download")).click();

    // Add a wait for the download to complete (optional)
    try {
      Thread.sleep(5000); // Adjust the sleep time as needed
    } catch (InterruptedException e) {
      e.printStackTrace();
    }

    // Close the driver
    driver.quit();
  }
}
