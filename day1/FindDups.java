package week1.day1;

public class FindDups {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] art= {2,5,7,7,5,9,2,3};
		int arraylength=art.length;
		System.out.println(art.length);
		
		for (int i = 0; i < art.length; i++) {
			for (int j = i+1; j < art.length; j++) {
				if(art[i]==art[j]) {
					System.out.println("Duplicate Values: "+art[j]);
					
				}
				
			}
			
		}

	}

}

