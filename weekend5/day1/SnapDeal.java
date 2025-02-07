package weekend5.day1;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class SnapDeal {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		
		
		ChromeOptions opt = new ChromeOptions();

		opt.addArguments("--disable-notifications");

		ChromeDriver driver = new ChromeDriver(opt);
		
		
		//load url
		driver.get("https://www.snapdeal.com/");
		//maximize window
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.manage().window().maximize();
		
		WebElement mouseHover = driver.findElement(By.xpath("(//span[@class='catText'])[1]"));
		
		Actions act=new Actions(driver);
		
		act.moveToElement(mouseHover).perform();
		
		driver.findElement(By.xpath("(//span[text()='Sports Shoes'])[1]")).click();
		
		String text = driver.findElement(By.xpath("//span[@class='category-name category-count']")).getText();
		
		System.out.println("Count of Shoes: "+text);
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[text()='Training Shoes']")).click();
		
		driver.findElement(By.xpath("//i[@class='sd-icon sd-icon-expand-arrow sort-arrow']")).click();
		
		driver.findElement(By.xpath("//li[@data-sorttype='plth']")).click();
		
		Thread.sleep(2000);
		
		WebElement element = driver.findElement(By.xpath("//div[@class='price-go-arrow btn btn-line btn-theme-secondary']"));
		
		Actions act1=new Actions(driver);
		
		act1.scrollToElement(element).perform();
		
		driver.findElement(By.xpath("(//input[@class='input-filter'])[1]")).clear();
		
		driver.findElement(By.xpath("(//input[@class='input-filter'])[1]")).sendKeys("500");
		
		driver.findElement(By.xpath("(//input[@class='input-filter'])[2]")).clear();
		
		driver.findElement(By.xpath("(//input[@class='input-filter'])[2]")).sendKeys("700");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[@class='price-go-arrow btn btn-line btn-theme-secondary']")).click();
		
		Thread.sleep(2000);
		
		WebElement scroll2 = driver.findElement(By.xpath("(//div[@class='filter-type-name lfloat'])[4]"));
		
		Actions act4=new Actions(driver);
		
		act4.scrollToElement(scroll2).perform();
		
		driver.findElement(By.xpath("//span[@class='filter-color-tile White&Blue ']")).click();
		
		Thread.sleep(2000);
		
		WebElement element2 = driver.findElement(By.xpath("(//div[@class='filter-type-name lfloat'])[2]"));
		
		Actions act5=new Actions(driver);
		
		act5.scrollToElement(element2).perform();
		
		//Thread.sleep(3000);
		
		driver.findElement(By.xpath("//div[contains(text(),'Quick View')]")).click();
		
		Thread.sleep(3000);
		
		String text2 = driver.findElement(By.xpath("//span[@class='payBlkBig']")).getText();
		
		System.out.println("Price of Product: "+text2);
		
		Thread.sleep(2000);
		
		String text3 = driver.findElement(By.xpath("//span[@class='percent-desc ']")).getText();
		
		System.out.println("Discount Percentage: "+text3);
		
		Thread.sleep(5000);
		
		File screenshot = driver.getScreenshotAs(OutputType.FILE);
		
		File ob1=new File("./snap/snapdeal.png");
		FileUtils.copyFile(screenshot, ob1);
		
		driver.quit();
	
		
		
	}

}
