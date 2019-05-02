import java.util.*;
public class MyClass {
    public static void main(String args[]) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int res=0;
        while(n>0){
            int r=n%10;
            res+=(r*r);
            n=n/10;
        }
        System.out.println(res);
    }
}
