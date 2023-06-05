package day07Rightclickdoubleclick;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class doubleclick {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver;
		driver = new ChromeDriver();		
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		WebElement src = driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
		//xpath for doubleclick
		Actions action = new Actions(driver);
		action.doubleClick(src).build().perform();
		//doubleclick() is used to perform doubleclick
		driver.switchTo().alert().accept();

	}

}
