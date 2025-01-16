package weekend2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		//load url
		driver.get("https://www.facebook.com");
		//maximize window
		driver.manage().window().maximize();
		//input login
		driver.findElement(By.id("email")).sendKeys("@yahoo.in");
		//input password
		driver.findElement(By.id("pass")).sendKeys("password");
		//click login
	    driver.findElement(By.name("login")).click();
	    //to get title
	    String title = driver.getTitle();
	    System.out.println("Title = "+title);
	    //to get current url
	    String currentUrl = driver.getCurrentUrl();
	    System.out.println("Current Url = "+currentUrl);
	    driver.close();

	}

}
