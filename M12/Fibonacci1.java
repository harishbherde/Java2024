import java.util.Scanner;
class Fibonacci1
{
    public static void main(String [] args)
    {
        int a = 0;
        int b = 1, c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the term:");
        int term=sc.nextInt();

       // for(int i = 1;i<=term;i++)
       int i=1;
       while(i<=term)
        {
            System.out.print(a+" ");
            c=a+b;
            a=b;
            b=c;
            i++;


        }
        
    }
}