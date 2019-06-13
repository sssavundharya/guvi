package Guvi;

import java.util.Scanner;

public class RowColZero {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int m=scan.nextInt();
		int a[][]=new int[n][m];
		int t1=-1,t2=-1;
		for(int i=0;i<n;i++){
			for(int j=0;j<m;j++){
				a[i][j]=scan.nextInt();
				
			}
		}
		for(int i=0;i<n;i++){
			for(int k=0;k<m;k++){
				if(a[i][k]==0){
					t1=i;
					t2=k;
					break;
				}
			}
			for(int j=0;j<m;j++){
				if(t1==i || t2==j){
					System.out.print("0"+" ");
				}
				else System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		
				
	}

}
