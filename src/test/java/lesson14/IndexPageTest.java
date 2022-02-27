package lesson14;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class IndexPageTest {
	//declare Selenium WebDriver
	private WebDriver webDriver;
  @Test
  public void testNameForm() {
	  webDriver.navigate().to("http://localhost:8090/lesson14/index.jsp");
	  webDriver.findElement(By.name("yourName")).sendKeys("Aw Bing Xian");
	  webDriver.findElement(By.name("yourName")).submit();
	  Assert.assertEquals(webDriver.findElement(By.id("name")).getText(), "Hello Aw Bing Xian");
  }
  
  @Test
  public void testBtnToRegister() {
	  webDriver.navigate().to("http://localhost:8090/lesson14/index.jsp");
	  webDriver.findElement(By.id("btn")).click();
	  Assert.assertEquals(webDriver.getCurrentUrl(), "http://localhost:8090/lesson14/register.jsp");
  }
  
  @BeforeTest
  public void beforeTest() {
	  String chromeDriverDir = "C:\\Program Files (x86)\\Google\\Chrome\\chromedriver.exe";
	  System.setProperty("webdriver.chrome.driver", chromeDriverDir);
	  webDriver = new ChromeDriver();
  }

  @AfterTest
  public void afterTest() {
	  webDriver.quit();
  }

}
