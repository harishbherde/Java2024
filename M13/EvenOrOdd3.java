import java.util.Scanner;
class EvenOrOdd3
{
	public static void main(String [] args)
	{
		int sum = 0;
		int SumEven = 0;
		int SumOdd = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the user input ");
		int num = sc.nextInt();

		if(num%2==0)
		{
			int i;
			for( i=0;i<=num;i++)
			{
				sum=sum+i;
				sum++;
			}
			System.out.println("Even Number : "+i);
			System.out.println("Sum Of Even Number : "+sum);
		}
		if(num%2!=0)
		{
			int i;
			for( i=0;i<=num;i++)
			{
				sum=sum+i;
			}
			System.out.println("Odd Number : "+i);
			System.out.println("Sum of even number : "+sum);
		}
	}
} 