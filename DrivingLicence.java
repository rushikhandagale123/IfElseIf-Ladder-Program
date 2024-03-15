import java.util.Scanner;
class DrivingLicence
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the age");
		int age =sc.nextInt();
		if(age<18){
			System.out.println("you are not mature for driving licence ! try after :" +(18-age) +"year");
			}
		else{
			System.out.println("enter your test marks");
			Double marks=sc.nextDouble();
			if(marks>60)
			{
				System.out.println("now u are able to get driving licence ");

			} 
			else{
				System.out.println("try again /give test again");
			}
		}
		
	}
}