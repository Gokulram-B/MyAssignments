package weekend4.day2;


public class Chrome extends Browser {

	public void openIncognito() {
		
		System.out.println("Incognito Mode");
	}
	
	public void clearCache() {
		System.out.println("Clear Cache");
	}
	
	public static void main(String[] args) {
		Chrome ch=new Chrome();
		ch.openURL();
		ch.closeBrowser();
		ch.navigateBack();
		ch.openIncognito();
		ch.clearCache();
		
	}
	
	
}
