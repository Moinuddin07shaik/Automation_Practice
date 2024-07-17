import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/r.php?locale=en_GB&display=page");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name=\"firstname\"]")).sendKeys("moinuddin");
		driver.findElement(By.xpath("//input[@name=\"lastname\"]")).sendKeys("shaik");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name=\"reg_email__\"]")).sendKeys("9533887089");
		Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@name=\"reg_passwd__\"]")).sendKeys("Moin#$@123");
        Thread.sleep(2000);
		driver.findElement(By.xpath("//select[@title=\"Day\"]")).sendKeys("20");
		driver.findElement(By.xpath("//select[@title=\"Month\"]")).sendKeys("Jan");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//select[@title=\"Year\"]")).sendKeys("2024");
        driver.findElement(By.xpath("//label[text()='Male']")).click();
        
       // Thread.sleep(2000);
        
        
        
		
		
		
		

	}

}
