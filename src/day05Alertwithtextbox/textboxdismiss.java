package day05Alertwithtextbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class textboxdismiss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver;
		driver=new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Alerts.html");
		driver.findElement(By.xpath("//a[contains(text(),'Alert with Textbox ')]")).click();
		driver.findElement(By.xpath("//button[contains(text(),'click the button to demonstrate the prompt box ')]")).click();
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().sendKeys("Selenium Java");
		driver.switchTo().alert().dismiss();
		

	}

}
