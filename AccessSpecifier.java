package User_Input;

public class AccessSpecifier 
{
	public static void add()
	{
		System.out.println("1");
	}
	protected static void sub()
	{
		System.out.println("2");
	}
	private static void mul()
	{
		System.out.println("3");
	}
	static void divide()
	{
		System.out.println("4");
	}

	public static void main(String[] args) 
	{
		add();
		sub();
		mul();
		divide();
		

	}

}
