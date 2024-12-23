package Week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HomeAssignmentWebElement {

	public static void main(String[] args) throws InterruptedException {
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
		driver.findElement(By.id("accountName")).sendKeys("SeleniumAcc1");
	    driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
	    
	    WebElement ab = driver.findElement(By.name("industryEnumId"));
	    
	   Select op=new Select(ab);
		
		op.selectByIndex(3);
	    
		WebElement ab1 = driver.findElement(By.name("ownershipEnumId"));
		
		Select op1=new Select(ab1);
		
		op1.selectByVisibleText("S-Corporation");
		
		WebElement ab2 = driver.findElement(By.id("dataSourceId"));
		
		Select op2=new Select(ab2);
		
		op2.selectByValue("LEAD_EMPLOYEE");
		
		WebElement ab3 = driver.findElement(By.id("marketingCampaignId"));
		
		Select op3=new Select(ab3);
		
		op3.selectByIndex(6);
		
		WebElement ab4 = driver.findElement(By.id("generalStateProvinceGeoId"));
		
		Select op4=new Select(ab4);
		
		op4.selectByValue("TX");
		
		 driver.findElement(By.className("smallSubmit")).click();
		 
		 Thread.sleep(5000);
		 
		 driver.close();
		     
	}

}
