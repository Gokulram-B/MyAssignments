package weekend4.day2;

public class MethodOverriding1 extends MethodOverriding {
	
	  public void reportStep(String msg,String status) {
		    System.out.println(msg+" "+status);
			}
		   public void takeSnap() {
		   System.out.println("New Snap Taken");
			}
		   
		   public static void main(String[] args) {
			MethodOverriding1 mo1=new MethodOverriding1();
			mo1.reportStep("msg", "msg status");
			mo1.takeSnap();
		}

}
