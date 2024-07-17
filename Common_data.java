import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class Common_data {
      public static WebDriver driver;
      static String data;
	public static void Browser() throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.panchangam.org/dailypanchangam.php?date=2024-01-01");
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		WebElement sunrise = driver.findElement(By.xpath("//strong[text()='Sunrise']/ancestor::tr/td[2]"));
		
		String sun = sunrise.getText();
		
		System.out.println(sun);
		
		WebElement abc = driver.findElement(By.xpath("//table[@class=\"table table-striped table-condensed\"]"));
		String data = abc.getText();
		System.out.println(data);
		
		
    	
    }
    public static void Create_Xml() throws TransformerException, ParserConfigurationException{
    	// Create a DocumentBuilder 
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance(); 
		DocumentBuilder builder = factory.newDocumentBuilder(); 

		// Create a new Document 
		Document document = builder.newDocument(); 

		// Create root element 
		Element root = document.createElement("library"); 
		document.appendChild(root); 
		
		
		// Create book elements and add text content 
		Element book1 = document.createElement("String"); 
		book1.appendChild(document.createTextNode(data));
	/*	Element book2 = document.createElement("Program2"); 
		book2.appendChild(document.createTextNode("Python Programming")); 
		Element book3 = document.createElement("Program3"); 
		book3.appendChild(document.createTextNode("JavaScript")); 
		Element book4 = document.createElement("Program4"); 
		book4.appendChild(document.createTextNode("C Programming")); */
		root.appendChild(book1); 
	//	root.appendChild(book2); 
	//	root.appendChild(book3); 
	//	root.appendChild(book4); 

		// Write to XML file 
		TransformerFactory transformerFactory = TransformerFactory.newInstance(); 
		Transformer transformer = transformerFactory.newTransformer(); 
		DOMSource source = new DOMSource(document); 

		// Specify your local file path 
		StreamResult result = new StreamResult("C:\\Users\\shaik\\Downloads\\output.xml"); 
		transformer.transform(source, result); 

		System.out.println("XML file created successfully!");
    	
    }
}
