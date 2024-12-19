package week1.day3;

public class Browser {

	public String launchBrowser(String browserName) {
		
		System.out.println("Browser Launched Successfully");
		return browserName;
	}
	protected void loadUrl() {
		System.out.println("Application url loaded successfully");
	}
	public static void main(String[] args) {
		Browser arc= new Browser();
	String lb = arc.launchBrowser("Chrome");
	System.out.println(lb);
	arc.loadUrl();
		
	}
}
