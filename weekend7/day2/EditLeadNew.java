package weekend7.day2;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class EditLeadNew extends BaseClass1 {
	
	public void setValues() {
		String excelFileName = "EditLead";
	}
    @Test(dataProvider="fetchData")
	public  void runEditLead(String pNo,String company) throws InterruptedException {
		// TODO Auto-generated method stub

		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("pNo");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		driver.findElement(By.linkText("Edit")).click();
		driver.findElement(By.id("updateLeadForm_companyName")).sendKeys("company");
		driver.findElement(By.name("submitButton")).click();
		//driver.close();
	}

}
