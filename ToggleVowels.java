package Strings;

import java.util.*;

public class ToggleVowels {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String a = s.nextLine();
		/*
		 * char ar[]=a.toCharArray();//i go to i, , g ,o, StringBuilder sb=new
		 * StringBuilder(); for(char v:ar) { if(Character.isLetter(v)) { sb.append(v); }
		 * } String b=sb.toString();
		 */
		StringBuilder sb=new StringBuilder();
		char arr[] = a.toCharArray();
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 'a' || arr[i] == 'e' || arr[i] == 'i' || arr[i] == 'o' || arr[i] == 'u') {
				sb.append((char)(arr[i]-32));
				//System.out.print(arr[i]);
			}
			else if (arr[i] == 'A' || arr[i] == 'E' || arr[i] == 'I' || arr[i] == 'O' || arr[i] == 'U') {
				sb.append((char)(arr[i]+32));
			}else {
				sb.append(arr[i]);
			}
			
			

		}
		System.out.print(sb.toString());

	}

}