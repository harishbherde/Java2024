package harsh;
import java.util.Scanner;
public class Algebra2{
    int add(int a,int b){
        int ans = a + b;
        return ans;
    }
    
}

public class main{
    public static void main(String [] args)
    {
        Algebra obj = new Algebra();
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();

        System.out.println("Sum of input numbers is");
        obj.add(x,y );
        System.out.println( );
    }
}