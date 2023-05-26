package day02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.edge.EdgeDriver;

public class Demositeautomation {

	public static void main(String[] args) {
		WebDriver driver;
		driver=new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
		driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("Abirami");
		driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("Ravichandran");
		driver.findElement(By.xpath("//input[@placeholder='Last Name']")).clear();
		driver.findElement(By.xpath("//textarea[@ng-model='Adress']")).sendKeys("9th street, chromepet");
		
		driver.findElement(By.xpath("//input[@ng-model='EmailAdress']")).sendKeys("abc@gmail.com");
		driver.findElement(By.xpath("//input[@type='tel']")).sendKeys("9940405292");
		driver.findElement(By.xpath("//input[@value='FeMale']")).click();
		driver.findElement(By.xpath("//input[@value='Hockey']")).click();
		
		//driver.findElement(By.xpath("//div[@id='msdd']")).sendKeys("English, Tamil");		)
	}

}
