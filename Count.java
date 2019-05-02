import java.util.*;
public class MyClass {
    public static void main(String args[]) {
        Scanner scan=new Scanner(System.in);
      int n=scan.nextInt();
      int a[]=new int[n];
      for(int i=0;i<n;i++){
          a[i]=scan.nextInt();

      }
      int m=a[0],count=0;
      for(int i=0;i<n;i++){
          if(a[i]!=m){
          count=1;
          break;
          }
      }
      Arrays.sort(a);
      if(count==1){
      for(int i=a.length-1;i>=0;i--){
          System.out.print(a[i]+" ");
      }
      }
      else  System.out.print(a[0]+" ");
    }
}
