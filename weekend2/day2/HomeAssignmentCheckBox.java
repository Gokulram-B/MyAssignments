package weekend2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HomeAssignmentCheckBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://leafground.com/checkbox.xhtml");
		
		driver.findElement(By.xpath("//span[text()='Basic']")).click();
		
		driver.findElement(By.xpath("//span[text()='Ajax']")).click();
		
		driver.findElement(By.xpath("//label[text()='Java']")).click();
		
		WebElement tri = driver.findElement(By.xpath("//span[@class='ui-chkbox-icon ui-c ']"));
		
		driver.executeScript("arguments[0].click();", tri);
		
		driver.findElement(By.xpath("//div[@class='ui-toggleswitch-slider']")).click();
		
		WebElement verify = driver.findElement(By.xpath("//span[text()='Disabled']"));
		
		driver.executeScript("arguments[0].click();", verify);
		
		WebElement ab = driver.findElement(By.xpath("//ul[contains(@class,'ui-selectcheckboxmenu-multiple')]"));
		
		ab.click();
		
		driver.findElement(By.xpath("(//label[text()='Miami'])[2]")).click();
		
		
		//Select ob=new Select(ab);
		
		//ob.selectByIndex(2);
		
		
		
		

	}

}
