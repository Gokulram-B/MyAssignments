package Week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LearnDropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		//load url
		driver.get("https://www.telerik.com/contact");
		//maximize window
		driver.manage().window().maximize();
		
		WebElement dd = driver.findElement(By.id("Dropdown-1"));
		
		//select object
		Select op=new Select(dd);
		
		op.selectByIndex(5);
		
		WebElement dd1 = driver.findElement(By.id("Dropdown-2"));
		
		Select op1=new Select(dd1);
		
		op1.selectByVisibleText("UI for WinUI");
		
		WebElement dd2 = driver.findElement(By.id("Country-1"));
		
		Select op2=new Select(dd2);
		
		op2.selectByValue("India");
		
	}

}
