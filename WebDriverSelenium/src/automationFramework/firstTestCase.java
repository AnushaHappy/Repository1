package automationFramework;

import java.util.List;
import java.util.ArrayList;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class firstTestCase {
	
	static WebDriver driver;
	
	static final String driverPath = "C:\\Users\\Malarvizhia\\Downloads\\chromedriver_win32\\chromedriver.exe";
	static String URL = "http://www.google.com";
	static String searchBoxLocator = "lst-ib";
	static By searchBoxBy = By.id(searchBoxLocator);
	
	static void init(){
		driver = new ChromeDriver(); 
		System.setProperty("webdriver.chrome.driver", driverPath);		
		driver.get(URL);
	}

	static void validateGoogleIsGettingOpened(){
		WebElement searchBoxElem = driver.findElement(searchBoxBy);
		searchBoxElem.sendKeys("accuity");
		searchBoxElem.sendKeys(Keys.ENTER);
		
	}
	
	public static void main(String[] args) {
		
		WebElement imgLink = driver.findElement(By.className("qs"));
		imgLink.click();
		//List<WebElement> allImages = driver.findElements(By.tagName("img"));
		//allImages.get(0);
	}

}
