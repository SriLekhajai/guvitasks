package com.task16;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WikiPedia {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");	
		
		Thread.sleep(3000);
		driver.navigate().to("https://www.wikipedia.org/");
		driver.manage().window().maximize();
		WebElement searchbox = driver.findElement(By.id("searchInput"));
		searchbox.sendKeys("Artificial Intelligence");
		WebElement searchButton = driver.findElement(By.xpath("//button[@class='pure-button pure-button-primary-progressive']"));
		searchButton.click();
		WebElement linkClick = driver.findElement(By.linkText("History"));
		linkClick.click();
		WebElement sectionTitle = driver.findElement(By.xpath("//span[@id='History']"));
		
		String title = sectionTitle.getText();
		System.out.println("Title of the section:" + title);
		Thread.sleep(3000);
		driver.close();
	}

}
