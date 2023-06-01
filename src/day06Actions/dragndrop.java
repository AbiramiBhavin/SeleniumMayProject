package day06Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class dragndrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver;
		driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		WebElement src=driver.findElement(By.xpath("//li[@id='credit2']"));
		WebElement target=driver.findElement(By.xpath("//ol[@id='bank']"));
		Actions action=new Actions(driver);
		action.dragAndDrop(src, target).build().perform();
		
		src=driver.findElement(By.xpath("//li[@id='fourth']"));
		target=driver.findElement(By.xpath("//ol[@id='amt7']"));
		action.dragAndDrop(src, target).build().perform();
		//My tries are below for the rest tabs
		WebElement src1=driver.findElement(By.xpath("//li[@id='credit4']"));
		WebElement target1=driver.findElement(By.xpath("//ol[@id='loan']"));
		//WebElement target1=driver.findElement(By.xpath("//ol[@id='loan']"));
		action.dragAndDrop(src1, target1).build().perform();
		
		WebElement src2=driver.findElement(By.xpath("//li[@id='fourth']"));
		WebElement target2=driver.findElement(By.xpath("//ol[@id='amt8']"));
		action.dragAndDrop(src2, target2).build().perform();
		
		
		
		
		

	}

}
