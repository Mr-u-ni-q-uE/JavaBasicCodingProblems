package Accenture;

import java.util.Scanner;

public class LargeSmallSumProblem {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		int res = LargeSmallSum(arr);
		System.out.println(res);
	}

	private static int LargeSmallSum(int[] arr) {// 133432
		int el = 0, esl = 0;
		int ol = 0, osl = 0;
		for (int i = 0; i < arr.length; i++) {
			if (i % 2 == 0) {// 133
				System.out.println("Traversed eve element is " + arr[i]);
				if (arr[i] > el) {
					System.out.println("Updated eve largest " + arr[i]);
					System.out.println("Updated eve second largest " + arr[i]);
					esl = el;
					el = arr[i];
				}
				else if(arr[i]>esl && arr[i]<el) {
					esl=arr[i];
				}

			} else {// 342
				System.out.println("Traversed odd element is " + arr[i]);
				if (arr[i] > ol) {
					System.out.println("Updated odd largest " + arr[i]);
					System.out.println("Updated odd second largest " + arr[i]);
					osl = ol;
					ol = arr[i];
				}
				else if(arr[i]>osl && arr[i]<ol) {
					osl=arr[i];
				}

			}
		}
		return osl + esl;
	}
}
