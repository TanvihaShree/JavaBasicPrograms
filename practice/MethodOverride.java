package practice;
class Random_class
{
	void login()
	{
		System.out.println("Loging with email id");
	}
}

public class MethodOverride extends Random_class
{
	void login()
	{
		super.login();
		System.out.println("Loging with phone number");
	}

	public static void main(String[] args) 
	{
		MethodOverride m1=new MethodOverride();
		m1.login();

	}

}
