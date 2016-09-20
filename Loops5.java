
import java.util.Scanner;

public class Loops5 
{
	public static void main(String args[])
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Would you like to count forwards or backwards? ");
		String count = keyboard.nextLine();
		
		System.out.println("What is the start number?");
		int start = keyboard.nextInt();
		
		System.out.println("What is the end number?");
		int end = keyboard.nextInt();
		
		System.out.println("What do you wish to count by?");
		int countBy = keyboard.nextInt();
		
		boolean check = false;
		
		if (end > start) 
		{
			System.out.println("Please try again");
		}
		
		while (!check)
		{
			
		}
		
	}
}
