package User_Input;
class State_Class
{
	State_Class()
	{
		System.out.println("State class constructor");
	}
	
	}
public class City_Class extends State_Class
{
	City_Class()
	{
		System.out.println("City class constructor");
	}

	public static void main(String[] args) 
	{
		new City_Class();
	   

	}

}
