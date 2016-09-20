import java.util.Scanner;
	
public class Binary 
{
    public static void main(String args[])
    {
        boolean test = false;
        
        while (test != true)
        {
	    	Scanner keyboard = new Scanner(System.in);
	       
	        System.out.println("Enter some binary to be translated to decimal: ");
	        String input = keyboard.nextLine();
	        
	        int total = 0;
	        int count = 0;
	       
	        int ones = input.length();
	       
	        char y = input.charAt(count);
	       
	        while (ones > 0)
	        {
	        	y = input.charAt(0);
		        int x = input.length() - 1 ;
		        input = input.substring(1);
	            
	            if ( y == '1')
	            {  
	            int add = (int) Math.pow(2, x);
	            total = total + add;
	            }    
	            else if (y != '0')
	            {
	            	System.out.println("Only ones or zeros!!");
	            	System.exit(0);
	            }	
	            ones--; 
	        }   
	        System.out.println(total);
	        System.out.println("Enter another number? y/n");
	        String another = keyboard.nextLine();
	        if (another.equals("n"))
	        {
	        	System.exit(0);
	        }
	        
        }
    }
}
