package day03dropdwn;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		
				WebDriver driver;
				driver = new ChromeDriver();
				driver.get("https://demo.automationtesting.in/Register.html");
				
				
				Select skillDropdown = new Select(driver.findElement(By.xpath("//select[@id='Skills']")));
				//skillDropdown.selectByIndex(4);
				
				
				skillDropdown.selectByValue("Art Design");
				
				
				//skillDropdown.selectByVisibleText("Backup Management");
				
				Select yearDropdown = new Select(driver.findElement(By.xpath("//select[@id='yearbox']")));
				yearDropdown.selectByValue("1995");		
				Select monthDropdown = new Select(driver.findElement(By.xpath("//select[@placeholder='Month']")));
				monthDropdown.selectByValue("January");		
				Select day=new Select(driver.findElement(By.xpath("//select[@ng-model='daybox']")));
				day.selectByVisibleText("8");
				driver.findElement(By.xpath("//span[@class='select2-selection select2-selection--single']")).click();
				driver.findElement(By.xpath("//input [@role='textbox']")).sendKeys("AUS");
				driver.findElement(By.xpath("//li[@class='select2-results__option select2-results__option--highlighted']")).click();
			}

		}

	


