package Strings;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;

public class AccentureString {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		char ch=sc.next().charAt(0);
		//System.out.println(ch);
		char arr[]=s.toCharArray();
		HashMap<Character,Integer> hm=new HashMap<>();
		for(char c:arr) {
			hm.put(c, hm.getOrDefault(c, 0)+1);
		}
		int max=0;
		char maxChar=0;
		for(Entry<Character, Integer> set:hm.entrySet()) {
			if(set.getValue()>max) {
				max=set.getValue();
				maxChar=set.getKey();
			}
		}
		//System.out.println(max);
		
		//System.out.println(maxChar);
		StringBuffer sb=new StringBuffer();
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==maxChar) {
				sb.append(ch);
			}
			else {
				sb.append(arr[i]);
			}
		}
		System.out.println(sb.toString());
	}
}
