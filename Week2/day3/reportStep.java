package Week2.day3;

public class reportStep{
	
	public void app(String msg,String status) {
		System.out.println(msg+" "+status);
	}
	
	public void app(String msg,String status,boolean value) {
		System.out.println(msg+" "+status+" "+value);
	}
	public static void main(String[] args) {
		reportStep rs=new reportStep();
		
		rs.app("message", "status given");
		
		rs.app("newmessage", "new status given", false);
		
	}

}

