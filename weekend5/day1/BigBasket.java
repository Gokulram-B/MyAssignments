package weekend5.day1;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class BigBasket {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		
		ChromeOptions opt = new ChromeOptions();

		opt.addArguments("--disable-notifications");

		ChromeDriver driver = new ChromeDriver(opt);
		
		
		//load url
		driver.get("https://www.bigbasket.com/");
		//maximize window
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("(//span[text()='Category'])[2]")).click();
		
		Thread.sleep(2000);
		
		
		WebElement element = driver.findElement(By.xpath("(//a[text()='Foodgrains, Oil & Masala'])[2]"));
		
		Actions act=new Actions(driver);
		
		act.moveToElement(element).perform();
		
		WebElement element2 = driver.findElement(By.xpath("(//a[text()='Rice & Rice Products'])[1]"));
		
		Actions act1=new Actions(driver);
		
		act1.moveToElement(element2).perform();
		
		driver.findElement(By.xpath("//a[text()='Boiled & Steam Rice']")).click();
		
		//driver.findElement(By.xpath("(//input[@type='text'])[3]")).sendKeys("bb Royal",Keys.ENTER);
		
		WebElement scroll = driver.findElement(By.xpath("//label[text()='Chandana']"));
		
		Actions act3=new Actions(driver);
		
		act3.scrollToElement(scroll).perform();
		
		driver.findElement(By.xpath("//input[@id='i-BBRoyal']")).click();
		
		
		
		Thread.sleep(2000);
		
		WebElement scroll1 = driver.findElement(By.xpath("//label[text()='Combo  2 Items']"));
		
		Actions act4=new Actions(driver);
		
		act4.scrollToElement(scroll1).perform();
		
		driver.findElement(By.xpath("//input[@id='i-PonniBoiledRice']")).click();
		
		Thread.sleep(2000);
		
		WebElement scroll3 = driver.findElement(By.xpath("//label[text()='1 kg Pouch (12 - 17 Months Old)']"));
		
		Actions act5=new Actions(driver);
		
		act5.scrollToElement(scroll3).perform();
		
		driver.findElement(By.xpath("//label[text()='26 kg Bag']")).click();
		
		Thread.sleep(2000);
		
		String text = driver.findElement(By.xpath("(//span[@class='Label-sc-15v1nk5-0 Pricing___StyledLabel-sc-pldi2d-1 gJxZPQ AypOi'])[2]")).getText();
		
		System.out.println("Price of bag: "+text);
		
		Thread.sleep(2000);
		
		WebElement scroll4 = driver.findElement(By.xpath("//h1[text()='Buy Boiled Rice Online']"));
		
		Actions act6=new Actions(driver);
		
		act6.scrollToElement(scroll4).perform();
		
		driver.findElement(By.xpath("(//button[text()='Add'])[2]")).click();
		
		WebElement scroll5 = driver.findElement(By.xpath("//span[text()='Home']"));
		
		Actions act7=new Actions(driver);
		
		act7.scrollToElement(scroll5).perform();
		
		Thread.sleep(2000);
		
		File screenshot = driver.getScreenshotAs(OutputType.FILE);
		
		File ob1=new File("./snap/big.png");
		FileUtils.copyFile(screenshot, ob1);
		
		driver.close();
		
		
		

	}

}
