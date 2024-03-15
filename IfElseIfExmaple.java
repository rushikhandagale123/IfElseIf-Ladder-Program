import java.util.Scanner;
class IfElseExample
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the marks");
		Double marks=sc.nextDouble();
		if(marks>90)
		{
       System.out.println("fisrt class with distinction");
		}
		else if (marks>75){
			System.out.println(" with distinction");
		}
		else if(marks>60){
			System.out.println("fisrt class");
		}
		else if(marks>35)
		{
			System.out.println("second class");
		}
		else{
			System.out.println("congratulation you are fail");
		}

	}
}