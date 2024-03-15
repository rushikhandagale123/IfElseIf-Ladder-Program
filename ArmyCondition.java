import java.util.Scanner;
class ArmyCondition
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a age");
		int age=sc.nextInt();
		System.out.println("eneter a height");
		double height = sc.nextDouble();
		System.out.println("enter a weight");
		double weight =sc.nextDouble();

		if(age>=18 && height>=162 && weight>=56)
		{
			System.out.println("the person is able to join army");

		}else{
			System.out.println("the person is not able to join army");
		}
	
		}

	}
