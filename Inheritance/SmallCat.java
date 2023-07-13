// Example of Multilevel Inheritance

package Inheritance;
// Parent class
class Animal1 {
    void sound(){
        System.out.println("This is animal class ");
    }
}
// Child class
class Cat extends Animal1{
    void meow(){
        System.out.println("This is child class and cat sounds like meow");
    }
}

// child class
class SmallCat extends Cat{
    void eat(){
        System.out.println("This is child class of Animal1 class");
    }

    public static void main(String[] args) {
        SmallCat obj = new SmallCat();
        obj.sound();
        obj.meow();
        obj.eat();
    }
}

