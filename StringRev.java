import java.util.*;
public class MyClass {
    public static void main(String args[]) {
       Scanner sc=new Scanner(System.in);
       String s=sc.nextLine();
       for(String i:s.split(" ")){
           StringBuffer sb=new StringBuffer(i);
           String res=sb.reverse().toString();
           System.out.print(res+" ");
       }
    }
}
