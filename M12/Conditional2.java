class Conditional2
{
    public static void main(String [] args)
    {
        int a = 50;
        int b = 60;
        int c = 70;

        int ans =(a<b)?((a<c)?a:c):((b<c)?b:c);
        System.out.println(ans);
    }
}