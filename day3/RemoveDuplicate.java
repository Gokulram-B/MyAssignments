package week1.day3;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicate {
	public static void main(String[] args) {
		String name="We learn java basics as part of java sessions in java week1";
		String result=removeDuplicateWords(name);
		System.out.println(result);
	}

	public static String removeDuplicateWords(String str) {
		// TODO Auto-generated method stub
		String[] words=str.split("\\s+");
		Set <String> wordSet= new LinkedHashSet<>(Arrays.asList(words));
	     return String.join(" ", wordSet);
	}

}
