
import java.util.Scanner;

public class Loops3 
{
	public static void main(String args[])
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter a password to be stored: ");
		String pass = keyboard.nextLine();
		
		for (int i = 5; i > 0; i--) 
		{	
			System.out.println("Enter the password to continue: ");
			String confirm = keyboard.nextLine();
			if (pass.equals(confirm)) 
			{
				System.out.println("Access granted.");
			} else 
				System.out.println("Access denied.");
			if (i == 1) 
			{
				System.out.println("Account locked");
			}
		}	
		
	}
}
