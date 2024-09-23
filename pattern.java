package Accenture;

import java.util.Scanner;

public class pattern {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		char fnc=s.charAt(0);
		StringBuilder sb=new StringBuilder();
		sb.append(fnc);
		for(int i=1;i<s.length();i++) {
			if(s.charAt(i)==fnc) {
				sb.append('*');
				fnc=s.charAt(++i);
				sb.append(fnc);
			}else {
				sb.append(fnc);
			}
		}
		System.out.println(sb.toString());
	}
}








//public static void main(String[] args) {
//Scanner sc=new Scanner(System.in);
//int n=sc.nextInt();
//int k=2*n;
//for(int i=0;i<n;i++) {
//	for(int j=1;j<k-2*i;j++) {
//		System.out.print(j+" ");
//	}
//	System.out.println();
//}
//}