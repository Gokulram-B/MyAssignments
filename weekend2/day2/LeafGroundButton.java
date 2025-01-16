package weekend2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LeafGroundButton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	       ChromeDriver driver=new ChromeDriver();
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			
			driver.manage().window().maximize();
			
			driver.get("https://leafground.com/button.xhtml");
            driver.findElement(By.xpath("//span[text()='Click']")).click();
            String title = driver.getTitle();
            System.out.println(title);
	}

}
