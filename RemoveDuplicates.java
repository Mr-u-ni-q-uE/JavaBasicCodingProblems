package Strings;

import java.util.Arrays;
import java.util.Scanner;

public class RemoveDuplicates {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int narr[] = new int[n];
		for (int i = 0; i < n; i++) {
			narr[i] = sc.nextInt();
		}
		int i = 0;
		for (int j = i + 1; j < n; j++) {
			if (narr[i] != narr[j]) {
				narr[++i] = narr[j];
			}
		}
		for (int x = i + 1; x < n; x++) {
			narr[x] = 0;
		}
		System.out.println(Arrays.toString(narr));
	}
}
