package DAY_07;
class Student{
    String Name;
    int age;
    int RollNo;

}

public class StudentClass {
    public static void main(String args[]){
        Student obj1 = new Student();
        obj1.Name = "Ayush Kumar";
        obj1.age  = 13;
        obj1.RollNo = 12;
        System.out.println(obj1.Name);
        System.out.println(obj1.age);
        System.out.println(obj1.RollNo);

        Student obj2 = new Student();
        obj2.Name = "Ankush Kumar";
        obj2.age  = 8;
        obj2.RollNo = 1;
        System.out.println(obj2.Name);
        System.out.println(obj2.age);
        System.out.println(obj2.RollNo);
    }
}