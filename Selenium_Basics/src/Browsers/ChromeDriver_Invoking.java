package Browsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeDriver_Invoking {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\SeleniumStuff\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
	    driver.get("http://google.com");
	    
		

	}

}
