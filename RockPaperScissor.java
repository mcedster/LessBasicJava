
import javax.swing.JOptionPane;
import java.util.Scanner;
import java.util.Random;

public class RockPaperScissor 
{
	public static void main(String args[])
	{
boolean myBool = false;
		
		while(!myBool){
		
		JOptionPane window = new JOptionPane();
			
		Random random = new Random();
		
		int ran = random.nextInt(2);
		
		String ai = "";
		
		
		String input = window.showInputDialog("Enter R, P, or S");
		
		input = input.toLowerCase();
	
		String rock, paper, sci;
			rock = "r";
			paper = "p";
			sci = "s";				
				

			
		if (ran == 1){
			window.showMessageDialog(null, "Computer played rock");
			ai = rock;
			if (input.equals(rock)){
				window.showMessageDialog(null, "Tie");
			} else if (input.equals(paper)){
				window.showMessageDialog(null, "Player wins!");
			} else if (input.equals(sci)){
				window.showMessageDialog(null, "Computer wins!");
			}	
		} else if (ran == 2){
			window.showMessageDialog(null, "Computer played paper");
			ai = paper;
			if (input.equals(rock)){
				window.showMessageDialog(null, "Computer wins!");
			} else if (input.equals(paper)){
				window.showMessageDialog(null, "Tie");
			} else if (input.equals(sci)){
				window.showMessageDialog(null, "Player wins!");
			}	
		} else {
			window.showMessageDialog(null, "Computer played scissors");
			ai = sci;
			if (input.equals(rock)){
				window.showMessageDialog(null, "Player wins!");
			} else if (input.equals(paper)){
				window.showMessageDialog(null, "Computer wins!");
			} else if (input.equals(sci)){
				window.showMessageDialog(null, "Tie");
			}
		}	
			String again2 = window.showInputDialog("Play again? Press 1 (yes) or 0 (no).");
			int again = Integer.parseInt(again2);
			if (again == 0) {
				myBool = true;
			}
		}	
		
	}
	
	
}
/*
boolean myBool = false;
		
		while(!myBool){
		
		Scanner keyboard = new Scanner(System.in);
		
		Random random = new Random();
		
		int ran = random.nextInt(2);
		
		String ai = "";
		
		System.out.println("Enter R, P, or S");
		String input = keyboard.nextLine();
		
		input = input.toLowerCase();
	
		String rock, paper, sci;
			rock = "r";
			paper = "p";
			sci = "s";				
				

			
		if (ran == 1){
			System.out.println("Computer played rock");
			ai = rock;
			if (input.equals(rock)){
				System.out.println("Tie");
			} else if (input.equals(paper)){
				System.out.println("Player wins!");
			} else if (input.equals(sci)){
				System.out.println("Computer wins!");
			}	
		} else if (ran == 2){
			System.out.println("Computer played paper");
			ai = paper;
			if (input.equals(rock)){
				System.out.println("Computer wins!");
			} else if (input.equals(paper)){
				System.out.println("Tie");
			} else if (input.equals(sci)){
				System.out.println("Player wins!");
			}	
		} else {
			System.out.println("Computer played scissors");
			ai = sci;
			if (input.equals(rock)){
				System.out.println("Player wins!");
			} else if (input.equals(paper)){
				System.out.println("Computer wins!");
			} else if (input.equals(sci)){
				System.out.println("Tie");
			}
		}	System.out.println("Play again? Press 1 (yes) or 0 (no).");
			int again = keyboard.nextInt();
			if (again == 0) {
				myBool = true;
			}
		}	

*/