package weekend1.day2;

public class HomeAssignmentIsPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n= 13;
		int count =0;
		
		for (int i = 1; i<=n; i++) 
		{
			if(n%i==0) { 
			count++;	
			}
		}
		if (count==2) {
		System.out.println("Is a prime");
				
			}
			else {
			System.out.println("Not a Prime");
			}
		
}
}


