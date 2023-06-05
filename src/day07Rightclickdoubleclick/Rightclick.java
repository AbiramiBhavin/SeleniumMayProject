package day07Rightclickdoubleclick;

import org.openqa.selenium.By;
//import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Rightclick {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			WebDriver driver;
			driver = new ChromeDriver();
			
			driver.get("https://demo.guru99.com/test/simple_context_menu.html");// site for rightclick and double click
			WebElement src = driver.findElement(By.xpath("//span[text()='right click me']"));// xpath for right click using text
			WebElement cpy =driver.findElement(By.xpath("//span[text()='Copy']"));//xpath for copy option using text
			Actions action = new Actions(driver);
			action.contextClick(src).click(cpy).build().perform();// contextclick is used for right click option
			
			driver.switchTo().alert().accept();// an alert appears this command is used for accept the message

	}

}
