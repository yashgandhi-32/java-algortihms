package l7;

import java.util.Scanner;

public class SqRoot {

	public static double sqroot(int n, int d) {
		double i = 0;
		double increment = 1;
		int currentDecimal = 0;
		while (currentDecimal <= d) {
			while (i * i <= n) {
				i = i + increment;
			}
			i = i - increment;
			increment = increment/10;
			currentDecimal++;
		}
		return i;
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int d = s.nextInt();
		double output = sqroot(n, d);
		System.out.println(output);
		int k  = 1;
		if (n == 2) {
			System.out.println(k);
			// int k = 12; not allowed
			k = 100;
		} else {
			k = 102;
		}
		System.out.println(k);
		
	}

}
