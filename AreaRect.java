import java.util.Scanner;

public class AreaRect 
{
	public static void main(String args[])
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("To calculate the area of a rectangle, please enter the length: ");
		double length = keyboard.nextDouble();
		
		System.out.println("Please enter the width: ");
		double width = keyboard.nextDouble();
		
		System.out.println("The area of the rectangle is: " + (length * width));
	}
}
