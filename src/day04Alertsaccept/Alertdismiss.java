package day04Alertsaccept;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertdismiss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver;
		driver=new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Alerts.html");
		//driver.findElement(By.xpath("//a[contains(text().'Alert with OK & Cancel')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Alert with OK & Cancel ')]")).click();// xpath using contains method
		driver.findElement(By.xpath("//button[contains(text(),'click the button to display a confirm box ')]")).click();
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().dismiss();// for cancel in alert
	}

}
