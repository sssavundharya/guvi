package sample;

import java.util.Scanner;

public class Fib {
	 public static void main(String args[]){ 
		   int a=0,b=1,c=1;
		   Scanner Scan=new Scanner(System.in);
		  System.out.println("enter the number:");
		  int num=Scan.nextInt();
		  for(int i=0;i<num;i++) {
			  a=b;
			  b=c;
			  c=a+b;
			 System.out.println(a+"");
			  
        Scan.close();


		  
	 }

	 }}
