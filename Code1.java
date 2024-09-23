package AccentureCodes;

import java.util.Scanner;

public class Code1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String s = sc.next();
//		String[] sarr=s.split("");
		char a = sc.next().charAt(0);
		int count=0;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)==a) {
				count++;
			}
		}
		System.out.println(count);
	}
}
