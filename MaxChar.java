import java.util.*;
public class MyClass {
    public static void main(String args[]) {
        Scanner scan=new Scanner(System.in);
        String str=scan.next();
        char[]a=str.toCharArray();
        int count=0,max=0;
        String s="";
        for(int i=0;i<a.length;i++){
            count=0;
            for(int j=i+1;j<a.length;j++){
                if(a[i]==a[j])count++;
                
            }
            if(count>=max){
                max=count;
                s+=a[i];
            }
        }
        System.out.println(s);
    }
}
