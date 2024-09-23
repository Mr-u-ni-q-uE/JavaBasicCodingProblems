package Accenture;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;


public class decimalToBinary {
	public static List<Integer> toBinary(int n, List<Integer> l) {
		if (n == 0)
			return l;
		else {
			l.add(n%2);
			return toBinary(n/2,l);
		}

	}
	public static Stack<Integer> toBinary(int n, Stack<Integer> l) {
		if (n == 0)
			return l;
		else {
			l.push(n%2);
			return toBinary(n/2,l);
		}

	}
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
//		List<Integer> l = new LinkedList<>();
//		l=toBinary(n,l);
		Stack<Integer> s=new Stack<>();
		s=toBinary(n,s);
		//System.out.println(l.size());
		while(!s.isEmpty()) {
			System.out.print(s.pop());
		}
//		for(int i=l.size()-1;i>=0;i--) {
//			System.out.print(l.get(i));
//		}
	}
}
