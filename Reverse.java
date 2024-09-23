package Strings;

import java.util.Arrays;
import java.util.Scanner;

public class Reverse {
	static String rev(String a) {
		StringBuffer sb=new StringBuffer();
		sb.append(a);
		sb.reverse();
		return sb.toString();
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String b=sc.nextLine();
		String a[]=b.split(" ");
		String c[]=new String[a.length];
		for(int i=0;i<=a.length-1;i++) {
			c[i]=rev(a[i]);
		}
		System.out.println(Arrays.toString(c));
		
	}
}