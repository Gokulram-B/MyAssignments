package weekend5.day1;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AmazonOnePlus {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		
		 ChromeDriver driver=new ChromeDriver();
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			
			driver.get("https://www.amazon.in/");
			
			driver.manage().window().maximize();
			
			String title = driver.getTitle();
			
			System.out.println("Title: "+title);
			
			driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Oneplus 9 pro",Keys.ENTER);
			
			String priceFirstPro = driver.findElement(By.xpath("(//span[@class='a-price-whole'])[1]")).getText();
			
			System.out.println("Price of First Product: "+priceFirstPro);
			
		  // WebElement mouseHover = driver.findElement(By.xpath("(//span[@class='a-icon-alt'])[1]"));
		   
		   //Actions act=new Actions(driver);
		   
		  // act.moveToElement(mouseHover).perform();
			
		driver.findElement(By.xpath("(//a[@class='a-link-normal s-line-clamp-2 s-link-style a-text-normal'])[1]")).click();
		
		Set<String> childWindow = driver.getWindowHandles();
		
		List<String> listWindow=new ArrayList<String>(childWindow);
		
		WebDriver window = driver.switchTo().window(listWindow.get(1));
		
		System.out.println("Child Window: "+window);
		System.out.println(driver.getTitle());
		
		File screenshot = driver.getScreenshotAs(OutputType.FILE);
		
		File ob1=new File("./snap/amazon.png");
		
		FileUtils.copyFile(screenshot, ob1);
		
		driver.findElement(By.xpath("//input[@id='add-to-cart-button']")).click();
		
		String totalPrice = driver.findElement(By.xpath("//span[@id='attach-accessory-cart-subtotal']")).getText();
		
		System.out.println("Total Price: "+totalPrice);
			
	    driver.quit();
			
			

	}

}
