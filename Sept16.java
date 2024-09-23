package Accenture;

import java.util.Scanner;

public class Sept16 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int t=sc.nextInt();
		int ct=0;
//		int first=0,second=1,third=1,sum=1;
//		for(int i=2;i<n;i++) {
//			third=first+second;
//			first=second;
//			second=third;
//			System.out.println(third);
//			sum+=third;
//		}
//		System.out.println(sum);
		while(n>0) {
			if(!(n%10==t)) {
				ct++;
				n/=10;
			}else {
				n/=10;
			}
		}
		System.out.println(ct);
		
		
	}
}
