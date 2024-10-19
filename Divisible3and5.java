import java.util.Scanner;

public class Divisible3and5 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int num = sc.nextInt();

        if(num % 5==0 && num % 3==0)
        {
            System.out.println("It is Divisible ");
        }
        else{
            System.out.println("it is not Divisible ");
        }
    }    
}
