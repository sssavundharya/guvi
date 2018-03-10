

public class SumOfNatural {
		  public static void main(String [] args) {
			  int sum=0;
			 Scanner scan = new Scanner(System.in);
			   System.out.println("enter the number:");
			   int n=scan.nextInt();
			   int s=n*(n+1);
			   sum=s/2;
			   System.out.println(sum);
	          scan.close();

		  }
	}



