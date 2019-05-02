import java.util.*;
public class MyClass {
    public static void main(String args[]) {
        Scanner scan=new Scanner(System.in);
      int n=scan.nextInt();
      int a[]=new int[n];
      ArrayList<Integer>b=new  ArrayList<Integer>();
      for(int i=0;i<n;i++){
          a[i]=scan.nextInt();
          if(i==a[i])b.add(a[i]);
          
      }
      Collections.sort(b);
      for(int i:b){
          System.out.print(i+" ");
      }
      
    }
}
