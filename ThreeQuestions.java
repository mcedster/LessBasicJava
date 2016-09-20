
import java.util.Scanner;

public class ThreeQuestions 
{
	public static void main(String args[])
	{
	Scanner keyboard = new Scanner(System.in);
	
	System.out.println("Hi, How are you?");
	
	String how = keyboard.nextLine();
	
	System.out.println("Me too.");
	
	System.out.println("What is your name?");
	
	String name = keyboard.nextLine();
	
	System.out.println("Hello " + name + "\nHow old are you?");
	
	int age = keyboard.nextInt();
	
	System.out.println("Wow, " + name + " I am also " + age + " years old!");


	
	
	
	
	}
	
}
