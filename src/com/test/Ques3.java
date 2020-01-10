package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ques3 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vignesh Chinnappa\\eclipse-workspace\\Day2Task\\Drivers\\chromedriver.exe");
		//Launching Browser 
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.greenstechnologys.com/selenium-course-content.html");
		driver.manage().window().maximize();
		
		WebElement close = driver.findElement(By.xpath("//*[@id=\"myModal-pop\"]/div/div/div[1]/button"));
		close.click();
		
		WebElement text = driver.findElement(By.xpath("//*[@id=\"article-wrapper\"]/div[5]/h2[3]"));
		
		Point location = text.getLocation();
	
		//(240, 10946)
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(240, 10946)");
		
		JavascriptExecutor js2 = (JavascriptExecutor) driver;
		js2.executeScript("arguments[0].setAttribute('style', 'background: red; border: 2px solid yellow;');", text);

	}

}
