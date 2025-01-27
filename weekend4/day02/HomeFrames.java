package weekend4.day02;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomeFrames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ChromeDriver driver=new ChromeDriver();
		//load url
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
		//maximize window
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.manage().window().maximize();
		
		driver.switchTo().frame(0);
		
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		
		Alert alert = driver.switchTo().alert();
		
		alert.accept();
		
		String text = driver.findElement(By.id("demo")).getText();
		
		System.out.println("Content: "+text);
		
		
		
		
		
		//WebElement element = driver.findElement(By.xpath("//button[text()='Try it']"));
		
		//driver.switchTo().frame(element);
		
		//driver.findElement(By.xpath("//button[text()='Try it']")).click();

	}

}
