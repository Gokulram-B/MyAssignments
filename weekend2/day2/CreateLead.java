package weekend2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	       ChromeDriver driver=new ChromeDriver();
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			
			driver.manage().window().maximize();
			
			driver.get("http://leaftaps.com/opentaps/");
			
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
			driver.findElement(By.name("departmentName")).sendKeys("name");
			driver.findElement(By.name("description")).sendKeys("Description");
			driver.findElement(By.xpath("//input[@id='createLeadForm_primaryEmail']")).sendKeys("gokulram0912@gmail.com");
			WebElement ab = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
			Select op=new Select(ab);
			op.selectByVisibleText("New York");
			driver.findElement(By.name("submitButton")).click();
			driver.findElement(By.xpath("//a[text()='Edit']")).click();
			driver.findElement(By.name("description")).clear();
			driver.findElement(By.name("importantNote")).sendKeys("note");
			driver.findElement(By.name("submitButton")).click();
			String title = driver.getTitle();
			System.out.println("Title is = "+title);
			driver.close();

	}

}
