

public class VowelorNot {
	public static void main(String [] args) {
		char ch;
		Scanner scan=new Scanner(System.in);
		 System.out.println("enter the character:");
		  ch=scan.next().charAt(0);
		 if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
			 System.out.println("yes");
      }
		 else {
			 System.out.println("no");
      }
		 scan.close();
		 
	}

}
