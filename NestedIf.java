package User_Input;

public class NestedIf {

	public static void main(String[] args) {
		char gender_1='M';
		char gender_2='F';
		int age_kid=4;
		int age_adult_male=32;
		int age_adult_female=28;
		
		if(gender_1=='M')
		{
			if(age_kid>3)
			{
				System.out.println("ticket is free");
			}
			else
			{
				System.out.println("full ticket");
			}
	
		}
		
		else
		{
			System.out.println("ticket is free");
		}

	}

}
