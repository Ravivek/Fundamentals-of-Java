import java.util.Scanner;

public class Example21 {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		long num,rev=0;
		System.out.println("enter number :");
		num=sc.nextLong();
		long k=num;
		while(num!=0) {
			rev=rev*10+(num%10);
			num=num/10;
		}
		if(k == rev){
         System.out.println("PALLINDROME");
		}
		else{
			System.out.println("NOT PALLINDROME");
		}
		}


}
