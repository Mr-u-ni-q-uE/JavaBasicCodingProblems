package Strings;

import java.util.Scanner;

public class Fiveletters {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		char[] c = s.toCharArray();
		int ind = 0;
		for (char ch : c) {
			if (Character.isLetter(ch)) {
				c[ind++] = ch;
			}
		}
		int i = 0;
		while (i < c.length) {
			if(i%5==0&&i!=0) System.out.println();
			System.out.print(c[i++]+" ");
			
		}
	}
}
