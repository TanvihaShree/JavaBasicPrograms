package User_Input;


class Parent
{
	static void genes()
	{
		System.out.println("Father genes");
	}
	static void look()
	{
		System.out.println("Father look");
	}
	}
public class Singlelevel_inheritance extends Parent
{
	static void Behaviour()
	{
		System.out.println("daughter behaviour");
	}
	static void Nature()
	{
		System.out.println("daughter Nature");
	}
	
	public static void main(String[] args) 
	{
		Behaviour();
		genes();
		look();
	}

}
