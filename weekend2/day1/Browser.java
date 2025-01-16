package weekend2.day1;

public class Browser {
	
	public String launchBrowser(String browserName) {
		System.out.println("Browser Launched Successfully");
		return browserName;
		
	}
	protected void loadUrl() {
		System.out.println("Application URL loaded Successfully");
		
	}
	public static void main(String[] args) {
		Browser op=new Browser();
		String lb = op.launchBrowser("Chrome");
		System.out.println(lb);
		op.loadUrl();
		
	}

}
