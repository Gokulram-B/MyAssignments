package Week2.day3;

public class Safari extends Browser {
	
	public void readerMode() {
		System.out.println("Reader Mode");
	}
	
	public void fullScreenMode() {
		System.out.println("Fullscreen Mode");
	}
	
	public static void main(String[] args) {
		Safari s=new Safari();
		
		s.openUrl();
		s.closeBrowser();
		s.navigateBack();
		s.readerMode();
		s.fullScreenMode();
		
	}

}
