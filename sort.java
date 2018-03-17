

public class sort  {
	public static void main(String[]args) {
       Scanner scan=new Scanner(System.in);
       System.out.println("enter array size:");
       int num=scan.nextInt(); 
       int [] arr= new int[num];
       System.out.println("enter array elements:");
       for(int i=0;i<num;i++) {
    	   arr[i]=scan.nextInt();
       }
       for(int i=0;i<num;i++) {
    	   for(int j=0;j<num;j++) {
    	  if(arr[i]<arr[j]) {
    		  int temp=arr[i];
    		  arr[i]=arr[j];
    		  arr[j]=temp;
    	  }
    	  }
       }    
       System.out.println("enter the sorted array:");
       for(int i=0;i<num;i++) {
           System.out.println(arr[i]);
    	   
       }
       scan.close();
     }
        	   }
    	   
       
  
	
