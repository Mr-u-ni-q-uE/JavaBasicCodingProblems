package Accenture;
import java.util.Scanner;
public class Pivot {
	public static int sum(int start,int end,int[] arr) {
		int sum=0;
		for(int i=start;i<=end;i++) {
			sum+=arr[i];
			//System.out.println(sum);
		}
		return sum;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int rs=0,ls=0,flag=0;
		for(int i=1;i<n;i++) {
			ls=sum(0,i-1,arr);
			//System.out.println("leftsum "+ls);
			rs=sum(i+1,arr.length-1,arr);
			//System.out.println("rightsum "+rs);
			if(ls==rs) {
				flag=1;
				System.out.println(i);
			}
		}
		if(flag==0) {
			System.out.println(-1);
		}
	}
}
