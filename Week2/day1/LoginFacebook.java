package Week2.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginFacebook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		//load url
		driver.get("https://www.facebook.com");
		//maximize window
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("@yahoo.in");
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("password");
	    driver.findElement(By.xpath("//button[@name='login']")).click();
		

	}

}
