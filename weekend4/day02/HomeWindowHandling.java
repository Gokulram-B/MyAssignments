package weekend4.day02;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomeWindowHandling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		ChromeDriver driver=new ChromeDriver();
		//load url
		driver.get("http://leaftaps.com/opentaps/");
		//maximize window
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.manage().window().maximize();
		
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		//waiting time
		//Thread.sleep(10000);
		//close browser
		//driver.close();
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Contacts")).click();
		driver.findElement(By.linkText("Merge Contacts")).click();
		//parent window
		String parentWindow = driver.getWindowHandle();
		System.out.println("Parent Window: "+parentWindow);
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("//img[@src='/images/fieldlookup.gif']")).click();
		
		//child window
		
		Set<String> childWindow = driver.getWindowHandles();
		//set to list
		List<String> listWindow=new ArrayList<String>(childWindow);
		//navigate to child
		WebDriver window = driver.switchTo().window(listWindow.get(1));
		System.out.println("Child Window: "+window);
		System.out.println(driver.getTitle());
		
		driver.findElement(By.xpath("//a[text()='Suganya']")).click();
		
		//Thread.sleep(5000);
		
		//navigate to parent window		
		driver.switchTo().window(parentWindow);
		
		driver.findElement(By.xpath("(//img[@src='/images/fieldlookup.gif'])[2]")).click();
		
		//navigate to child window
		
		Set<String> Childwindow2 = driver.getWindowHandles();
		
		List<String> listWindow2=new ArrayList<String>(Childwindow2);
		
		WebDriver window2 = driver.switchTo().window(listWindow2.get(1));
		System.out.println(window2);
		
		driver.findElement(By.xpath("//a[text()='ca1']")).click();
		
		//navigate to parent window
		
		driver.switchTo().window(parentWindow);
		
		driver.findElement(By.xpath("//a[text()='Merge']")).click();
		
		Alert alert = driver.switchTo().alert();
		
		alert.accept();
		
		System.out.println(driver.getTitle());
		
		

	}

}
