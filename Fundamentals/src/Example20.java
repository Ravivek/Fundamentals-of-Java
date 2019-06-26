import java.util.Scanner;

public class Example20 {
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
		System.out.println("the reverse of "+k+" is :"+rev);
		}

}
