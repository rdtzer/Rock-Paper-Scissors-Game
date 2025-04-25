package day5;

import java.util.Scanner;

public class RockPaperScissorGame {

	public static void main(String[] args)
	{
		System.out.println("Welcome to the Rock Paper Scissors Game");
		
		//User input 
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your choice");
		System.out.println("0: ROck, 1: Paper, 2: Scissors");
		int userchoice= scanner.nextInt();
		
		//Validate Input 
		
		if (userchoice <0 || userchoice>2)
		{
			System.out.println("Invalid choice. Please run the program again and enter 0,1, or 2");
			return;// exit the program
		}
		
		//Computers random choice 
		
		int computerChoice = (int) (Math.random()*3); 
		System.out.println(computerChoice);
		
		//Determine winner
		
		if (userchoice==computerChoice)
		{
			System.out.println("It's a tie");
		}
		else if ((userchoice==0 && computerChoice==2) ||
		        (userchoice==1 && computerChoice==0) ||
		        (userchoice==2 && computerChoice==1)) 
{
	System.out.println("You win! - Congradulations");
}
		else
		{
			System.out.println("Computer wins");
		}
		scanner.close(); 
}
	
}
