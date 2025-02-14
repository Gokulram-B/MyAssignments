package weekend7.day2;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CreateLead extends BaseClass1 {
   @Test(dataProvider="fetchData")
	public void runCreateLead(String company,String fName,String lName) {
		// TODO Auto-generated method stub
		

		
		//ChromeDriver driver = new ChromeDriver();
		//driver.manage().window().maximize();
		//driver.get("http://leaftaps.com/opentaps/");
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		//driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		//driver.findElement(By.id("password")).sendKeys("crmsfa");
		//driver.findElement(By.className("decorativeSubmit")).click();
		//driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("company");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("fName");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("lName");
		driver.findElement(By.name("submitButton")).click();
		//driver.close();


	}
   @DataProvider(name="fetchData")
   public String[][] sendData() throws IOException{
	   return ExcelIntegration.readData();
   }
}
