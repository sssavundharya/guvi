

public class sqRoot {
	public static void main(String [] args) {
		Scanner scan=new Scanner(System.in);
       int num=scan.nextInt();
       int n=(int) Math.sqrt(num);
       if((n*n)==num) {
    	   System.out.println("yes");
       }
       else {
    	   System.out.println("no");
       }
		scan.close();
	}

}
