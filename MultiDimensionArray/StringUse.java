package l6;
import java.util.Scanner;


public class StringUse {

	public static String reverseWords(String input) {
		String output = "";
		int currentWordStart = 0;
		int i = 0;
		while (i < input.length()) {
			if (input.charAt(i) == ' ') {
				for (int j = i - 1; j>= currentWordStart; j--) {
					output = output + input.charAt(j);
				}
				output = output + ' ';
				currentWordStart = i + 1;
			}
			i = i + 1;
		}
		for (int j = input.length() - 1; j>= currentWordStart; j--) {
			output = output + input.charAt(j);
		}
		return output;
	}
	
	public static void main(String[] args) {
		
		int a = 4 * 2 / 3;
		// l to r 2
		// r to l 0
		
		int b = 4 / 3 * 4;
		// l to r 4
		// r to l 0
		
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		System.out.println(reverseWords(str));
	}

}
