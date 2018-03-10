

public class EvenInterval {
	public static void main(String [] args) {
		Scanner scan = new Scanner(System.in);
    System.out.println("enter the first interval:");
        int num1=scan.nextInt();
    System.out.println("enter the second interval:");
       int num2=scan.nextInt();  
       while(num1<=num2) {
    	   if(num1%2==0) {
			   System.out.println(num1);
    	   }
    	   num1=num1+1;
    	}
        scan.close();
       }
    }
