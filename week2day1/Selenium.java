package week2day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium{

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get(" http://leaftaps.com/opentaps/control/main");
		
		driver.manage();window();maximize();
		
		driver.findElement(By.id("username")).sendKeys("demoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		
		String title = driver.getTitle();
		System.out.println(title);
		
	
		
		
		
		
		
	}

	private static void maximize() {
		// TODO Auto-generated method stub
		
	}

	private static void window() {
		// TODO Auto-generated method stub
		
	}

	

}
