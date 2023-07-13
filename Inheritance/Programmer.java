//Program of Inheritance

package Inheritance;
//Parent/superclass
class Employee {
    String name = "Ashutosh";
    float salary = 50000;
}
//Child/subclass
class Programmer extends Employee{
    int incentive = 15000;

    public static void main(String[] args) {
        Programmer obj = new Programmer();
        System.out.println(obj.name + " " + obj.salary + " " + obj.incentive);
    }
}
