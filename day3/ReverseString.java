package week1.day3;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name="TestLeaf";
		char[] array = name.toCharArray();
		for (int i = array.length-1; i >=0; i--) {
			System.out.print(array[i]);
			
		}
		String data="Select Class";
		String case1 = data.toLowerCase();
		System.out.println("\n"+"Lower Case="+case1);

	}
       
}
