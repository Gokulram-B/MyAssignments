package week1.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Login {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		ChromeDriver driver=new ChromeDriver();
		//load url
		driver.get("https://www.facebook.com");
		//maximize window
		driver.manage().window().maximize();
		driver.findElement(By.id("email")).sendKeys("gmail.com");
		driver.findElement(By.id("pass")).sendKeys("password");
		//waiting time
		//Thread.sleep(10000);
		//close browser
		//driver.close();
		driver.findElement(By.name("login")).click();
		Thread.sleep(100000);
		driver.close();

	}

}
