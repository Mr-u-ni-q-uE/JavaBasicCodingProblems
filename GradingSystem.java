package Accenture;

import java.util.Scanner;

public class GradingSystem {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		if(n>=30&&n<=50) System.out.println("Average");
		else if(n>=51&&n<=60) System.out.println("Good");
		else if(n>=61&&n<=80) System.out.println("Excellent");
		else if(n>=81&&n<=100) System.out.println("Outstanding");
		
	}
}
