package Accenture;

import java.util.Scanner;

public class SumOfDevisors {
	public static int sumOfFactors(int n) {
		int s=0;
		for(int i=1;i<=n;i++) {
			if(n%i==0) {
				s+=i;
			}
		}
		return s;
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		float f1=(float)sumOfFactors(n1)/n1;
		float f2=(float)sumOfFactors(n2)/n2;
		if(f1==f2){
			System.out.println("Good pair");
		}else {
			System.out.println("Not a Good pair");
		}
		
	}
}
