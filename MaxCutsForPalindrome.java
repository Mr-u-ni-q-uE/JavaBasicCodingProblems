package Accenture;

import java.util.Scanner;

public class MaxCutsForPalindrome {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		//System.out.println(s.substring(1,3));
		int i=0,j=s.length(),cuts=0;
		while(i<j) {

			if(isPal(s.substring(i, j))) {
				//System.out.println(s.substring(i, j));
				i=j;
				j=s.length();
				cuts++;
				//System.out.println(cuts);
			}
			else {
				j--;
			}
		}
		System.out.println(cuts-1);
		
	}

	private static boolean isPal(String s) {
		System.out.println(s);
		StringBuffer sb=new StringBuffer(s);
		sb.reverse();
		if(s.equals(sb.toString())) return true;
		else return false;
	}
}



//if(i==j&&i!=s.length()-1) {
//i=j;
//j=s.length()-1;
//cuts++;
//}
