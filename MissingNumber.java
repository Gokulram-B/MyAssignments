package week1.day1;

import java.util.Arrays;

import io.cucumber.java.sl.In;

public class MissingNumber {

	public static void main(String[] args) {
    int a[]= {1,2,4,5,6};
    Arrays.sort(a);
  
    for (int i = 0; i <=a.length-1; i++) {
    	
			if(a[i]+1!=a[i+1]) {
    		System.out.println("Missing Number: "+(a[i]+1));
    		break;
    	}
    	}
		
	}
		
	}
	

