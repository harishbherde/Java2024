import java.util.Scanner;
class Factorial
{
    public static void printFactorial(int n)
    {
        int Fact=1;
        for(int i=n;i>=1;i--)
        {
            Fact=Fact*i;
        }
        System.out.println(Fact);
    }
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printFactorial(n);
    }    
}