import java.util.Scanner;
class FactorialusingMethod 
{
	public static void printFactorial(int n)	//Method creation
	{
		int factorial = 1;
		for(int i = n; i >=1; i--)
		{
			factorial = factorial*i;
		}
		System.out.println(factorial);
		
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter User Input");

		int n=sc.nextInt();

		printFactorial(n);
	}
}
