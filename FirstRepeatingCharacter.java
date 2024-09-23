package AccentureCodes;

import java.util.Scanner;

public class FirstRepeatingCharacter {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String sarr[]=s.split("");
		String res="";
		for(int i=0;i<sarr.length;i++) {
			if(res.contains(sarr[i])) {
				System.out.println(sarr[i]);
				break;
			}else {
				res+=sarr[i];
			}
		}
	}
}
