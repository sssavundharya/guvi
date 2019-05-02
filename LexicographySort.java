import java.util.*;
public class MyClass {
    public static void main(String args[]) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        String a[]=new String[n];
        for(int i=0;i<a.length;i++){
            a[i]=scan.next();
        }
        for(int i=0;i<a.length;i++){
            for(int j=i;j<a.length;j++){
                if(a[i].length()>a[j].length()){
                   String temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        for(String i:a){
            System.out.println(i);
        }
    }
}
