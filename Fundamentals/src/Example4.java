import java.util.Scanner;

public class Example4 {

		public static void main(String[] args) {
			int n;
			Scanner sc = new Scanner(System.in);
			System.out.println("enter number :");
			n=sc.nextInt();
			if(n>0) {
				System.out.println("POSITIVE");
			}
			else if(n<0) {
				System.out.println("NEGATIVE");
			}
			else {
				System.out.println("zero");
			}
		}
}

