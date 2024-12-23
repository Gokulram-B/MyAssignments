package Week2.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HomeAssignFacebook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
       ChromeDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://en-gb.facebook.com/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.linkText("Create new account")).click();
		
		driver.findElement(By.name("firstname")).sendKeys("Gokulram");
		
		driver.findElement(By.name("lastname")).sendKeys("B");
		
		WebElement fb = driver.findElement(By.id("day"));
		
       Select op=new Select(fb);
		
		op.selectByIndex(8);
		
		WebElement fb1 = driver.findElement(By.id("month"));
		
		Select op1=new Select(fb1);
		
		op1.selectByValue("1");
		
		WebElement fb2 = driver.findElement(By.id("year"));
		
		Select op2=new Select(fb2);
		
		op2.selectByVisibleText("1992");
		
		driver.findElement(By.xpath("//label[contains(text(),'Male')] ")).click();
		
		driver.findElement(By.name("reg_email__")).sendKeys("abc@gmail.com");
		
		driver.findElement(By.id("password_step_input")).sendKeys("123456");
		
		driver.findElement(By.xpath("//button[contains(text(),'Sign Up')] ")).click();
		
		
	}

}
