
public class ClassEx 
{
	public static void main(String[] args)
	{
		EdCircle circle = new EdCircle(10);
		EdCircle circle2 = new EdCircle();
		
		System.out.println(circle.cir());
		System.out.println(circle2.cir());
		
		System.out.println(circle.area());
		System.out.println(circle2.area());
		
		circle.setRadius(20);
		System.out.println(circle.area());
		
		System.out.println(circle2.getRad());
	}
}
