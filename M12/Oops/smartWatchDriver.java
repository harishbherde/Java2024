class smartWatchDriver
{
    public static void main (String [] args)
    {
        smartWatch Sm1 = new smartWatch();
        

        Sm1.brand = "Firebolt";
        Sm1.price = 3000;
        Sm1.colour = "Black";
        Sm1.model = "SportWatch";
        Sm1.showWatch();
        smartWatch Sm2 = new smartWatch();
        

        Sm2.brand = "noise";
        Sm2.colour = "red";
        Sm2.model = "cph";
        Sm2.price = 4000;
        Sm2.type = "Smartww";
        Sm2.showWatch();
    }
}