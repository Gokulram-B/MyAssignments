package weekend7.day2;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class AssignDynamic extends AssignmentBaseClass {
	
	
	   @Test(dataProvider="fetchData")
		public void runAssignDynamic(String name) {
			// TODO Auto-generated method stub
			

			
			driver.findElement(By.xpath("//input[@class='slds-input']")).sendKeys("Legal Entities",Keys.ENTER);
			
			driver.findElement(By.xpath("//mark[text()='Legal Entities']")).click();
			
			driver.findElement(By.xpath("//div[text()='New']")).click();
			
			driver.findElement(By.xpath("//input[@name='Name']")).sendKeys(name);
			
			driver.findElement(By.xpath("//button[text()='Save']")).click();
			
			String text = driver.findElement(By.xpath("//span[text()='Salesforce Automation by Gokul | Legal Entity']")).getText();
			
			System.out.println("Static: "+text);

}
	   @DataProvider(name="fetchData")
	   public String[][] data() throws IOException{
		   
		   String[][] newData = AssignExcelIntegration.newData();
		   
		return newData ;
		   
	   }

}
