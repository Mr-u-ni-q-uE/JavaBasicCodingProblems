package AccentureCodes;

import java.util.Scanner;

public class Code5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		int max = 0, p = 0, q = 0, r = 0;
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				int x = arr[i] + arr[j];
				if (x == 18) {
					p = arr[i] * arr[j];
					if (p > max) {
						max = p;
						q = i;
						r = j;
					}
				}
			}
		}
		if (arr[q] > arr[r]) {
			System.out.println(arr[q] + " " + arr[r]);
		} else {
			System.out.println(arr[r] + " " + arr[q]);
		}
	}
}
