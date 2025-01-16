package weekend2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomeAssignmentBasics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.leafground.com/radio.xhtml");
		
		driver.findElement(By.xpath("//label[text()='Chrome'][1]")).click();
		
		driver.findElement(By.xpath("//label[text()='Chennai']")).click();
		
		driver.findElement(By.xpath("//label[text()='21-40 Years']")).click();

		//driver.close();

	}

}
