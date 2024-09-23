package AccentureCodes;

import java.util.Arrays;
import java.util.Scanner;

public class OddEven {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		String res[] = new String[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
			if (arr[i] % 2 == 0)
				res[i] = "Even";
			else
				res[i] = "Odd";
		}
		System.out.println(Arrays.toString(res));
	}
}
//[odd,eve,odd,eve,odd,eve]