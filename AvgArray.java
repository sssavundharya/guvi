

public class AvgArray  {
	public static void main(String[]args) {
		int sum=0,i;
       Scanner scan=new Scanner(System.in);
       System.out.println("enter array size:");
       int num=scan.nextInt(); 
       int [] arr= new int[num];
       System.out.println("enter array elements:");
       for(i=0;i<num;i++) {
    	   arr[i]=scan.nextInt();
       }
       for(i=0;i<num;i++) {
    	   for(int j=0;j<num;j++) {
    	  if(arr[i]>arr[j]) {
    		  int temp=arr[i];
    		  arr[i]=arr[j];
    		  arr[j]=temp;
    	  }
    	  }
       }    
    	   
              int k=i/2;
       System.out.println(arr[k]);

     
       
      
       
       scan.close();
     }
         }
    	   
       
  
	
