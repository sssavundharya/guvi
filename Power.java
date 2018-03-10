

public class Power {
   public static void main(String [] args) {
	   Scanner scan = new Scanner(System.in);
	   System.out.println(" enter n1:");
	   int n1= scan.nextInt();
	   System.out.println("enter n2:");
	   int n2=scan.nextInt();
	   // Object math;
		int result=(int) Math.pow(n1,n2);
		   System.out.println(result);
		   scan.close();
   }
}
