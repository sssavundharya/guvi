

public class Multiplies5Num {
	public static void main(String [] args) {
		int sum=0;
		Scanner scan =new Scanner(System.in);
		System.out.println("enter num:");

		int num=scan.nextInt();
		for(int i=0;i<5;i++) {
			 sum=sum+num;
				System.out.println(sum);
			
		}
		//System.out.println("result:"+sum);
		scan.close();
		
	}


}
