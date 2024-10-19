import java.util.Scanner;
class AlternateNumber
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number");
		int num = sc.nextInt();

		System.out.println("User Input :"+num);

		int temp=num;
		boolean printx=true;
		while(temp>0)
		{
			int last = temp % 10;
			if(printx)
			{
				System.out.println(last);
			}
			printx = !printx;
			temp/=10;
		}
	}
}