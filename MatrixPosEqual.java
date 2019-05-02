import java.util.*;
public class MyClass {
    public static void main(String args[]) {
        Scanner scan=new Scanner(System.in);
        int a[][]=new int[3][2];
        for(int i=0;i<3;i++){
            for(int j=0;j<2;j++){
                a[i][j]=scan.nextInt();
            }
        }
        if(a[0][0]==a[1][0] && a[1][0]==a[2][0] ||a[0][1]==a[1][1] && a[1][1]==a[2][1]){
            System.out.println("Yes");
        }
        else System.out.println("No");
    }
}
