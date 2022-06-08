package seleniumprog;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class trial {

	public static void main(String[] args) {
		String path=".\\executables\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver",path);
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.google.com");
		

	}

}
