package weekend4.day2;

public class Button extends WebElement {
	
	public void submit() {
		System.out.println("Submit Method");
	}
	public static void main(String[] args) {
		Button b=new Button();
		b.submit();
		b.click();
		b.setText();
	}

}
