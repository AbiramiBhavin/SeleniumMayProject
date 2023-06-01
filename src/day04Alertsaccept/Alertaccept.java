package day04Alertsaccept;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertaccept {

	public static void main(String[] args) {
		WebDriver driver;
		driver =new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Alerts.html");
		driver.findElement(By.xpath("//button[contains(text(),'click the button to display an  alert box' )]")).click();
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();// for ok in alert
		
		

	}

}
