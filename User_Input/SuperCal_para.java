package User_Input;

class Country_class
{
	Country_class(int a)

{
	System.out.println("State class constructor");
}
}

public class SuperCal_para extends Country_class
{
	SuperCal_para()
	{
		super(100);
		System.out.println("City class constructor");
	}

	public static void main(String[] args) 
	{
	

	}

}
