package Guvi;

import java.util.Arrays;
import java.util.Scanner;

public class RepeatedElementArray {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++){
			a[i]=scan.nextInt();
		}
		Arrays.sort(a);
		int count=0,c=5;
		for(int i=0;i<n;i++){
			count=0;
			for(int j=i+1;j<n;j++){
				if(a[i]==a[j]){
					count=1;
					c--;
					break;
				}
			}
			if(count==1)System.out.print(a[i]+" ");
		} 
		if(c==n)System.out.println("Unique");
	}

}
