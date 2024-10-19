class Increament{
    public static void main(String [] args)
    {
        int a = 10;
        int b = 20;

        System.out.println(++a);    //pre-increment = 11
        System.out.println(a++);    //post-increament =11
        System.out.println(a);    //12

        System.out.println(--b);    //pre-decreament = 19
        System.out.println(b--);    //post-decrement = 19
        System.out.println(b);      //18
    }
}