import java.util.*;
public class MyClass {
    public static void main(String args[]) {
        Scanner scan=new Scanner(System.in);
        String s=scan.next();
        int count=0;
        char []a=s.toCharArray();
        for(int i=0;i<s.length();i++){
            if(a[i]<'0' || a[i]>'9'){
                System.out.println("no");
                count=1;
                break;
            }
        }
        if(count==0)System.out.println("yes");
    }
}
