public class LogicalOperator {
    public static void main(String [] args)
    {
        int p = 10;
        int q = 20;
        int r = 30;

        System.out.println((p>q) && (p<r));  // false
        System.out.println((p>q) && (p>r));  // false

        System.out.println((r<q) || (p<q));  // true
        System.out.println((r>q) || (p<q));  // true

        System.out.println( ! (p>q));  //true

    }
}
