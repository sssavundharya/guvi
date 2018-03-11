

public class ArmstrongNum {
	public static void main(String [] args) {
		int  a,count=0;
		double sum=0;
		Scanner scan=new Scanner(System.in);
		System.out.println("enter:");
		int n=scan.nextInt();
      //  a=n;

         scan.close();
         while(n>0) {
        	 count=count+1;
        	 n=n/10;
        	 }
 		System.out.println(count);

        a=n;
     int temp=n;
         while(a>0) {
        	  int rem=a%10;
        	 sum=(sum*10)+Math.pow(rem,count);
        	a=a/10;
         }
 		System.out.println(sum);

         if(temp==sum) {
     		System.out.println("yes");
        	  }
         else {
     		System.out.println("no");

         }
        scan.close(); 
       
       
	}

}
