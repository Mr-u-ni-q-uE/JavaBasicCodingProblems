package Accenture;

import java.util.Scanner;

public class PrintDigits {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		char[] s=sc.next().toCharArray();
		int count=0;
		for(char c:s) {
			if(Character.isDigit(c)) count++;
		}
		System.out.println(count);
	}
}
