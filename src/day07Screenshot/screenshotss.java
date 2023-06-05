package day07Screenshot;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;// download commons io jar from mvn repository
//https://mvnrepository.com/artifact/commons-io/commons-io/2.12.0 copy the jar
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class screenshotss {

	
	

		public static void main(String[] args) throws Exception {
			
			
			WebDriver driver;
			driver = new ChromeDriver();		
			driver.get("https://www.selenium.dev/");
			
			File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			// this TakesScreenshot is used to take the screenshot in selenium and get functions is used for capturing the screenshot as op with OutputType.FILE
			File desc = new File("./screenshot/selenium.png");
			//destination path for storing screenshot and this folder is created and stored in left panel near lib
			
			FileUtils.copyFile(src, desc);
			//FileUtils is used for copying source to target file
			
			driver.findElement(By.xpath("//span[text()='Downloads']")).click();
			//capturing other page as screenshot
			
			src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			desc = new File("./screenshot/seleniumDownloads.png");
			
			FileUtils.copyFile(src, desc);		
			
		

		}

	}

	

