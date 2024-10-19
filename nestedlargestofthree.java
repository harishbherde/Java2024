import java.util.Scanner;

public class nestedlargestofthree {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first");
        int n1=sc.nextInt();

        System.out.println("Enter Second");
        int n2=sc.nextInt();

        System.out.println("Enter third");
        int n3=sc.nextInt();

        if(n1>n2)
        {
            if(n1>n3)
            {
                System.out.println(n1+" : is largest");
            }
            else{
             System.out.println(n3+" : is largest");
            }
        }
        else
        {
           if(n2>n3)
           {
                System.out.println(n2+" : is largest");
           } 
           else{
            System.out.println(n3+" : is largest");
           }
        }
    }
}
