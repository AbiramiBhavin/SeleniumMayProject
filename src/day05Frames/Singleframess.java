package day05Frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Singleframess {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver;
		driver=new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Frames.html");
		//driver.switchTo().frame("singleframe");// here single frame is the frame id that we got by inspecting with iframe
		//instead of single frame by id we can also get xpath for frame
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='singleframe']")));
		//the above line is frame using xpath of the frame
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Sample Text");
		//this xpath is the xpath for textbox
		driver.switchTo().defaultContent();// this is used to close the particular tab frame and jumps to next tab frame
		driver.findElement(By.xpath("//a[text()='Iframe with in an Iframe']")).click();

		
		
		

	}

}
