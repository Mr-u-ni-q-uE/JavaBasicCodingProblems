package AccentureCodes;

import java.util.Scanner;

public class Code4 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		int so=0;
		int xe=0;
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
			if(i%2!=0) {
				so+=arr[i];
			}else {
				xe=xe^arr[i];
			}
		}
		System.out.println(so-xe);
	}
}
