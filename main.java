import java.util.Scanner;

class Algebra
{
    static int add(int a,int b)
    {
    int ans = a+b;
    return ans;
    }
}
public class main{
    public static void main(String [] args)
    {
        Algebra obj=new Algebra();
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        
        int ans = obj.add(a,b);
        System.out.println(ans);
    }
    
}