import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EnterTheValue {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://practice-test-login/");
		Thread.sleep(2000);
		String name = "Moinuddin";
		driver.findElement(By.xpath("//input[@id=\"username\"]")).sendKeys(name);
		driver.close();

	}

}
