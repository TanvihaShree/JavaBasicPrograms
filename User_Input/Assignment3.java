package User_Input;

public class Assignment3 
{
	void Add(int a, int b)
	{
	int sum= a+b;
	System.out.println(sum);
	}
	
	void Sub(double d, int c)
	{
	double sub= d-c;
	System.out.println(sub);
	}
	
	void Mul(float f, int r)
	{
	double mul= f*r;
	System.out.println(mul);
	}

	public static void main(String[] args) 
	
	{
		Assignment3 a1=new Assignment3();
		a1.Add(10,50);
		a1.Sub(89.9765, 48);
		a1.Mul(98,45);		
	
}

}
