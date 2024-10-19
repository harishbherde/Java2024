class bikeDriver
{
    public static void main(String [] args)
    {
        bike b1=new bike();

        b1.mileage = 30;
        b1.cc = 250;
        b1.price = 250000;
        b1.brand ="KTM";
        b1.displayBike();
        System.out.println(b1);

        bike b2 = new bike();
        b2.displayBike();
        b2.displayBike();
        

    }
}