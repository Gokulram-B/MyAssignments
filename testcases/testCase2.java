package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class testCase2 extends ProjectSpecificMethod {
    @Test
	public  void runTestCase2() throws InterruptedException {

		
		driver.findElement(By.xpath("//input[@class='slds-input']")).sendKeys("Legal Entities",Keys.ENTER);
		
		driver.findElement(By.xpath("//mark[text()='Legal Entities']")).click();
		
		driver.findElement(By.xpath("//div[text()='New']")).click();
		
		driver.findElement(By.xpath("//input[@name='Name']")).sendKeys("Salesforce Automation by Gokul");
		
		driver.findElement(By.xpath("//input[@name='CompanyName']")).sendKeys("TestLeaf");
		
		driver.findElement(By.xpath("(//textarea[@class='slds-textarea'])[2]")).sendKeys("Sales Force");
		
		Thread.sleep(2000);
		
	
	    
	    driver.findElement(By.xpath("//button[text()='Save']")).click();
	    
		String text1 = driver.findElement(By.xpath("//span[text()='Salesforce Automation by Gokul | Legal Entity']")).getText();
		
		System.out.println("Testcase1: "+text1);

	}

}
