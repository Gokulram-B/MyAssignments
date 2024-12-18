package week1.day1;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   String num="malayalam";
   String num1 = "";
   int strLength=num.length();
   for (int i =(strLength-1); i>=0; --i) {
	num1=num1+num.charAt(i);
}
   if(num.equals(num1)) {
	   System.out.println("Palindrome:"+num);
   }
   else {
	   System.out.println("Not a Palindrome:"+num);
   }
	}

}
