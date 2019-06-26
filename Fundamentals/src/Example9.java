
public class Example9 {

	public static void main(String[] args){
		String str =args[0];
		String str2="male";
		String str3="female";
		int age=Integer.parseInt(args[1]);
		System.out.println(" ");
		
		if(str.equals(str2)){
			if(age >=1 && age <=58){
				System.out.println("8.4% ");
			}
			if(age >=59 && age <=100){
				System.out.println("10.5%");
			}
		}
		else{
			if(str.equals(str3)){
				if(age >=1 && age <=58){
					System.out.println("8.2% ");
				}
				if(age >=59 && age <=100){
					System.out.println("9.2%");
				}
			}
		}
	}
}

