package example;

import java.io.File;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class PetClinicTest {
	private WebDriver driver;
  @Test
  public void testPetClinic() {
	  driver.get("http://localhost:9999/petclinic/");
	  String title = driver.getTitle();
	  Assert.assertTrue(title.contains("a Spring Framework"));
	  }
  @BeforeTest
  public void beforeTest() {
	  File file = new File("C:/JenkinsEssentials/seleniumBrowserDrivers/chromedriver.exe");
	  System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
	  driver = new ChromeDriver();
  }

  @AfterTest
  public void afterTest() {
	  driver.quit();
  }

}
