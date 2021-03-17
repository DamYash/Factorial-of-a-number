package Assignment6;
public class Factorial 
{
	
//1. Recursive:
	public static int fact1(int num)
	{
		if(num == 0)
			return 1;
		else
			return(num * fact1(num-1));
	}
	
//2. Non-Recursive
	public static int fact2(int num)
	{
		int fact2 = 1;
		if(num == 0)
			return 1;
		for(int i=1; i<=num; i++)
		{
			fact2 = fact2*i;
		}
		return fact2;
	}

	public static void main(String[] args) 
	{
		
		System.out.println("Factorial of 6 using a Recursive Function is: " + fact1(6));
		System.out.println("\nFactorial of 10 using a Non- Recursive Function is: " + fact2(10));

	}

}

/**Output:
Factorial of 6 using a Recursive Function is: 720

Factorial of 10 using a Non- Recursive Function is: 3628800
**/
