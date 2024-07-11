package User_Input;

public class Constructor_overload 
{
	Constructor_overload(int age)
	{
		System.out.println(age);
	}
	
	Constructor_overload(double weight)
	{
		this(30);
		System.out.println(weight);
	}
	
	Constructor_overload(String name)
	{
		this(34.658);
		System.out.println(name);
	}
	
	public static void main(String[] args)
	{
		new Constructor_overload("Bhavani");
		//new Constructor_overload(33);
		//new Constructor_overload(67.8798);
	}

}
