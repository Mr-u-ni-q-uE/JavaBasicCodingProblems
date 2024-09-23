package Accenture;

import java.util.Scanner;

public class PalindromePartitoing {
	public static boolean isPal(String s) {
		StringBuffer sb=new StringBuffer(s);
		sb.reverse();
		return s.equals(sb.toString());
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		int i=0,j=s.length(),cuts=0;
		while(i<j) {
			if(isPal(s.substring(i, j))) {
				cuts++;
				i=j;
				j=s.length();
			}else {
				j--;
			}
		}
		System.out.println(cuts-1);
		
	}
}
