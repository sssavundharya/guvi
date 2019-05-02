import java.util.*;
public class MyClass {
    public static void main(String args[]) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int k=scan.nextInt();
        int m,max=0;
        if(n>k)m=k;
        else m=n;
        for(int i=1;i<=m;i++){
            if(n%i==0 && k%i==0){
                if(max<i)max=i;
            }
        }
        System.out.println(max);
    }
}
