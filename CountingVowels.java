
import java.util.Scanner;

public class CountingVowels 
{
	public static void main(String args[])
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Enter letters to determine how many vowels are inside:");
		String input = keyboard.nextLine();
		
		input = input.toLowerCase();
		
        int total = 0;
        int count = 0;
       
        int ones = input.length();
       
        char y = input.charAt(count);
       
        while (ones > 0)
        {
        	y = input.charAt(0);
	        int x = input.length() ;
	        input = input.substring(1);
	        String z = Character.toString(y);
			
	        if (z.equals("a") || z.equals("e") || z.equals("i") || z.equals("o") || z.equals("u"))
	        {
	        	total += 1;
	        	x--;
	        }



				
			
		}		
			
	}
}
