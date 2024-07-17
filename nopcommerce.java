import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class nopcommerce {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//button[text()='Log in']")).click();
		driver.findElement(By.xpath("//p[normalize-space()='Catalog']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//p[normalize-space()='Products']")).click();
		
		driver.findElement(By.xpath("//a[@class='btn btn-primary']")).click();
		
	}

}
