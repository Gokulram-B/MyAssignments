package weekend5.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class FinanceYahoo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		ChromeOptions opt = new ChromeOptions();

		opt.addArguments("--disable-notifications");

		ChromeDriver driver = new ChromeDriver(opt);
		
		
		//load url
		driver.get("https://finance.yahoo.com/");
		//maximize window
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.manage().window().maximize();
		
       WebElement mouseHover = driver.findElement(By.xpath("//span[text()='More']"));
       
       Actions act=new Actions(driver);
       
       act.moveToElement(mouseHover).perform();
       
       driver.findElement(By.xpath("(//a[text()='Crypto '])[3]")).click();
       
       Thread.sleep(3000);
       
       WebElement table = driver.findElement(By.xpath("//table[@class='markets-table freeze-col yf-paf8n5 fixedLayout']"));
       
       List<WebElement> currrencyNames = driver.findElements(By.xpath("//table[@class='markets-table freeze-col yf-paf8n5 fixedLayout']/tbody/tr/td[2]"));
       
       
       
       for (WebElement name : currrencyNames) {
    	   
    	   System.out.println(name.getText());
		
	}
       
       
       
		

	}

}
