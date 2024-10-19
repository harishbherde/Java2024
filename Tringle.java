import java.util.Scanner;
public class Tringle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first Side ");
        int a=sc.nextInt();

        System.out.println("Enter second side ");
        int b=sc.nextInt();

        System.out.println("Enter third side ");
        int c=sc.nextInt();

        if(a+b>c && b+c>a && a+c>b)
        {
            System.out.println("valid tringle");
        }
        else{
            System.out.println("invalid Tringle");
        }
    }
    
}
