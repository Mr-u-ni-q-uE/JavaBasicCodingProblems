package Strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class TcsString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] a = sc.next().toCharArray();
		char[] b = sc.next().toCharArray();
		int i = 0, j = 0;
		StringBuilder sb = new StringBuilder();
		List<Integer> li = new ArrayList<>();
		if (a.length != b.length)
			System.out.println(-1);
		;
		while (i < a.length && j < b.length) {
			if (a[i] != b[j]) {
				li.add(i);
				sb.append(a[i]);
				i++;
				j++;
			}
		}
		if (li.size() == a.length)
			System.out.println(-1);
		else {
			char[] x = sb.toString().toCharArray();
			Arrays.sort(x);
			for (int i1 = 0; i1 < li.size(); i1++) {
				a[li.get(i1)] = x[0];
			}
			System.out.println(Arrays.toString(a));
		}
	}
}
