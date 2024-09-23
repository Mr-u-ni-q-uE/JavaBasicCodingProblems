package Accenture;

import java.util.Scanner;

public class SumofPrimeFactores {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int i=n;
		int sum=0;
		while(i>0&&n>0) {
			if(isPrime(i)) {
				if(n%i==0) {
				while(n%i==0) {
					sum+=i;
					n=n/i;
				}
				}
			}
			else {
				i--;
			}
		}
	}

	private static boolean isPrime(int i) {
		if(i<=1) return false;
		for(int j=2;j<i;j++) {
			if(i%j==0) {
				return false;
			}
		}
		return true;
	}
}
