package weekend4.day2;

public class TextField extends WebElement{
	public void getText() {
		System.out.println("Get Text Method");
	}
	public static void main(String[] args) {
		TextField tf=new TextField();
		tf.getText();
		tf.click();
		tf.setText();
		
	}
	
	

}
