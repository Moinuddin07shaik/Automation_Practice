        import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
		import org.w3c.dom.Document;
		import org.w3c.dom.Element;

		import javax.xml.parsers.DocumentBuilder;
		import javax.xml.parsers.DocumentBuilderFactory;
		import javax.xml.parsers.ParserConfigurationException;
		import javax.xml.transform.Transformer;
		import javax.xml.transform.TransformerException;
		import javax.xml.transform.TransformerFactory;
		import javax.xml.transform.dom.DOMSource;
		import javax.xml.transform.stream.StreamResult;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

// Java Program to Write XML Using DOM Parser 
	import javax.xml.parsers.DocumentBuilder; 
	import javax.xml.parsers.DocumentBuilderFactory; 
	import javax.xml.transform.Transformer; 
	import javax.xml.transform.TransformerFactory; 
	import javax.xml.transform.dom.DOMSource; 
	import javax.xml.transform.stream.StreamResult; 
	import org.w3c.dom.Document; 
	import org.w3c.dom.Element; 

	public class Panchangam  {
	    WebElement sunrise;
		String sun;
		public static void main(String[] args) throws Exception { 
			
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.panchangam.org/dailypanchangam.php?date=2024-01-01");
			driver.manage().window().maximize();
			Thread.sleep(3000);
			for(int i=0; i<30;i++) {
				WebElement sunrise = driver.findElement(By.xpath("//strong[text()='Sunrise']/ancestor::tr/td[2]"));
		
			Thread.sleep(10000);
			driver.findElement(By.xpath("//div[@class=\"btn-group\"]/following-sibling::a/button")).click();
			Thread.sleep(5000);
			
			String sun = "";
			
			try {
			    sun = sunrise.getText();
			} catch (StaleElementReferenceException e) {
			    // Re-find the element and try again
				 sunrise= driver.findElement(By.xpath("//strong[text()='Sunrise']/ancestor::tr/td[2]"));
				sun = sunrise.getText();
			}

			//	String sun = sunrise.getText();            
			System.out.println(sun);
		
			Thread.sleep(5000);
			
	//	 Create a DocumentBuilder 
		/*	DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance(); 
			DocumentBuilder builder = factory.newDocumentBuilder(); 

			// Create a new Document 
			Document document = builder.newDocument(); 

			// Create root element 
			Element root = document.createElement("Item"); 
			document.appendChild(root); 
			
			
			// Create book elements and add text content 
			Element book = document.createElement("Item"); 
			book.appendChild(document.createTextNode(sun));
		
            root.appendChild(book); 
			

			// Write to XML file 
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer(); 
			DOMSource source = new DOMSource(document); 

			// Specify your local file path 
			StreamResult result = new StreamResult("C:\\Users\\shaik\\Downloads\\output.xml"); 
			transformer.transform(source, result); 

			System.out.println("XML file created successfully!");*/
			
			FileWriter file = new FileWriter("G:\\Output.txt",true);
			
			file.write(sun);
			file.write("\n");
			file.close();			
			
			
		} 
	} 
	}
	



