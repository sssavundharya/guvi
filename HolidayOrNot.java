import java.util.Scanner;

public class HolidayOrNot {
	public static void main(String [] args) {
		Scanner scan=new Scanner(System.in);
		String day=scan.next().toLowerCase();
		if(day.equals("saturday")||day.equals("sunday")) {
			System.out.println("yes");
		}
		else {
			System.out.println("no");
		}
		
		
		
	}

}
