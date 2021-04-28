package org.sample;

import java.io.File;
import java.io.IOException;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class BrowserLaunch {

	public static void main(String[] args) throws InterruptedException, IOException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\MANI SURYA\\eclipse-workspace\\JavaChennai\\java\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone mobile",Keys.ENTER);
	    driver.findElement(By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal'])[1]")).click();
	    String prtWindow = driver.getWindowHandle();
		System.out.println(prtWindow);
	
	Set<String> allWindows = driver.getWindowHandles();
		System.out.println(allWindows);
		
		for (String string : allWindows) {
			if (!prtWindow.equals(string)) {
				
				driver.switchTo().window(string);
				
			}
		}

	}

}
