

import java.util.Scanner;

public class EvenOrOdd {
	public static void main(String [] args) {
	Scanner scan = new Scanner(System.in);
	 System.out.println("enter the number:");
	 int a= scan.nextInt();
	 if(a%2==0) {
		 System.out.println("even");
	 }
	 else {
		 System.out.println("odd");

	 }
	 scan.close();
 }


}
