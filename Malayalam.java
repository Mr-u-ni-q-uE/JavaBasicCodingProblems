package Strings;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;

public class Malayalam {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		char arr[]=s.toCharArray();
		HashMap<Character,Integer> hm=new HashMap<>();
		for(char c:arr) { 
			if(hm.containsKey(c)) {
				int v=hm.get(c)+1;
				hm.put(c,v);
			}else {
				hm.put(c, 1);
			}
		}
		for (Entry<Character, Integer> set :hm.entrySet()) {     //      .entrySet() --> hashmap method
			System.out.println(set.getKey()+" "+set.getValue()); //(key , value)
		}
	}
}




//malayalam
//hm      -->       m,a,l,y
//values  -->       2,4,2,1   
//m --> 1
//a --> 1
//l --> 1
//a --> 2
//y --> 1
//a --> 3
//l --> 2
//a --> 4
//m --> 2