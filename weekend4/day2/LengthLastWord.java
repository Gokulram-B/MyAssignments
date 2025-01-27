package weekend4.day2;

public class LengthLastWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//String s= "Hello World";
		//String s = "fly me to the moon";
		String s ="luffy is still joyboy";
				
		String[] words = s.split(" ");
		int length = words[words.length-1].length();
		System.out.println(length);

	}

}
