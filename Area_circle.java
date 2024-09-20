package User_Input;

public class Area_circle 
{
	final static double pi=3.14;
	
	static void area()//pi*r*r
	{
		int r=1;
		double area=pi*r*r;
		System.out.println(area);
	}
	
	static void circumference()//2*pi*r
	{
		int r=1;
		double circum=2*pi*r;
		System.out.println(circum);
	}
	
	public static void main(String[] args) 
	{
		area();
		circumference();
	}
}
