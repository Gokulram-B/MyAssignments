package weekend2.day1;

import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//open Chrome 
		ChromeDriver driver=new ChromeDriver();
		//load url
		driver.get("https://www.facebook.com/");
		//maximize window
		driver.manage().window().maximize();
		//waiting time 
		Thread.sleep(5000);
		//close browser
		driver.close();
		

	}

}
