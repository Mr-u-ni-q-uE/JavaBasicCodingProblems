package Strings;

import java.util.Scanner;

public class vowelcom {
	static int CommonVowels(String s1, String s2) {
		return 0;
		
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s1=sc.nextLine();
		String s2=sc.nextLine();
		s1=s1.toLowerCase();
		s2=s2.toLowerCase();
		System.out.println(s1+" "+s2);
		System.out.println(CommonVovels(s1,s2));
	}
}
