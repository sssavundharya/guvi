package sample;

import java.util.Scanner;

public class largestElement {
	public static void main(String[]args) {
		int large=0;
       Scanner scan=new Scanner(System.in);
       
       System.out.println("enter array size:");
       int num=scan.nextInt(); 
       int [] arr= new int[num];
       System.out.println("enter array elements:");
       for(int i=0;i<num;i++) {
    	   arr[i]=scan.nextInt();
       }
       System.out.println("Largest elements:");
       for(int i=0;i<num;i++) {
    	  if(large<arr[i]) {
    		  large=arr[i];
    	  }
       }    
       System.out.println(large);
     }
        	   }
    	   
       
  
	
