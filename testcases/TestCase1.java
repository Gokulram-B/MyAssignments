package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class TestCase1 extends ProjectSpecificMethod {
   @Test
	public void runTestCase1() {
		// TODO Auto-generated method stub
		

		
		driver.findElement(By.xpath("//input[@class='slds-input']")).sendKeys("Legal Entities",Keys.ENTER);
		
		driver.findElement(By.xpath("//mark[text()='Legal Entities']")).click();
		
		driver.findElement(By.xpath("//div[text()='New']")).click();
		
		driver.findElement(By.xpath("//input[@name='Name']")).sendKeys("Salesforce Automation by Gokul");
		
		driver.findElement(By.xpath("//button[text()='Save']")).click();
		
		String text = driver.findElement(By.xpath("//span[text()='Salesforce Automation by Gokul | Legal Entity']")).getText();
		
		System.out.println("Testcase1: "+text);
		
		//driver.close();
		

	}

}
