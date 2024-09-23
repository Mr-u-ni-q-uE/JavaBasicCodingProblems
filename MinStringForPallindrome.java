package Accenture;

import java.util.Scanner;

public class MinStringForPallindrome {
	public static boolean isPal(String s) {
		StringBuffer sb=new StringBuffer(s);
		sb.reverse();
		return s.equals(sb.toString());
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		StringBuilder sb=new StringBuilder();
		String s=sc.nextLine();
		int i=0,j=s.length();
		while(i<j) {
			if(isPal(s.substring(i,j))) {
				sb.append(s.substring(0,i));
				break;
			}else {
				i++;
			}
		}
		String res=sb.reverse().toString();
		System.out.println(res);
	}
}
