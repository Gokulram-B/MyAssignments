package weekend4.day02;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnAlert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	    ChromeDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		//load url
		driver.get("https://www.leafground.com/alert.xhtml");
		//maximize window
		driver.manage().window().maximize();
        //click prompt
		driver.findElement(By.xpath("(//span[text()='Show'])[5]")).click();
		
		Alert alert = driver.switchTo().alert();
		
		alert.sendKeys("Gokul");
		
		alert.accept();
		
		String text = driver.findElement(By.id("confirm_result")).getText();
		
		System.out.println("Result: "+text);
	}

}
