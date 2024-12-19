package week1.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomeAssignments {

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
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Gokul");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Ram");
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Devayanai");
		driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Ms");
		driver.findElement(By.name("submitButton")).click();
		Thread.sleep(10000);
		driver.close();
		
		
	}

}
