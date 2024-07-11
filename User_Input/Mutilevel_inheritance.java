package User_Input;

class Alphabet
{
	void test()
	{
		System.out.println("alpha");
	}

	}

class Google extends Alphabet
{
	void test1()
	{
		System.out.println("google");
	}

	}

public class Mutilevel_inheritance extends Google
{
	void author()
	{
		System.out.println("author");
	}
	
	public static void main(String[] args)
	{
		Mutilevel_inheritance m1=new Mutilevel_inheritance();
		m1.author();
		m1.test();
		m1.test1();
	}

}
