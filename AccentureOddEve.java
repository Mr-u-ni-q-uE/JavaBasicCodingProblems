package Strings;

import java.util.Scanner;

public class AccentureOddEve {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int eve=0,odd=0;
		while(n>0) {
			int x=n%10;
			if(x%2==0) eve=eve+x;
			else odd=odd+x;
			n=n/10;
		}
		System.out.println(Math.max(eve, odd));
	}
}





//Scanner sc=new Scanner(System.in);
//String s=String.valueOf(sc.nextInt());
//String[] arr=s.split("");
//int eve=0,odd=0; 
//for(String x:arr) {
//	int xint=Integer.parseInt(x);
//	if(xint%2==0) eve=eve+xint;
//	else odd=odd+xint;
//}
//System.out.println(Math.max(eve, odd));	