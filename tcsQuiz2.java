package Strings;

import java.util.Arrays;
import java.util.Scanner;

public class tcsQuiz2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int k=sc.nextInt();
		Arrays.sort(arr);
		for(int i=n-1;i>n-1-k;i--) {
			System.out.print(arr[i]+" ");
		}
	}
}
