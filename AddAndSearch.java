package Guvi;

import java.util.Arrays;
import java.util.Scanner;

public class AddAndSearch {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int x=scan.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++){
			a[i]=scan.nextInt();
		}
		Arrays.sort(a);
		int sum=0, count=0;
		s:
		for(int i=0;i<n;i++){
			for(int j=i+1;j<n;j++){
				if(a[i]+a[j]==x){
					count=1;
					System.out.print("YES");
					break s;
				}
			}
		}
		if(count==0)System.out.println("NO");
	}

}
