
public class SearchOrNot {
	public static void main(String [] args) {
		Scanner scan = new Scanner(System.in);
		int n=scan.nextInt();
		int a[]=new int[n];
		int k=scan.nextInt();
		for(int i=0;i<n;i++) {
			a[i]=scan.nextInt();
		}
		int i;
		for( i=0;i<n;i++) {
			if(a[i]==k) {
				System.out.println("yes");
				break;
			}
			if(a[i]!=k) {
				System.out.println("no");
			}
			scan.close();
		}
	}

}
