package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGDemo2 {

	public WebDriver driver;
	
	@BeforeSuite
	public void before() {
		System.out.println("hey");
	}
	
	@BeforeTest
	public void setUpTest() {
		System.out.println("***Before Test**");
		System.setProperty("webdriver.chrome.driver", "/home/dhruv/chromedriver");
		driver = new ChromeDriver();
	}
	
	@Test
	public void googleSearch() {
		System.out.println("***TEST***");
		driver.get("https://google.com");
		driver.findElement(By.name("q")).sendKeys("qainfotech");
		driver.findElement(By.name("q")).sendKeys(Keys.RETURN);
	}
	
	@AfterTest
	public void tearDownTest()
	{
		System.out.println("***After Test***");
		driver.close();
		driver.quit();
	}	
}
