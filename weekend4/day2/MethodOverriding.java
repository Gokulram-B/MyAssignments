package weekend4.day2;

public class MethodOverriding {
	
	   public void reportStep(String msg,String status) {
	    System.out.println(msg+" "+status);
		}
	   public void takeSnap() {
	   System.out.println("snap taken");
		}
	   
	   public static void main(String[] args) {
		MethodOverriding mo=new MethodOverriding();
		mo.reportStep("msg", "msg status");
		mo.takeSnap();
	}
		
	}


