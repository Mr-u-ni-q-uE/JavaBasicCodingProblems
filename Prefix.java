package Strings;

import java.util.Arrays;
import java.util.Scanner;

public class Prefix {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String ip=sc.nextLine();
		String arr[]=ip.split(" ");
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<Math.min(arr[i].length(), arr[arr.length-1].length());i++) {
			if(arr[0].charAt(i)!=arr[arr.length-1].charAt(i)) {
				sb.append(arr[0].substring(0,i));
			}
		}
		System.out.println(sb.toString());
	}
}
