class BagDriver
{
    public static void main(String [] args)
    {
        Bag b1 = new Bag();

        b1.brand="skybag";
        b1.price=1500;
        b1.colour="blue";
        b1.capacity=40;
        
        b1.showBrand().showPrice().showcapacity();
    }
}