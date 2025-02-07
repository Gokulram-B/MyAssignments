package weekend5.day1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class RailWebTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ChromeOptions opt = new ChromeOptions();

		opt.addArguments("--disable-notifications");

		ChromeDriver driver = new ChromeDriver(opt);
		
		
		//load url
		driver.get("https://erail.in/");
		//maximize window
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.manage().window().maximize();
		
		driver.findElement(By.id("txtStationFrom")).clear();
		
		driver.findElement(By.id("txtStationFrom")).sendKeys("MAS",Keys.ENTER);
		
		
		driver.findElement(By.id("txtStationTo")).clear();
		
		driver.findElement(By.id("txtStationTo")).sendKeys("MDU",Keys.ENTER);
		
		driver.findElement(By.xpath("//input[@id='chkSelectDateOnly']")).click();
		
		//locate the table
		
		WebElement table = driver.findElement(By.xpath("//table[@class='DataTable TrainList TrainListHeader stickyTrainListHeader']/tbody"));
		
		//print cloumn 2 
		
		List<WebElement> col2Print = driver.findElements(By.xpath("//table[@class='DataTable TrainList TrainListHeader stickyTrainListHeader']/tbody/tr/td[2]"));
		
		for (WebElement name : col2Print) {
			
			System.out.println(name.getText());
			
		}
		
	
		
		
		
		

	}

}
