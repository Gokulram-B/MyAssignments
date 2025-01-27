package weekend4.day2;

public class AssessmentPrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 13;
		int count = 0;
		
		for (int i = 1; i<=n; i++) {
			
			if (n%i==0) {
			
				count++;
				}
		}
			if (count==2) {
				System.out.println("Prime");
				
			}else {
				System.out.println("Not Prime");
			}
			
		}
	}


