package Strings;

import java.util.Arrays;
import java.util.Scanner;

public class ZigzagPattern {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int parr[]=new int[n];
		int narr[]=new int[n];
		int pc=0;
		int nc=0;
		for(int i=0;i<n;i++) {
			int x=sc.nextInt();
			if(x>0) {
				parr[pc++]=x;
			}
			else {
				narr[nc++]=-x;
			}
		}
		Arrays.sort(parr);
		Arrays.sort(narr);
		int x=0;
		if(parr[n-1]*parr[n-2]>narr[n-1]*narr[n-2]) {
			x=parr[n-1]+parr[n-2];
		}else {
			x=narr[n-1]+narr[n-2];
		}
		System.out.println(x);
	
	}
}