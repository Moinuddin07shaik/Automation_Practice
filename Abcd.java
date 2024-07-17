import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Abcd {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
         WebDriver driver = new ChromeDriver();
         driver.get("https://www.google.com/");
         String pageUrl = driver.getCurrentUrl();
         System.out.println(pageUrl);
         driver.manage().window().maximize();
         Thread.sleep(2000);
         driver.findElement(By.xpath("//a[@aria-label='Google apps']")).click();
         Thread.sleep(4000);
         WebElement element = driver.findElement(By.xpath("(//iframe[@role=\"presentation\"])[2]"));
         driver.switchTo().frame(element);
         Thread.sleep(4000);
         driver.findElement(By.xpath("//span[text()='YouTube']")).click();
         String youtubeurl = driver.getCurrentUrl();
         System.out.println(youtubeurl);
         Thread.sleep(4000);
         driver.quit();
	}

}