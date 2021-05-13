
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

//Author Zeba
public class VerboseTest {
	 WebDriver driver;
  
  @BeforeMethod
  public void Setup() {
	  System.setProperty("webdriver.chrome.driver", "/Users/zebanaushad/Downloads/chromedriver");
	   driver= new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().deleteAllCookies();
	 // driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 // driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
	  driver.get("http://gmail.com");
	 // driver.findElement(By.name("identifier")).sendKeys("zebanaushad92");
	 // driver.findElement(By.className("VfPpkd-vQzf8d")).click();
  }

  
  @Test(priority=1, groups="Title")
  public void Testcase1() {
	  String title=driver.getTitle()
;	  System.out.print("Title of page" + title);
	  
  }
  
  @Test(priority=2,groups="Title")
  public void Testcase2() {
	  driver.findElement(By.cssSelector("#logo > div > svg")).isDisplayed();
	  System.out.print("Displayed");
	  
  }
  
  @Test(priority=4,groups="Webelement")
  public void Testcase3() {
	 String TEXT= driver.findElement(By.className("PrDSKc")).getText();
	  System.out.print("Text= " + TEXT);
	  
  }
  
  @Test(priority=3,groups="Webelement")
  public void Testcase4() {
	 driver.findElement(By.id("ow333")).isEnabled();
	  
  }
  
  @Test(priority=5,groups="Webelement",dependsOnMethods="Testcase4")
  public void Testcase5() {
	  System.out.print("Testcase5");
	  
  }
  
  @AfterMethod
  public void teardown() {
	  driver.quit();
	  }

}
