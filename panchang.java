import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class panchang {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.panchangam.org");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//button[text()='Jan 2024']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//strong[text()='MON']/ancestor::tr/following-sibling::tr/descendant::button[text()='1']")).click();
		File file =new File("C:\\Users\\shaik\\Downloads\\data.xlsx");
		 XSSFWorkbook wb =new XSSFWorkbook();
	     XSSFSheet sh=wb.createSheet("Jan");
	     
	    
	     
	     
		for(int i=1; i<367;i++) {
			
		WebElement sunrise = driver.findElement(By.xpath("//strong[text()='Sunrise']/ancestor::tr/td[2]"));
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		WebElement sunset = driver.findElement(By.xpath("//strong[text()='Sunset']/ancestor::tr/td[2]"));
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		WebElement tithi = driver.findElement(By.xpath("//strong[text()='Tithi']/ancestor::tr/td[2]"));
	
		WebElement nakshatram = driver.findElement(By.xpath("//strong[text()='Nakshatram']/ancestor::tr/td[2]"));
		
		WebElement yogam = driver.findElement(By.xpath("//strong[text()='Yogam']/ancestor::tr/td[2]"));
		
		WebElement karanam = driver.findElement(By.xpath("//strong[text()='Karanam']/ancestor::tr/td[2]"));
	
		WebElement rahukalam = driver.findElement(By.xpath("//strong[text()='Rahukalam']/ancestor::tr/td[2]"));
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
		WebElement yamagandam = driver.findElement(By.xpath("//strong[text()='Yamagandam']/ancestor::tr/td[2]"));
		
		WebElement varjyam = driver.findElement(By.xpath("//strong[text()='Varjyam']/ancestor::tr/td[2]"));
		
		WebElement gulika = driver.findElement(By.xpath("//strong[text()='Gulika']/ancestor::tr/td[2]"));
		
		WebElement amritakalam = driver.findElement(By.xpath("//strong[text()='Amritakalam']/ancestor::tr/td[2]"));
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		WebElement abhijit = driver.findElement(By.xpath("//strong[text()='Abhijit Muhurtham']/ancestor::tr/td[2]"));

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		String sun ="";
		String set ="";
		String tit ="";
		String nak ="";
		String yog ="";
		String kar ="";
		String rah ="";
		String yam ="";
		String var ="";
		String gul ="";
		String amr ="";
		String abh ="";
		try {
		     sun = sunrise.getText();
		     set =sunset.getText();
		     tit = tithi.getText();
			 nak = nakshatram.getText();
			 yog = yogam.getText();
			 kar = karanam.getText();
			 rah = rahukalam.getText();
			 yam = yamagandam.getText();
			 var = varjyam.getText();
			 gul = gulika.getText();
			 amr = amritakalam.getText();                 //user case --> 
			 abh = abhijit.getText();
		} catch (StaleElementReferenceException e) {
		    // Re-find the element and try again
			 sunrise= driver.findElement(By.xpath("//strong[text()='Sunrise']/ancestor::tr/td[2]"));
			sun = sunrise.getText();
			 sunset = driver.findElement(By.xpath("//strong[text()='Sunset']/ancestor::tr/td[2]"));
		     set =sunset.getText();
			 tithi = driver.findElement(By.xpath("//strong[text()='Tithi']/ancestor::tr/td[2]"));
			 tit = tithi.getText();
				nakshatram = driver.findElement(By.xpath("//strong[text()='Nakshatram']/ancestor::tr/td[2]"));
				nak = nakshatram.getText();
				yogam = driver.findElement(By.xpath("//strong[text()='Yogam']/ancestor::tr/td[2]"));
				yog = yogam.getText();
				karanam = driver.findElement(By.xpath("//strong[text()='Karanam']/ancestor::tr/td[2]"));
				kar = karanam.getText();
				rahukalam = driver.findElement(By.xpath("//strong[text()='Rahukalam']/ancestor::tr/td[2]"));
				rah = rahukalam.getText();
				yamagandam = driver.findElement(By.xpath("//strong[text()='Yamagandam']/ancestor::tr/td[2]"));
				yam = yamagandam.getText();
				varjyam = driver.findElement(By.xpath("//strong[text()='Varjyam']/ancestor::tr/td[2]"));
				 var = varjyam.getText();
				gulika = driver.findElement(By.xpath("//strong[text()='Gulika']/ancestor::tr/td[2]"));
				 gul = gulika.getText();
				amritakalam = driver.findElement(By.xpath("//strong[text()='Amritakalam']/ancestor::tr/td[2]"));
				 amr = amritakalam.getText();
				abhijit = driver.findElement(By.xpath("//strong[text()='Abhijit Muhurtham']/ancestor::tr/td[2]"));
				abh = abhijit.getText();
		}
	
		
		
		
	
		// XSSFRow rowvalue=sh.createRow(0);       //out of loop 
		 
		 XSSFRow rowvalue1=sh.createRow(i);             //try  catch --> find, ,out of the loop  
		 
		 String cellvalue1 =sunrise.getText();
		 String cellvalue2 =sunset.getText();
		 String cellvalue3 =tithi.getText();
		 String cellvalue4 =nakshatram.getText();
		 String cellvalue5 =yogam.getText();
		 String cellvalue6 =karanam.getText();
		 String cellvalue7 =rahukalam.getText();
		 String cellvalue8 =yamagandam.getText();
		 String cellvalue9 =varjyam.getText();
		 String cellvalue10 =gulika.getText();
		 String cellvalue11 =amritakalam.getText();
		 String cellvalue12=abhijit.getText();
		 
		 
		 
		 XSSFRow rowvalue=sh.createRow(0); 
	     rowvalue.createCell(0).setCellValue("Sunrise");
		 rowvalue.createCell(1).setCellValue("Sunset");
		 rowvalue.createCell(2).setCellValue("Tithi");
		 rowvalue.createCell(3).setCellValue("Nakshatram");
		 rowvalue.createCell(4).setCellValue("Yogam");
		 rowvalue.createCell(5).setCellValue("Karanam");
		 rowvalue.createCell(6).setCellValue("Rahukalam");
		 rowvalue.createCell(7).setCellValue("Yamagandam");
		 rowvalue.createCell(8).setCellValue("Varjyam");
		 rowvalue.createCell(9).setCellValue("Gulika");
		 rowvalue.createCell(10).setCellValue("Amritakalam");
		 rowvalue.createCell(11).setCellValue("abhijit");
		 		 
		
		 
		 
				rowvalue1.createCell(0).setCellValue(cellvalue1);
				rowvalue1.createCell(1).setCellValue(cellvalue2);
				rowvalue1.createCell(2).setCellValue(cellvalue3);
				rowvalue1.createCell(3).setCellValue(cellvalue4);
				rowvalue1.createCell(4).setCellValue(cellvalue5);
				rowvalue1.createCell(5).setCellValue(cellvalue6);
				rowvalue1.createCell(6).setCellValue(cellvalue7);
				rowvalue1.createCell(7).setCellValue(cellvalue8);
				rowvalue1.createCell(8).setCellValue(cellvalue9);
				rowvalue1.createCell(9).setCellValue(cellvalue10);
				rowvalue1.createCell(10).setCellValue(cellvalue11);
				rowvalue1.createCell(11).setCellValue(cellvalue12);
			
			FileOutputStream fos = new FileOutputStream(file);
			wb.write(fos);

	
	
		System.out.println(sun+"\n"+set+"\n"+tit+"\n"+nak+"\n"+yog+"\n"+kar+"\n"+rah+"\n"+yam+"\n"+var+"\n"+gul+"\n"+amr+"\n"+abh);
		Thread.sleep(10000);
		driver.findElement(By.xpath("//div[@class=\"btn-group\"]/following-sibling::a/button")).click();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);


	}
	}
}

	



