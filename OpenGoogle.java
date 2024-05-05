package com.task16;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenGoogle {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.mozilla.org/en-US/firefox/new/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.navigate().to("http://google.com");
		driver.findElement(By.id("APjFqb")).sendKeys("tutorial point");
		Thread.sleep(3000);
		driver.navigate().refresh();
		Thread.sleep(3000);
		driver.close();
		
	}

}
