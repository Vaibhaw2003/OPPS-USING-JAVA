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


//-------- ENCAPSULATION ---------

// Encapsulation is the process of wrapping data (variables) and code (methods) together as a single unit. It is used to hide the internal details of an object and only expose the necessary information to the outside world. This is achieved by using access modifiers (private, public, protected) to restrict access to the variables and methods of a class.

// class Student {
//     private String name; // private variable, can only be accessed within the class
//     private int age; // private variable, can only be accessed within the class

//     // getter method for name
//     public String getName() {
//         return name;
//     }

//     // setter method for name
//     public void setName(String name) {
//         this.name = name;
//     }

//     // getter method for age
//     public int getAge() {
//         return age;
//     }

//     // setter method for age
//     public void setAge(int age) {
//         this.age = age;
//     }
// }

// class Main {
//     public static void main(String[] args) {
//         Student s = new Student();
//         s.setName("Vaibhaw");
//         s.setAge(20);

//         System.out.println("Name: " + s.getName());
//         System.out.println("Age: " + s.getAge());
//     }
// }

//-------- POLYMORPHISM ---------

// Polymorphism is the ability of an object to take on many forms. It allows a single interface to be used for a general class of actions. The specific action is determined by the exact nature of the situation. There are two types of polymorphism in Java: compile-time polymorphism (method overloading) and runtime polymorphism (method overriding).

//-------- 01 ------- Compile-time Polymorphism (Method Overloading) ---------

// class Calculator {
//     // method to add two integers
//     int add(int a, int b) {
//         return a + b;
//     }

//     // method to add three integers
//     int add(int a, int b, int c) {
//         return a + b + c;
//     }
// }

// class Demo {
//     public static void main(String[] args) {
//         Calculator calc = new Calculator();
//         System.out.println("Sum of 2 and 3: " + calc.add(2, 3)); // calls the first add method
//         System.out.println("Sum of 1, 2 and 3: " + calc.add(1, 2, 3)); // calls the second add method
//     }
// }

//-------- 02 ------- Runtime Polymorphism (Method Overriding) ---------

// class Animal {
//     void sound() {
//         System.out.println("Animal makes a sound");
//     }
// }

// class Dog extends Animal {
//     @Override
//     void sound() {
//         System.out.println("Dog barks");
//     }
// }

// class Demo {
//     public static void main(String[] args) {
//         Animal a = new Animal();
//         Animal d = new Dog();

//         a.sound(); // calls the sound method of Animal class
//         d.sound(); // calls the sound method of Dog class (overridden)
//     }
// }


//------- constructor  --------

// A constructor is a special method that is called when an object is instantiated. It is used to initialize the object. The constructor has the same name as the class and does not have a return type. 

// class Demo{

//     Demo(){
//         System.out.println("Constructor called");
//     }
//     public static void main(String args[]){
//         Demo d = new Demo();
//     }
// }

//--------- Method with the same name as class ---------

// class Demo{
//     void Demo(){
//         System.out.println("This is a method, not a constructor");
//     }
//     public static void main(String args[]){
//         Demo d = new Demo(); // This will call the default constructor, not the Demo() method
//         d.Demo(); // This will call the Demo() method
//     }
// }