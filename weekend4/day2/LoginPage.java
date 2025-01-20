package weekend4.day2;

public class LoginPage extends BasePage {
	public void findElement() {
		System.out.println("new Find Element");
	}
    public void clickElement() {
    	System.out.println("new Click Element");
    }
    public void enterText() {
    	System.out.println("new Enter Text");
    }
    public void performCommonTasks() {
    	System.out.println("new perform common tasks");
    }
	public static void main(String[] args) {
		LoginPage lp=new LoginPage();
		lp.findElement();
		lp.clickElement();
		lp.performCommonTasks();
		
	}
	

}
