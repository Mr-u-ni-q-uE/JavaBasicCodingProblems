package AccentureCodes;

import java.util.Scanner;

public class ReboundHeight {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int h=sc.nextInt();
		int iv=sc.nextInt();
		int fv=sc.nextInt();
		System.out.println((int)(h*Math.pow(iv/fv,2)));
	}
}
