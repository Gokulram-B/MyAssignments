package Week2.day3;



public class Browser {
	
     public String browserName;
     public String browserVersion;
     
     public void openUrl() {
    	 
    	 System.out.println("Open Url");
	}

     public void closeBrowser() {
    	 
    	 System.out.println("Close Browser");
     }
     
     public void navigateBack() {
    	 System.out.println("Navigate Back Browser");
     }
     
     public static void main(String[] args) {
		Browser bw =new Browser();
		System.out.println("Browser");
		bw.openUrl();
		bw.closeBrowser();
		bw.navigateBack();
	}
}
