import java.util.Scanner;
class SumOFEvenOrOdd2 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number ");
		int num=sc.nextInt();
		int sum=0;
		if(num%2==0)
		{
			for(int i=0;i<=num;i++)
			{
				sum=sum+i;
			}
			System.out.println("Sum of even number"+ sum);
		}
		else
		{
			for(int i=0;i<=n;i=i+2)
			{
				sum=sum+i;
			}
			System.out.println("Sum of odd number "+sum);
		}
	}
}
