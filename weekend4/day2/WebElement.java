package weekend4.day2;

public class WebElement {
	
	public void click() {
		System.out.println("Click");
	}
	
	public void setText() {
		System.out.println("Text Method");
	}
	public static void main(String[] args) {
		WebElement we=new WebElement();
		we.click();
		we.setText();
	}

}


