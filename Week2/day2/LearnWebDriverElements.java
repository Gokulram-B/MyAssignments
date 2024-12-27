package Week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnWebDriverElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	    ChromeDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		//load url
		driver.get("https://www.amazon.in/");
		//maximize window
		driver.manage().window().maximize();
		String title = driver.getTitle();
		
		System.out.println("the title of page :"+title);
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("phone",Keys.ENTER);
		
		String text = driver.findElement(By.xpath("//span[@class='a-price-whole']")).getText();

		System.out.println("Get text from application : "+text);
		
		String replaceAll = text.replaceAll(",", "");
		
		System.out.println("Replace Value :"+ replaceAll);
		
		//string value into integer
		int parseInt = Integer.parseInt(replaceAll);
		
		System.out.println("Integer Value :"+parseInt);
		
		//Print current url
		String currentUrl = driver.getCurrentUrl();
		
		System.out.println(currentUrl);
		
		driver.close();
		
		
	}

}
