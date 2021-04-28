package org.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FindWebSites {

		    public static void main(String[] args) {
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\MANI SURYA\\eclipse-workspace\\JavaChennai\\java\\chromedriver.exe");
				
				WebDriver driver = new ChromeDriver();
				driver.get("https://demoqa.com/automation-practice-form");
				String title = driver.getTitle();
				System.out.println(title);
				String currentUrl = driver.getCurrentUrl();
				System.out.println(currentUrl);
				
				WebElement txtFirstName = driver.findElement(By.id("firstName"));
				txtFirstName.sendKeys("mani");
				WebElement txtLastName = driver.findElement(By.id("lastName"));
				txtLastName.sendKeys("surya");
				WebElement txtEmail = driver.findElement(By.xpath("//input[@id='userEmail']"));
				txtEmail.sendKeys("mani@gmail.com");
				WebElement radiogender = driver.findElement(By.xpath("(//input[@name='gender'])[1]"));
				Actions action =new Actions(driver);
				action.moveToElement(radiogender).click().perform();
				WebElement txtnum = driver.findElement(By.xpath("//input[@id='userNumber']"));
				action.moveToElement(txtnum).click().perform();
				txtnum.sendKeys("9876543210");
				WebElement txtDob = driver.findElement(By.xpath("//input[@value ='07 Mar 2021']"));
				txtDob.click();
				WebElement txtSub = driver.findElement(By.id("subjectsContainer"));
				txtSub.sendKeys("subject");
				WebElement btnHobbies = driver.findElement(By.xpath("//input[@id='hobbies-checkbox-1']"));
				btnHobbies.click();
				WebElement txtAdd = driver.findElement(By.id("currentAddress"));
				txtAdd.sendKeys("Chennai");
                WebElement selCity = driver.findElement(By.xpath("//div[text()='Uttar Pradesh']"));
                selCity.click();
				
				
				

				
			}
				 
	}
	

