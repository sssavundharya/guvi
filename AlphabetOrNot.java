

public class AlphabetOrNot {
	public static void main(String [] args) {
		Scanner scan= new Scanner(System.in);
		System.out.println("enter:");
     	char ch=scan.next().charAt(0);
		if((ch>='a' && ch<='z')||(ch>='a' && ch<='z')) {
			System.out.println("alphabet");	
		}
		else {
		System.out.println("not alphabet");
      scan.close();
	}}

}
