
public class Loops2 
{
	public static void main(String args[])
	{
		
		int x = 1;
		int y = 2;
		int z = 3;
		int a = 4;
		int b = 1;

		while ( a >0) {
			while ( b > 0) 
		{
			while (z > 0) 
			{
				while (y >0) 
				{
					while (x > 0) 
					{
					System.out.print("*");
					x--;
					} 
				System.out.println();
				x += 2;
				y--;				
				} 
			System.out.print("*");		
			z--;
			} 
			System.out.println();
			b--;
			} System.out.print("*");
			a--;
		}
		
			

	}
}
