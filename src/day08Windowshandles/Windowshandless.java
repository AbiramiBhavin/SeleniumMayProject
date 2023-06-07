package day08Windowshandles;
import org.openqa.selenium.By; //importing xpath
import org.openqa.selenium.Keys; //import keys for keyboard
import org.openqa.selenium.WebDriver; //importing webdriver
import org.openqa.selenium.chrome.ChromeDriver; //importing chromedriver
import org.openqa.selenium.support.ui.Select; //importing select


public class Windowshandless {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
				WebDriver driver;
				driver = new ChromeDriver();
				driver.get("https://www.amazon.in/"); //for amazon website java book order
				driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Java Books"+Keys.ENTER);
				// above line is typing java book in search tab and pressing enter key through keyboard through keys.enter
				driver.findElement(By.xpath("(//span[contains(text(),'Core Java: An Integrated Approach, New')])[3]")).click();
				//above line is selecting the third book of the particular window by selecting the xpath through index
				//xpath throgh index is through [] square bracket
				driver.findElement(By.xpath("//span[contains(text(),'Java 8 Programming Black Book | e | k')]")).click();// for another book
//System.out.println(driver.getWindowHandles());// for my reference
				for(String id:driver.getWindowHandles())// for each tabs we are puting the windows handles to string
				{
					driver.switchTo().window(id);// for switching to the particular window
					if(driver.getCurrentUrl().contains("Core-Java-Integrated-Approach-Versions"))// if somwe window is opened and if that url of a window contains a partial text then we start ordering the books
					{
						Select dropdown = new Select(driver.findElement(By.xpath("//select[@name='quantity']")));//xpath for quanity
						dropdown.selectByValue("6");// selecting 6 in dropdown
						driver.findElement(By.xpath("//input[@id='add-to-cart-button']")).click(); // xpath for click and clicking the book
					}
					if(driver.getCurrentUrl().contains("Java-8-Programming-Black-Book")) // for dering other book
					{
						Select dropdown = new Select(driver.findElement(By.xpath("//select[@name='quantity']")));
						dropdown.selectByValue("2");
						driver.findElement(By.xpath("//input[@id='add-to-cart-button']")).click();
					}
				}
			}
}


