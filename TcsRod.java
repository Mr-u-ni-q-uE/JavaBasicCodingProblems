package Strings;

import java.util.Scanner;

public class TcsRod {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int start=1;
		int end=n-start;
		int profit=0;
		while(start<end) {
			profit=Math.max(arr[start]+arr[end], profit);
		}
		System.out.println(profit);
	}
}
