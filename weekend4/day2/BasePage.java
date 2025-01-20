package weekend4.day2;

public class BasePage {
	
	public void findElement() {
		System.out.println("Find Element");
	}
    public void clickElement() {
    	System.out.println("Click Element");
    }
    public void enterText() {
    	System.out.println("Enter Text");
    }
    public void performCommonTasks() {
    	System.out.println("Perform Common Tasks");
    }
    public static void main(String[] args) {
		BasePage bp=new BasePage();
		bp.findElement();
		bp.clickElement();
		bp.enterText();
		bp.performCommonTasks();
	}
}
