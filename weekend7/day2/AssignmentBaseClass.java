package weekend7.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class AssignmentBaseClass {
	
	public ChromeDriver driver;
	
	@BeforeMethod
	@Parameters({"uName","pWord"})

	public  void preConditions(String uName, String pWord) {
		ChromeOptions opt = new ChromeOptions();

		opt.addArguments("--disable-notifications");

		ChromeDriver driver = new ChromeDriver(opt);
		
		
		//load url
		driver.get("https://login.salesforce.com");
		//maximize window
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.manage().window().maximize();
		
		driver.findElement(By.id("username")).sendKeys(uName);
		driver.findElement(By.id("password")).sendKeys(pWord);
		
		driver.findElement(By.id("Login")).click();
		
		driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
		
		driver.findElement(By.xpath("//button[text()='View All']")).click();
	}
	
	@AfterMethod
	
	public void postConditions() {
		System.out.println("Done");

	}

}
