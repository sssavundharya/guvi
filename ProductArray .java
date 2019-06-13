package Guvi;

import java.util.Scanner;

public class ProductArray {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++){
			a[i]=scan.nextInt();
		}
		int sum=1;
		for(int i=0;i<n;i++){
			sum=1;
			for(int j=0;j<n;j++){
				if(i!=j){
					sum*=a[j];
				}
			}
			System.out.print(sum+" ");
		}
	}

}
