package Week2.day3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Marathon1Pvr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver driver =new ChromeDriver();
		
		
		
		driver.get("https://www.pvrcinemas.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.xpath("(//span[@class='cities-placed'])[2]")).click();
		
		driver.findElement(By.xpath("//span[text()='Chennai']")).click();
		
		//driver.findElement(By.xpath("//span[@id='city']")).sendKeys("Chennai");
		
		
		driver.findElement(By.xpath("//span[text()='Cinema']")).click();
		
		driver.findElement(By.xpath("//span[text()='Select Cinema']")).click();
		driver.findElement(By.xpath("//span[text()='INOX National,Virugambakkam Chennai']")).click();
		
		driver.findElement(By.xpath("//span[text()='Tomorrow']")).click();
		driver.findElement(By.xpath("(//span[text()='THE SMILE MAN'])[2]")).click();
		
		driver.findElement(By.xpath("//span[text()='07:20 PM']")).click();
		driver.findElement(By.xpath("//button[@class='p-button p-component sc-dIUfKc iRVxoq bgColor filter-btn']/span")).click();
		
		driver.findElement(By.xpath("//button[@class='sc-iBPTVF eafRB reject-terms']")).click();
		
		driver.findElement(By.xpath("//span[@id='SL.SILVER|C:10']")).click();
		
		String seat = driver.findElement(By.xpath("//div[@class='select-seat-number']")).getText();
		
		System.out.println("Seat Number:"+seat);
		
		String total = driver.findElement(By.xpath("//div[@class='grand-prices']/h6")).getText();
		
		System.out.println("Total Price:"+total);
		
		driver.findElement(By.xpath("//button[@class='sc-kfzCjt dzvwYk btn-proceeded']")).click();
		
		driver.findElement(By.xpath("//button[text()='Proceed']")).click();
		
		driver.findElement(By.xpath("(//i[@class='pi pi-times'])[2]")).click();
		
		String title = driver.getTitle();
		
		System.out.println("Title is"+title);
		
		driver.close();
		
		
		
		
		//WebElement aa = driver.findElement(By.xpath("//span[text()='Select Movie']"));
		
		
		//Select op=new Select(aa);
		
		//op.selectByVisibleText("INOX National,Virugambakkam Chennai");
		
		
		
		
		
		//driver.findElement(By.xpath("//h2[text()='PVR Heritage RSL ECR Chennai']")).click();
		
		
		
		//driver.findElement(By.xpath("//span[text()='Tomorrow']")).click();
		
		
		
		
		
		//WebElement ab = driver.findElement(By.xpath("//input[@class=\"p-inputtext p-component p-autocomplete-input p-autocomplete-input\"]"));
		
		
		
		//Select ob=new Select(ab);
		
	    // ob.selectByVisibleText("Chennai");
	     
	     //driver.findElement(By.className("pi pi-search")).click();
	     
	     
		
		
		
		
		
		//driver.findElement(By.className("//input[@class='p-inputtext p-component p-autocomplete-input p-autocomplete-input']")).sendKeys("Chennai",Keys.ENTER);
		
		
		

	}

}
