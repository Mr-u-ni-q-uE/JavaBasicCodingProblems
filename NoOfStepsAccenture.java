package Strings;

import java.util.Scanner;

public class NoOfStepsAccenture {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();
		while (tc > 0) {
			int total = sc.nextInt();
			int steps = sc.nextInt();
			int count = total / steps + total % steps;
			System.out.println(count);
			tc--;

		}
	}
}
