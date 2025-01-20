package weekend3.day1;

import java.util.Arrays;

public class FindDups {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] art= {2,5,7,7,5,9,2,3};
		int arraylength=art.length;
		System.out.println(art.length);
		
		Arrays.sort(art);
		
		for (int i = 0; i < art.length; i++) {
			
			System.out.println("Array Sort "+art[i]);
		}
	for (int j = 0; j < art.length-1; j++) {
		
			if(art[j]==art[j+1]) {
				System.out.println("Duplicate Value = "+art[j]);
			}
	}
	}
}
			
			
		

	


