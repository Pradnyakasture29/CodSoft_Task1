import java.util.Random;
import java.util.Scanner;

public class GuessingGame 
{
	private static int wins;
	
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your name:");
		String user=sc.next();
		System.out.println("Hi"+user);
		int option;
		
		boolean running=true;
		wins=0;
		
		do
		{
			System.out.println("\nPlease enter your choice\n1.Start \n2.Quit");
			option=sc.nextInt();
			switch(option)
			{
			case 1:
			{
				game(sc, running);
				System.out.println("\nWould you like to play again?: \n1.yes \n2.no");
				String opt=sc.next();
				while(opt.equals("1"))
				{
					game(sc, running);
					System.out.println("\nWould you like to play again?:\n1.yes \n2.no");
				}
				System.out.println("Congratulations");
				running=false;
				break;
			}
			case 2:
			{
				System.out.println("Thank you,see you again");
				running=false;
				break;
			}
			default:
			{
				System.out.println("Wrong Input");
				break;
			}
			}
		}
		while(running);
		
	}
	private static void game(Scanner sc, boolean running)
	{
		Random r=new Random();
		int val=r.nextInt(101);
		System.out.println("Lets Bagin");
		int chance=5;
		int guess;
		while(chance>0)
		{
			System.out.println("Turns left"+chance);
			System.out.println("Enter your guess");
			guess=sc.nextInt();
				
			if(guess>val)
			{
				System.out.println("Enter lower value");
			}
			else if(guess<val)
			{
				System.out.println("Enter higher value");
			}
			else
			{
				System.out.println("Congratulations!!");
				wins++;
				running=false;
				break;
			}
			chance -=1;
		}
		if(running)
		{
			System.out.println("Game over-you loose");
			running=false;
		}
	}
}



