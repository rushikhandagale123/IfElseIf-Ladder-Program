import java.util.Scanner;
class Election
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your age");
		int age = sc.nextInt();
		if(age>18){
			System.out.println("do you have voter id (yes/no)");
			String voterId=sc.next().toLowerCase();
			if(voterId.equals("yes"))
			{
			System.out.println("*****WELCOME******");
			System.out.println("1.BJP");
			System.out.println("2.Congress");
			System.out.println("3.AAP");
			System.out.println("4.MNS");
			System.out.println("5.shivsena");
			System.out.println("6.ncp");
			System.out.println("7.nota");
			System.out.println("enter the option to vote your fav party:");
			String vote =sc.next().toUpperCase();
			if(vote.equals("BJP"))
			{
				System.out.println("You are voted for BJP");
			}
			else if(vote.equals("CONGRESS"))
			{
				System.out.println("You are vote for congress");
			}
			 else if (vote.equals("AAP")){
				System.out.println("you are vote for aap");
			}
			else if(vote.equals("MNS")){
				System.out.println("you are vote for mnc");
			}
			else if(vote.equals("SHIVSENA")){
				System.out.println("you are vote for mnc");
			}
			else if(vote.equals("NCP"))
			{
				System.out.println("you are vote for mnc");
			}
			else if(vote.equals("NOTA")){
				System.out.println("no one bhikarchot is able for my vote ");
			}
			else{
				System.out.println("invalid input");
			}}
			else{
				System.out.println("jaldi vaha se hato");
			}}
		else{
			System.out.println("your not mature try after :" +(18-age) +" year");
		}
	}
	}
	
