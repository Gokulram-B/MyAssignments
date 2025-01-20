package weekend4.day2;

public class RadioButton extends Button {
	
	public void selectRadioButton() {
		System.out.println("Select Radio Button");
	}
	public static void main(String[] args) {
		RadioButton rb=new RadioButton();
		rb.selectRadioButton();
		rb.submit();
		rb.click();
		rb.setText();
		
	}

}
