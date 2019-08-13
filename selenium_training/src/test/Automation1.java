package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Automation1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/home/dhruv/chromedriver");
		//System.setProperty("webdriver.gecko.driver","/home/dhruv/geckodriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://google.com");
		
		//google search
		
		WebElement searchBox = driver.findElement(By.name("q"));
		searchBox.sendKeys("hello world");
		searchBox.sendKeys(Keys.RETURN);
		
		String title = driver.getTitle();
		System.out.println(title);
		
		
	}
}
