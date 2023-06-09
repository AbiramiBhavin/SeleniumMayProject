package day09fileupload;
import java.io.IOException; //Since we are uploading file using autoit some exception throws during runtime 
import java.io.File; // for my tries of taking screenshot of my file upload

import org.apache.commons.io.FileUtils; // for saving the screenshot in our eclipse scrrenshot folder
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;// for file op screenshot
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions; // for choose buton click strong click is needed

public class fileupload {

	public static void main(String[] args) throws Exception // so we are declaring exception here to catch the runtime exception
	{
		// TODO Auto-generated method stub
		

		
				WebDriver driver;
				driver = new ChromeDriver();
				driver.get("https://demo.automationtesting.in/Register.html");
				Actions action= new Actions(driver);
				action.click(driver.findElement(By.xpath("//input[@id='imagesrc']"))).build().perform(); // Strong click for choose file 
				// so finding xpath for that choose button
				//since eception is thrown while uploading the file we are using thread .sleep to waitfor 3 secs
				Thread.sleep(3000);
				// the below line we are giving the path of AUTO IT exe file 
				// while saving auto it script we are saving as autoit3 file and while compile *64 we will have exe file and we are uploading down
	//this runtime is used to uploading the file while executing the script
				Runtime.getRuntime().exec("C:\\Users\\abirami\\eclipse-workspace\\SeleniumMayProject\\FileUpload\\fileupload.exe");
				
				/*My tries for capturing the sample.text
				Thread.sleep(5000);
				File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				File desc = new File("./screenshot/filescreen.png");
				FileUtils.copyFile(src, desc);*/

	}

}

/*AUTOIT SCRIPT EDITOR
 a desktop popup occurs while uploading a file 
 so for choosing a file and selecting open and all we are using autoit tool 
 autoit info we can find the traces using that tool
ControlFocus("Open","","Edit1")
in the above line "OPen" is from windows title and "" is text and "Edit1"is Control id classNN

ControlSetText("Open","","Edit1","C:\Users\abirami\eclipse-workspace\SeleniumMayProject\FileUpload\Sample.txt")
In the above line we are including file path of where the file is created to upload got it through eclipse

ControlClick("Open","&Open","Button1")
for the Open button
*/
