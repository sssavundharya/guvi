import java.util.*;
public class MyClass {
    public static void main(String args[]) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=scan.nextInt();
        }
        int count=0;
        for(int i=0;i<n;i++){
            count=0;
            for(int j=0;j<n;j++){
                if(a[i]==a[j] && i!=j){
                    count=1;
                    break;
                }
            }
            if(count==0){
                System.out.println(a[i]);
            }
        }
    }
}
