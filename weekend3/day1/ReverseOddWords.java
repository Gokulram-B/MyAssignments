package weekend3.day1;

public class ReverseOddWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	    String name="I am a software tester";
	    String result=reverseOddWords(name);
	    System.out.println(result);
	    
		}

		public static String reverseOddWords(String str) {

			// TODO Auto-generated method stub
		    String[] words=str.split("\\s+");
		    for (int i = 0; i < words.length; i++) {
				if(i%2==0) {
					words[i] =new StringBuilder(words[i]).reverse().toString();
					
				}
			}
			return String.join(" ", words);

	}

}
