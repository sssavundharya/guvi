

public class FactorsEven {
	public static void main(String [] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter num:");
		int num=scan.nextInt();
		for(int i=1;i<=num;i++) {
			if(num%i==0 && i%2==0) {
				System.out.println(i);
			}
		}
		scan.close();
	}
}
