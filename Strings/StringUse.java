package Strings;

import java.util.Scanner;

public class StringUse {

	public static boolean isPal(String input) {
		int i = 0;
		int j = input.length() - 1;
		while (i < j) {
			if (input.charAt(i) != input.charAt(j)) {
				return false;
			}
			i = i + 1;
			j = j - 1;
		}
		return true;
	}
	
	public static String input() {
		System.out.println('\n' + 0);
		Scanner s = new Scanner(System.in);
		s.useDelimiter(",");
		String str = s.next();
		System.out.println(str);
		str = s.next();
		System.out.println(str);
		str = s.next();
		System.out.println(str);
		return str;
	}
	
	public static void main(String[] args) {
		
		String s6 = input();
		
		
		int a[] = new int[2];
		a[0] = 10;
		a[1] = 11;
		
		int b[] = new int[2];
		b[0] = 10;
		b[1] = 11;
		
		if (a == b) {
			System.out.println("Same");
		} else {
			System.out.println("Different");
		}
		
		String s4 = "abc";
		String s5 = new String("abc");
		
		
		if (s4.equals(s5)) { // checks if same string instead of content (s4 == s5) 
			System.out.println("Same");
		} else {
			System.out.println("Different");
		}
		
		
		int i = "abcderfcdef".lastIndexOf("cddfe");
		
		String s3 = "abc";
		s3 = "def";
		
		System.out.println(i);
		
		String str = "abbbcdd";
		String s2 = str.concat("sdds");
		System.out.println(str);
		System.out.println(s2);
		
		System.out.println(str);
		System.out.println(str.length());
		//System.out.println(str.charAt(7));
		 i = 0;
		while (i < str.length()) {
			System.out.println(str.charAt(i));
			i = i + 1;
		}
		
		System.out.println('1' + '2');
		
		String s = '1' + str.substring(1);
		
		System.out.println(str.substring(3));
		System.out.println(str.substring(2, 5));
		
//		int a[] = new int[10];
//		System.out.println(a[0]);
//		a[0] = 10;
//		System.out.println(a);
//		
//		char str[] = new char[10];
//		str[0] = 'a';
//		str[1] = 'a';
//		str[2] = 'b';
//		str[3] = 'b';
//		str[5] = 'b';
//		str[6] = 'b';
//		
//		System.out.println(str);
	}

}
