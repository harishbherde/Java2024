import java.util.Scanner;
class ExtractNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number ");
		int num = sc.nextInt();
		int count = 0;

		/*while(num>0)
		{
			int last = num % 10;
			System.out.println(last);
			num = num/10;
			count++;
			
		}*/

		/*for(int i = num; num > 0; num/=10)
		{
			int last = num % 10;
			System.out.println(last);
			count++;
		}*/

		do{
			int last = num % 10;
			System.out.println(last);
			count++;
			num/=10;
		}
		while(num>0);
		System.out.println("Count of Digit "+count);
	}
}