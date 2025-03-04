package weekend7.day2;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

public class BaseClass1 {
	
	   @DataProvider(name="fetchData")
	   public String[][] sendData() throws IOException{
		   return CommonExcelIntegration.readData();
	   }

	
	public ChromeDriver driver;
	 @Parameters({"browser","url","username","password"})
	@BeforeMethod
	public void preConditions(String browser,String url,String uName,String pWord) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("url");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.id("username")).sendKeys("uName");
		driver.findElement(By.id("password")).sendKeys("pWord");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
	}
	@AfterMethod
	public void postConditions() {
		System.out.println("Done");
	}

}
