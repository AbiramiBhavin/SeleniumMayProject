package day06Actions;
import java.io.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class dragndrop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver;
		driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		WebElement src=driver.findElement(By.xpath("//li[@id='credit2']"));//webelement is used for storing xpath
		WebElement target=driver.findElement(By.xpath("//ol[@id='bank']"));
		Actions action=new Actions(driver);
		action.dragAndDrop(src, target).build().perform();
		
		src=driver.findElement(By.xpath("//li[@id='fourth']"));
		target=driver.findElement(By.xpath("//ol[@id='amt7']"));
		action.dragAndDrop(src, target).build().perform();
		//My tries are below for the rest tabs
		//Only certain blocks are permitted to be dropped in specific cells in the table
		//I used Sales here
		
		WebElement srcc=driver.findElement(By.xpath("//li[@id='credit1']"));//webelement is used for storing xpath
		WebElement targett=driver.findElement(By.xpath("//ol[@id='loan']"));
		Actions action1=new Actions(driver);
		action1.dragAndDrop(srcc, targett).build().perform();
		
		
		srcc=driver.findElement(By.xpath("//li[@id='fourth']"));
		targett=driver.findElement(By.xpath("//ol[@id='amt8']"));
		action1.dragAndDrop(srcc, targett).build().perform();
		
		
		
		
		

	}

}
