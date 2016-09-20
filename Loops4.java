import java.util.Random;

public class Loops4 
{
	public static void main(String args[])
	{
		Random random = new Random();
		
		
		
		int head = 0;
		int tail = 1;
		
		int hcount = 0;
		int tcount = 0;
		
		
		for (int i = 1000; i > 0; i--) 
		{	
			int ran = random.nextInt(2);
			if (ran == head) 
			{
				hcount++;
			} else if (ran == tail)
			{
				tcount++;
			}			
		}	
		System.out.println("The number of heads are: " + hcount);
		System.out.println("The number of tails are: " + tcount);
		
	}
}
