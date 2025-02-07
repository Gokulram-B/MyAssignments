package testcases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class TestCase02 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		
		ChromeOptions opt = new ChromeOptions();

		opt.addArguments("--disable-notifications");

		ChromeDriver driver = new ChromeDriver(opt);
		
		
		//load url
		driver.get("https://login.salesforce.com");
		//maximize window
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.manage().window().maximize();
		
		driver.findElement(By.id("username")).sendKeys("dilip@testleaf.com");
		driver.findElement(By.id("password")).sendKeys("Test@2025");
		
		driver.findElement(By.id("Login")).click();
		
		driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
		
		driver.findElement(By.xpath("//button[text()='View All']")).click();
		
		driver.findElement(By.xpath("//input[@class='slds-input']")).sendKeys("Legal Entities",Keys.ENTER);
		
		driver.findElement(By.xpath("//mark[text()='Legal Entities']")).click();
		
		driver.findElement(By.xpath("//div[text()='New']")).click();
		
		driver.findElement(By.xpath("//input[@name='Name']")).sendKeys("Salesforce Automation by Gokul");
		
		driver.findElement(By.xpath("//input[@name='CompanyName']")).sendKeys("TestLeaf");
		
		driver.findElement(By.xpath("(//textarea[@class='slds-textarea'])[2]")).sendKeys("Sales Force");
		
		Thread.sleep(2000);
		
		WebElement scroll = driver.findElement(By.xpath("//span[text()='--None--']"));
		
		Actions act1=new Actions(driver);
		act1.scrollToElement(scroll).perform();
		driver.findElement(By.xpath("(//div[@class='slds-input__icon-group slds-input__icon-group_right'])[2]")).click();
		
	//WebElement element = driver.findElement(By.xpath("//label[text()='Status']/parent::div/div//div//button"));
		
	   //Actions act=new Actions(driver);
	    
	   //act.moveToElement(element).click().build().perform();
	    
	    driver.findElement(By.xpath("//span[text()='Active']")).click();
	    
	    //driver.findElement(By.xpath("//button[text()='Save']")).click();
	    
	    
	    
	   // driver.close();

	}

}
