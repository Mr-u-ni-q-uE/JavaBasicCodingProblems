package Accenture;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class SumOfLengthsOfSubarray {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();//[1,2,3]
		}
		List<List<Integer>> li=new ArrayList<>();
		List<Integer> li1=new LinkedList<>();//[[1],[2],[3],[1,2],[2,3],[1,2,3]]
		for(int i=0;i<n;i++) {
			for(int j=i;j<n;j++) {
				li1.add(arr[j]);
			}
			li.add(li1);
//			for(int x=0;x<li1.size();x++){
//			    System.out.println(li1.get(x));
//			} 
			li1.clear();
			//System.out.println(li1.size());
		}
		
		List<Integer> sum;
		for(int i=0;i<li.size();i++) {
			sum=li.get(i);
			for(int x=0;x<sum.size();x++){
			    System.out.print(sum.get(x));
			} 
			System.out.println();
			
		}
		//System.out.println(sum);
	}
}
