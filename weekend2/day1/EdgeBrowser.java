package weekend2.day1;

public class EdgeBrowser {
	public static void main(String[] args) {
		Browser op1=new Browser();
		String lb1 = op1.launchBrowser("Edge");
		System.out.println(lb1);
		op1.loadUrl();
	}

}
