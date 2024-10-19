// sum of even or sum of odd number and check same or not
import java.util.Scanner;
class SumOFEvenOrOdd
{
	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		int num = sc.nextInt();
		int SumOfEven=0;
		int SumOfOdd=0;

		for(int i=num;i>0;i=i/10)
		{
			int last=i/10;
			if(last%2==0)
			{
				SumOfEven+=last;
				System.out.println(last);
			}
			else
			{
				SumOfOdd+=last;
			}
			
		}
		if(SumOfEven==SumOfOdd)
		{
			System.out.println("Sum of even digits is equal to sum of odd digits");
		}
		else
		{
			System.out.println("Sum of even digits is not equal to sum of odd digits");
			System.out.println("Sum of even digits: " + SumOfEven);
            System.out.println("Sum of odd digits: " + SumOfOdd);

		}
		
	}
}
