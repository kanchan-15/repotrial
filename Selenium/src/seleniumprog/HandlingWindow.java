package seleniumprog;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingWindow {

	public static void main(String[] args) {
		SeleniumUtility s1 = new SeleniumUtility();
		WebDriver driver = s1.setUp("chrome", "https://etrain.info/in");
		
		String homePageWinId=driver.getWindowHandle();
		System.out.println("Home page window ID:"+homePageWinId);
		
		driver.findElement(By.xpath("//i[@class='icon-linkedin']")).click();
		
		Set<String> allWinIds=driver.getWindowHandles();
		System.out.println("All windows id:"+allWinIds);
		
		
		allWinIds.remove(homePageWinId);
		System.out.println("After removing, all window Id:"+allWinIds);
		
		Iterator<String> itr=allWinIds.iterator();
		String childWinId=itr.next();
		driver.switchTo().window(childWinId);
		
		System.out.println("Linked page title:"+driver.getTitle());
		System.out.println("Linked page url:"+driver.getCurrentUrl());
		
		driver.close();
		
		

	}
}

		
