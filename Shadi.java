import javax.swing.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Shadi {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.shaadi.com/join-now");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//label[text()=\"I'm looking for a\"]/following-sibling::div//div[contains(@class, 'is-selected')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[text()='Man']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//label[text()='aged']/following-sibling::div/div[contains(@class, 'ageFrom')]/div/div/div[1]")).click();
        // Actions action = new Actions(driver);
       //  action.sendKeys(Keys.PAGE_DOWN).build().perform();
         Thread.sleep(4000);
		 driver.findElement(By.xpath("//div[text()='25' and @role=\"option\"]")).click();
		 driver.findElement(By.xpath("//div[contains(@class, 'ageUpto')]/div/div/div[1]")).click();
		 driver.findElement(By.xpath("//div[text()='30']")).click();
		
		//driver.quit();

	}

}
