package weekend4.day2;

public class JavaClass {
	
	public void reportStep(String msg,String status) {
		System.out.println(msg+" "+status);
	}
	
	public void reportStep(String msg,String status,boolean value) {
		System.out.println(msg+" "+status+" "+value);
	}
	public static void main(String[] args) {
		JavaClass jc=new JavaClass();
		jc.reportStep("Welcome", "Status Given");
		jc.reportStep("Welcome To Party", "New Status Given", false);
	}
	

}
