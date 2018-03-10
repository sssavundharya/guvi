

public class Fact {
	 public static void main(String args[]){  
	   Scanner Scan=new Scanner(System.in);
	  System.out.println("enter the number");
	  int num=Scan.nextInt();
	  int fact=1,i;
	  for(i=0;i<num;i++) {
		  fact=fact+fact*i;
		  
	  }
	  System.out.println(fact);
	  Scan.close();
	 }

}
