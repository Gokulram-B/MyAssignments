package week1.day1;

public class IsPrime {

	public static void main(String[] args) 
	{
		
		int n= 5;
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



