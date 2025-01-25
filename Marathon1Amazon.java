package weekend4.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;



public class Marathon1Amazon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 ChromeDriver driver=new ChromeDriver();
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			
			driver.get("https://www.amazon.in/");
			
			driver.manage().window().maximize();
			
			String title = driver.getTitle();
			
			System.out.println("Title: "+title);
			
			driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Bag for boys",Keys.ENTER);
			
			String text = driver.findElement(By.xpath("//h2[@class='a-size-base a-spacing-small a-spacing-top-small a-text-normal']")).getText();
			
			System.out.println(text);
			
			
			driver.findElement(By.xpath("//div[@id='brandsRefinements']/ul/span/span/li/span/a")).click();
			
			
			driver.findElement(By.xpath("//span[text()='FUR JADEN']")).click();
			
			driver.findElement(By.xpath("//span[text()='Last 90 days']")).click();
		
			
			String text3 = driver.findElement(By.xpath("//span[@class='a-size-base-plus a-color-base']")).getText();
			//String text4=driver.findElement(By.xpath("//a[@class='a-link-normal s-line-clamp-2 s-link-style a-text-normal']/h2/span")).getText();
	       
			String text5 = driver.findElement(By.xpath("//span[text()='Spree USB 30L Backpack, 2 Compartments, Front Pocket, Organizer, Bottle Holder, School Bag for Boys and Girls, College Bag, Office Bag, Travel Bag for Men and Women, Bagpack']")).getText();
			
	        String Bag1= text3+" "+text5;
			System.out.println("Bag1:"+Bag1);
			
			String amount =driver.findElement(By.xpath("//span[@class='a-price-whole']")).getText();
			System.out.println("Price: "+amount);
			
			String title2 = driver.getTitle();
			System.out.println("Title:"+title2);
			
			Thread.sleep(10000);
			
			driver.close();
			
			
			
			//String text2 = driver.findElement(By.xpath("//span[text()='Omega spacious/large laptop backpack with Raincover, college bag, travel bag for men and women, Black, 30 Litre']")).getText();
			//System.out.println(text2);
			
			
			
			
			
	}

}

	}

}
