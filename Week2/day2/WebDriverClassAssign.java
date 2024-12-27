package Week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverClassAssign {

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
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Book",Keys.ENTER);
		
		String text = driver.findElement(By.xpath("//span[@class='a-price-whole']")).getText();

		System.out.println("Book Price : "+text);
		
		String replaceAll = text.replaceAll(",", "");
		
		System.out.println("Replace All Value = "+replaceAll);
		
		int int1 = Integer.parseInt(replaceAll);
		
		System.out.println("Parse int value:"+int1);
		
		String currentUrl = driver.getCurrentUrl();
		
		System.out.println(currentUrl);
		
		driver.close();
			

	}

}
