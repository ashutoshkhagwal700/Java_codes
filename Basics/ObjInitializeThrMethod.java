package Basics;

//Object initialization through method

class Student3{
    int roll;
    String name;
    void insertData(int r, String n){
        roll = r;
        name = n;
    }
    void displayData(){
        System.out.println(roll+" "+name);
    }
}

public class ObjInitializeThrMethod {
    public static void main(String[] args){
        Student3 s1 = new Student3();
        Student3 s2 = new Student3();
        s1.insertData(11,"ashutosh");
        s2.insertData(1200,"ashuk");
        s1.displayData();
        s2.displayData();
    }
}
