package weekend3.day1;

public class Uppercaseodd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	      String data="changeme";
	      String value = changeOddIndexToUpperCase(data);
	      System.out.println(value);
		}

		public static String changeOddIndexToUpperCase(String data) {
			// TODO Auto-generated method stub
			StringBuilder value=new StringBuilder(data);
			for (int i = 1; i < value.length(); i+=2) {
				value.setCharAt(i,Character.toUpperCase(value.charAt(i)));
			
			}
			return value.toString();

	}

}
