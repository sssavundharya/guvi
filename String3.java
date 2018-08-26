
public class String3 {
	public static void main(String [] args) {
		Scanner scan = new Scanner(System.in);
		String str=scan.next();
		for(int i=0;i<str.length();i=i+3) {
		   System.out.print(str.charAt(i));
		}
		scan.close();
	}
}
