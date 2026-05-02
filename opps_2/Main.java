//-------------- OOPS REVISION ------------------

//-------- CLASS AND OBJECTS ---------

// class Student{
//     String name = "vaibhaw";
//     int age = 20;
//     String course = "BCA";
// }

// class Demo{
//     public static void main(String[] args) {
//         Student s = new Student();

//         System.out.println("Name: " + s.name);
//         System.out.println("Age: " + s.age);
//         System.out.println("Course: " + s.course);
//     }
// }

//-------- CONSTRUCTOR ---------
// a constructor is a special method that is called when an object is instantiated. It is used to initialize the object.

//  class Demo {

//     public Demo() {
//         System.out.println("Constructor called");
//     }

//     public static void main(String[] args) {
//         Demo d = new Demo();// when we create an object of the class, the constructor is called automatically.
//     }
// }


//-------- inheritance ---------

// Inheritance is a fundamental object-oriented programming concept that allows a new class (called a subclass or child class) to inherit properties and behaviors (fields and methods) from an existing class (called a superclass or parent class). This promotes code reusability and establishes a natural hierarchical relationship between classes.

// class Animal {
//     void eat() {
//         System.out.println("This animal eats food.");
//     }
// }
// class Dog extends Animal {
//     void bark() {
//         System.out.println("The dog barks.");
//     }
// }

// class Demo {
//     public static void main(String[] args) {
//         Dog d = new Dog();
//         d.eat(); // inherited method from Animal class
//         d.bark(); // method of Dog class
//     }
// }



//-------- ABSTRACTION ---------

//------ 01 ------  Abstraction using Interface ---------

// interface Vehicle {
//     void start(); // abstract method, no body
// }

// class Car implements Vehicle {
//     public void start() { // implementation of the start method
//         System.out.println("Car starts with key");
//     }
// }

// class Bike implements Vehicle {
//     public void start() { // implementation of the start method
//         System.out.println("Bike starts with button");
//     }
// }

// class Demo { // main class
//     public static void main(String[] args) {
//         Vehicle v1 = new Car();
//         Vehicle v2 = new Bike();

//         v1.start(); // calls the start method of Car class
//         v2.start(); // calls the start method of Bike class
//     }
// }


//------ 02 ------ Abstraction using Abstract Class ---------

// abstract class Shape {
//     abstract void draw(); // abstract method, no body
// }

// class Cicle extends Shape {
//     void draw() { // implementation of the draw method
//         System.out.println("Drawing a circle");
//     }
// }
// class Main {
//     public static void main(String[] args) {
//         Shape s = new Cicle();
//         s.draw();
//     }
// }

//-------- encapsulation ---------
//-------- polymorphism ---------