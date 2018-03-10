

public class Palindrome {
  public static void main(String [] args) {
	  int n,sum=0;
	  Scanner scan=new Scanner(System.in);
	  System.out.println("enter palindrome:");
	   n=scan.nextInt();
	  int tn=n;
	  while(tn>0) {
		//int rem=n%10;
		  sum=(sum*10)+(tn%10);
		   tn=tn/10;
		  }
	  if(sum==n) {
		  System.out.println("palindrome");

	  }
	  else {
		  System.out.println("not palindrome");

	  }
	  scan.close();
	  
	  
  }
}
