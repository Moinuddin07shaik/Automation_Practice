import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class resizable {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/resizable/");
		driver.manage().window().maximize();
		
		WebElement frame = driver.findElement(By.xpath("//iframe[@class=\"demo-frame\"]"));
		
		driver.switchTo().frame(frame);
		
		Thread.sleep(5000);
		
	WebElement resize =	driver .findElement(By.xpath("//div[@id=\"resizable\"]/descendant::h3/following-sibling::div[3]"));
	
	              Actions action = new Actions(driver);
	              
	              action.clickAndHold(resize);
	              action.moveByOffset(120, 90);
	              action.release().perform();
	              
	              
	}

}
