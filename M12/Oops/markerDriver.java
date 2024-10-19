class markerDriver {
    public static void main(String[] args) {
        marker m1 = new marker();
        m1.brand = "Camlin";
        m1.price = 40;
        m1.colour = "Black";
        m1.size = 2;
        m1.displayMarker();

        System.out.println();

        marker m2 = new marker();
        m2.brand = "cello";
        m2.colour = "green";
        m2.price = 35;
        m2.size = 3;
        m2.displayMarker();
    }
}