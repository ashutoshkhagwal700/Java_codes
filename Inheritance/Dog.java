// Single Inheritance Example:
package Inheritance;
//Parent class
class Animal {
    void sound(){
        System.out.println("Sound of animals");
    }
}

//Child class
class Dog extends Animal{
    void bark(){
        System.out.println("Dog is barking");
    }

    public static void main(String[] args) {
        Dog obj = new Dog();
        obj.sound();
        obj.bark();
    }
}
