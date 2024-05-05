package com.task16;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoBlaz {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		WebDriver driver = new ChromeDriver();
		driver.get("http://google.com");
		
		Thread.sleep(3000);
		driver.navigate().to("https://www.demoblaze.com/");
		driver.manage().window().maximize();
		String actualTitle = driver.getTitle();
		driver.manage().window().maximize();
		String expectedTitle = "STORE";
		if(actualTitle.equalsIgnoreCase(expectedTitle))
			System.out.println("Page landed on correct website");
		else
			System.out.println("Page not landed on correct website");
		
		driver.navigate().refresh();
		Thread.sleep(3000);
		driver.close();
	}

}
