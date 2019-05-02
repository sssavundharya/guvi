import java.util.*;
public class MyClass {
    public static void main(String args[]) {
        Scanner scan=new Scanner(System.in);
        String str=scan.next();
        char[]a=str.toCharArray();
        for(int i=a.length-1;i>=0;i--){
            if(a[i]=='a'||a[i]=='e'||a[i]=='i'||a[i]=='o'||a[i]=='u'||a[i]=='A'||a[i]=='E'||a[i]=='I'||a[i]=='O'||a[i]=='U'){}
            else System.out.print(a[i]);
        }
    }
}
