

public class Median {
	public static void main(String[]args) {
	       Scanner scan=new Scanner(System.in);
	       System.out.println("enter array size:");
	       int num=scan.nextInt(); 
	       int [] arr= new int[num];
	       System.out.println("enter array elements:");
	       for(int i=0;i<num;i++) {
	    	   arr[i]=scan.nextInt();
	       }
	      int  num1=num/2;
	       System.out.println("Median:"+arr[num1]);
	       scan.close();
      }
	       }

	       
	
