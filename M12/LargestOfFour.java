class LargestOfFour
{
    public static void main(String [] args)
    {
        int a = 10;
        int b = 20;
        int c = 30;
        int d = 40;

        int largest = (a>b)?(a>c?(a>d?a:d):(c>d?c:d)):(b>c?(b>d?b:d):(c>d?c:d));
        System.out.println(largest);
        /*int largest = (num1 > num2) ? (num1 > num3 ? (num1 > num4 ? num1 : num4) : (num3 > num4 ? num3 : num4)) 
         : (num2 > num3 ? (num2 > num4 ? num2 : num4) : (num3 > num4 ? num3 : num4));*/
    }
}