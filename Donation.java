import java.util.Scanner;
class Donation
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your age");
		int age =sc.nextInt();
		if(age<20){
			System.out.println("you are a kid ,try after :" +(20-age) +"year");
		}
		else{
			System.out.println("have u consumed a cigar or alcohol (yes/no):");
			String nasha =sc.next().toLowerCase();
			if(nasha.equals("no")){
				System.out.println("eneter your weight");
				double weight = sc.nextDouble();
				if(weight>=50){
					System.out.println("we can pump your blood");
				}
				else{
					System.out.println(" eat some food and gain weight");
				}
			}
			else{
				System.out.println("you cannot donate blood because you are in nasha");
		}	}
}
}