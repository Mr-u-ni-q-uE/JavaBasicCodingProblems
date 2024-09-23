package Strings;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		char[] s1=(sc.nextLine()).toCharArray();
		char[] s2=sc.nextLine().toCharArray();
		Arrays.sort(s1);
		Arrays.sort(s2);
		if(Arrays.toString(s1).equals(Arrays.toString(s2))) {
			System.out.println("Anagram");
		}else {
			System.out.println("Not Anagram");
		}
		
	}
}
