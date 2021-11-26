package Selenium_Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Alert_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.seleniumframework.com/Practiceform/");
		driver.findElement(By.id("alert")).click();
		//Thread.sleep(3000);
		String actualText=driver.switchTo().alert().getText();
		String expectedText="Please share this website with your friends and in your organization.";
		
		if(actualText.equals(expectedText)) {
			System.out.println("Test case passed");
		}
			 else {
				 
			System.out.println("Test case failed");	
			 }
		driver.switchTo().alert().accept();
		driver.quit();
		}

	}


