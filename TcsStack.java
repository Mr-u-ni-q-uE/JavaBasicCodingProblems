package Strings;

import java.util.*;
import java.util.Map.Entry;

class TcsStack {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int m = s.nextInt();
		int ar[] = new int[n];
		for (int i = 0; i < n; i++) {
			ar[i] = s.nextInt();
		}
		HashMap<Integer, Integer> h = new HashMap<>();
		for (int j : ar) {
			if (h.containsKey(j)) {
				int q = h.get(j) + 1;
				h.put(j, q);
			} else {
				h.put(j, 1);
			}
		}
		for (Entry<Integer, Integer> t : h.entrySet()) {
		}
	}

}