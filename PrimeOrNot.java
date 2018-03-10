

public class PrimeOrNot {
	public static void main(String [] args) {
		int count=0;
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the number:");
        int n=scan.nextInt();
        for(int i=2;i<n;i++) {
        	if(n%i==0) {
        		count=count+1;
        	}
        }
        if(count==0) {
          System.out.println("yes");
        }
        else {
            System.out.println(" no");
        	}
        scan.close();
		}
	}
