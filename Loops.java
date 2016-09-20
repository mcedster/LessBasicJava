

import java.util.Scanner;

public class Loops 
{
	public static void main(String args[])
	{
		
		boolean myBool = true;
		
		while (myBool)
		{
			Scanner keyboard = new Scanner(System.in);

			System.out.println("Enter a shape (triangle, circle, square) for you would like to find the area for: ");
			String shape = keyboard.nextLine();
		
			shape = shape.toLowerCase();
		
			String tri = "triangle";
			String sq = "square";
			String cir = "circle";
		
			if (shape.equals(tri)) 
			{
				System.out.print("Enter the height of the triangle: ");
				double lengthT = keyboard.nextDouble();
		   
				System.out.print("Enter the base: ");
				double widthT = keyboard.nextDouble();
		
				double areaT = 2.0/lengthT*widthT;
				System.out.println(areaT);
			} 
			else if (shape.equals(cir)) 
			{
			
				System.out.println("Enter the radius: ");
				double radius = keyboard.nextDouble();
		
				final double pi = Math.PI;
				double area = (radius * radius) * pi;
				System.out.println(area);
			} 
			else if (shape.equals(sq))
			{
			
				System.out.print("Enter the length: ");
				double length = keyboard.nextDouble();
		   
				System.out.print("Enter the width: ");
				double width = keyboard.nextDouble();
		   
				double areaS = length*width;
				System.out.println(areaS);
			} 
			System.out.println("Would you like to continue finding areas? Type 1 or 0");
			int ans = keyboard.nextInt();
			if (ans == 0)
				myBool = !myBool;
		}
	}
}
