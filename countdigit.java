import java.util.Scanner;

public class Countdigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();

        int numberofdigit=0;
        int orignal =n;

        while(n>0)
        {
            n = n/ 10;
            numberofdigit++;
        }
        System.out.println("number of digit "+" "+orignal+" ="+numberofdigit+" ");

    }
    
}
