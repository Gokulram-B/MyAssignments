package weekend4.day2;

public class Browser {
	
	   public String browserName;
	   public String browserVersion;
	   
	   public void openURL() { 	
		System.out.println("Open Url");
		   }
	     public void closeBrowser() { 
	    	 System.out.println("Close Browser");
	     }
	     public void navigateBack() {
	    	 System.out.println("Navigate Back Browser");
	     } 
	    public static void main(String[] args) {
		Browser b1=new Browser();
		String browserName2 = b1.browserName;
		System.out.println("NAME OF BROWSER");
		String browserVersion3 = b1.browserVersion;
		System.out.println("BROWSER VERSION");
		b1.openURL();
		b1.closeBrowser();
		b1.navigateBack();
		}
	  
}


