import java.util.Scanner;
class EvenOrOdd 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the User input");

		int num = sc.nextInt();

		/*for(int i = num;i > 0;i/=10)
		{
			int last = i % 10;
			if(last%2==0)
			{
				
				System.out.print(last+" ");
			}
		}
		System.out.println();
		for(int i = num;i > 0;i/=10)
		{
			int last = i % 10;
			if(last%2!=0)
			{
			
				System.out.print(last+" ");
			}
		}*/
		int temp = num;

		while(temp>0)
		{
			int last = temp % 10;
			if(last%2==0)
			{
				System.out.print(last);
			}
			temp/=10;
		}
		System.out.println();
		temp=num;
		
		while(temp>0)
		{
			int last = temp % 10;
			if(last%2!=0)
			{
				System.out.print(last);
			}
			temp/=10;
		}



	}
}
