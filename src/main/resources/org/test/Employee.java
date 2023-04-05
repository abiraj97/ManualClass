package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Employee {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.facebook.com/");

		WebElement txtUser = driver.findElement(By.id("email"));
		txtUser.sendKeys("Bala");

		WebElement txtPass = driver.findElement(By.id("pass"));
		txtPass.sendKeys("Abc@123");

		WebElement btnclk = driver.findElement(By.name("login"));
		btnclk.click();
	}
}
