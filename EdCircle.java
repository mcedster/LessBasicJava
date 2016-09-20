

import java.util.Random;
import java.text.DecimalFormat;

/*
 * Create the class Circle
 * Every circle will have a radius.
 * By default, the circle will be assigned a Random value no
 * higher than 100.
 * Create methods to get the circumference of the circle and the area
 * Create methods that allow the user to change the radius and prints
 * the radius.
 */
public class EdCircle 
{
	private double radius;
	private Random rng;
	private final int MAX_RADIUS = 100;
	private DecimalFormat formatter;
	
	public EdCircle()
	{
		rng = new Random();
		formatter = new DecimalFormat("0.000");
		radius = MAX_RADIUS * rng.nextDouble();
	}
	
	public EdCircle(int intiRadius)
	{
		formatter = new DecimalFormat("0.000");
		radius = intiRadius;
	}
	
	public double cir()
	{	
		return formatter(2 * Math.PI * radius);
	}
	
	public double area()
	{
		return formatter(Math.PI * Math.pow(radius, 2));
	}
	
	public void setRadius(double newRadius)
	{
		radius = newRadius;
	}
	
	public double getRad()
	{
		return formatter(radius);
	}
	
	private double formatter(double value)
	{
		return Double.parseDouble(formatter.format(value));
	}
	
	
	
}
