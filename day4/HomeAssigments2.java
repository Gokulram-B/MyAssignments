package week1.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomeAssigments2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		//load url
		driver.get("http://leaftaps.com/opentaps/");
		//maximize window
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		//waiting time
		//Thread.sleep(10000);
		//close browser
		//driver.close();
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Accounts")).click();
		driver.findElement(By.linkText("Create Account")).click();
		driver.findElement(By.id("accountName")).sendKeys("SeleniumAcc");
	    driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
	    driver.findElement(By.id("numberEmployees")).sendKeys("10");
	    driver.findElement(By.id("officeSiteName")).sendKeys("LeafTaps");
	    driver.findElement(By.className("smallSubmit")).click();
	    
	    
		
		
		
		
		

	}

}
