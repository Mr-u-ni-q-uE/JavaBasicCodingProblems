package AccentureCodes;

import java.util.Scanner;

public class StartEndPal {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		int i = 0, j = s.length();
		if(isPal(s)) System.out.println(s+" "+"0");
		else {
		while (i < j) {
			if (isPal(s.substring(i, j))) {
				System.out.println(s.substring(i, j));
				break;
			} else {
				j--;
			}
		}
		i=0;j=s.length();
		while (i < j) {
			if (isPal(s.substring(i, j))) {
				System.out.println(s.substring(i, j));
				break;
			} else {
				i++;
			}
		}
		}

	}

	private static boolean isPal(String s) {
		StringBuffer sb = new StringBuffer(s);
		return s.equals(sb.reverse().toString());

	}
}
//package AccentureCodes;
//import java.util.*;
//public class StartEndPal {
//	public static boolean isPal(String a) {
//		System.out.println(a);
//		StringBuffer c=new StringBuffer(a);
//		c.reverse();
//		System.out.println(c.toString());
//		if(a.equals(c.toString())) {
//			return true;
//		}
//		else return false;
//	}
//	
//	public static void main(String[] args) {
//		Scanner s=new Scanner(System.in);
//		String a=s.next();
//		//char b[]=a.toCharArray();
//		int i=0;int j=a.length();
//		while(i<j) {
//			if(isPal(a.substring(i,j))) {
//				System.out.print(a.substring(i,j));
//				i=j;
//				j=a.length();
//			
//			}
//			else j--;
//			
//		}
//		
//	}
//
//}