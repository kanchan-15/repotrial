package seleniumprog;

import org.openqa.selenium.chrome.ChromeDriver;

public class Actitime {

	public static void main(String[] args) {
		String path=".\\executables\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://demo.actitime.com/login.do");
		System.out.println("Application Current Title:" +driver.getTitle());
		String expectedTitle="actiTIME - Login";
		String actualTitle=driver.getTitle();
		if(actualTitle.equals(expectedTitle)) {
		System.out.println("login page opened successfully");
		} else {
			System.out.println("page title incorrect or changed");
		}
		
		}

	}


