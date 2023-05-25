package day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class program1runnewbroswer {

	public static void main(String[] args) {
		//web driver is used to drive the application, through this we can connect to broswer
		WebDriver driver;// double click on warning symbol in this line to import
		driver=new EdgeDriver(); // double click on warning symbol in this line to import
		// we can also make use of edge, firefox what we have in our system
		driver.get("https://www.google.com/");
		

	}

}
