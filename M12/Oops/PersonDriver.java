class PersonDriver
{
    public static void main(String [] args)
    {
        Person p1 = new Person();
        
        p1.name = "Ganesh";
        p1.age = 24;
        p1.location = "Pune";
        p1.work = "Developer";
        p1.gender = 'M';
        p1.ShowName();
        p1.ShowLocation();
        p1.ShowGender();

        Person p2 = new Person();
        p2.name = "Shiv";
        p2.age = 24;
        p2.gender = 'M';
        p2.work = "Web Developer";
        //p2.location = "Mumbai";
        p2.ShowGender();
        p2.ShowLocation();
    }
}