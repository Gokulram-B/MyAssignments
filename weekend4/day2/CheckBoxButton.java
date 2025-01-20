package weekend4.day2;

public class CheckBoxButton extends Button {
	
	public void clickCheckButton() {
		System.out.println("Click Check Button");
	}
	public static void main(String[] args) {
		CheckBoxButton cb=new CheckBoxButton();
		cb.clickCheckButton();
		cb.submit();
		cb.click();
		cb.setText();
		
	}

}
