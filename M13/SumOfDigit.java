//CHeck sum of digit product of digit of num same or not if it is as perfect number
import java.util.Scanner;
class SumOfDigit 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");

		int num = sc.nextInt();
		int sum = 0;
		int product = 1;

		while(num!=0)
		{
			int last = num % 10;
			sum = sum + last;
			product = product*last;

			num/=10;

			if(sum == product)
			{
				System.out.println("It is A perfect Number");
			}
			else
			{
				System.out.println("It is not Perfect Number");
			}
		}
	}
}
