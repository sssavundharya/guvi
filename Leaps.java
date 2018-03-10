

public class Leaps {
	public static void main(String [] args) {
		Scanner scan= new Scanner(System.in);
		System.out.println("enter the year:");
		int a=scan.nextInt();
       if((a%4==0)&&(a%100!=0)) {
    	   System.out.println(a+"is leapyear ");
    	   }
       else if(a%100==0) {
    	   System.out.println(a+"is not  leapyear ");
    	   
       }
       else if(a%400==0) {
    	   System.out.println(a+"is leapyear ");
       }
       else {
    	   System.out.println(a+"is not leapyear ");
       }
		scan.close();
	}

}
