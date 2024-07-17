
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		List<WebElement> data = driver.findElements(By.xpath("//span[@class=\"_1XjE3T\"]"));
		 
		 System.out.println("size"+data.size());
		   
		  for(int i=0; i<data.size(); i++)
		   {
			   WebElement dat = data.get(i);
			  String text = dat.getText();
			  System.out.println(text);
			//driver.close();
			  FileWriter file = new FileWriter("C:\\Users\\shaik\\Downloads\\data_output.txt",true);
				
				file.write(text);
				file.write("\n");
				file.close();
		

}
}
}
