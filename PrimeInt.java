

public class PrimeInt {
	public static void main(String [] args) {
		int count=0;
		Scanner scan=new Scanner(System.in);
		System.out.println("enter n1");
		int n1=scan.nextInt();
		System.out.println("enter n2");
		int n2=scan.nextInt();
		for(int i=n1;i<=n2;i++) {
			for(int j=2;j<i;j++) {
			if(i%j==0) {
				count=0;
				break;
			}
			else {
				count=1;
			}
		}
		if(count==1) {
		System.out.println(i);
	}
		scan.close();
}}}
