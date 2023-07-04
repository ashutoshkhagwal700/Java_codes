package Basics;

//Object initialization through reference variable.

class Student2{
    int roll;
    String name;
}
public class Reference {
    public static void main(String[] args){
        Student2 s1 = new Student2();
        Student2 s2 = new Student2();
        s1.roll = 11;
        s1.name = "ashutosh";
        s2.roll = 120;
        s2.name = "ashu";
        System.out.println(s1.roll+" "+s1.name);
        System.out.println(s2.roll+" "+s2.name);
    }
}