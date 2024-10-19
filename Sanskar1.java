class student {
    int rollNo;
    String studentName;
}

public class Sanskar1 {
    int age = 20;

    public static void main(String[] args) {
        student obj = new student();
        obj.rollNo = 49;
        obj.studentName = "sanskar";
        Sanskar1 obj2 = new Sanskar1();
        obj2.age=12;

        System.out.println("Roll No = "+obj.rollNo);
        System.out.println("Age = "+obj2.age);
        System.out.println("Student Name = "+obj.studentName);
        System.out.println();

        Sanskar1 obj1 = new Sanskar1();
        obj.rollNo = 20;
        obj.studentName = "Shiv";
        obj1.age = 24;

        System.out.println("Roll no = "+obj.rollNo);
        System.out.println("Student Name = "+obj.studentName);
        System.out.println("Age = "+obj1.age);
        System.out.println();

        obj.rollNo = 45;
        obj.studentName = "Harsh";
        obj1.age = 24;

        System.out.println("Roll no = "+obj.rollNo);
        System.out.println("Student Name = "+obj.studentName);
        System.out.println("Age = "+obj1.age);
         System.out.println();


        obj.rollNo = 01;
        obj.studentName = "Rakesh";
        obj1.age = 40;

        System.out.println("Roll no = "+obj.rollNo);
        System.out.println("Student Name = "+obj.studentName);
        System.out.println("Age = "+obj1.age);
         System.out.println();

    }
}