//--------- Functional Interface : ADV-UNIT01 ---------

// @FunctionalInterface
// interface MyFunctionalInterface {
//     void display();
// }

// class Demo{
//     public static void main(String[] args) {
//         // Using Lambda Expression to implement the functional interface
//         MyFunctionalInterface funcInterface = () -> System.out.println("Hello from Functional Interface!");
        
//         // Calling the method
//         funcInterface.display();
//     }
// }

//---------- Lambda Expression Example : ---------

// import java.util.Scanner;

// @FunctionalInterface
// interface MathOperation {
//     int operation(int a, int b);
// }

// class Demo {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter first number: ");
//         int x = sc.nextInt();
//         System.out.print("Enter second number: ");
//         int y = sc.nextInt();

//         // Using Lambda Expressions to define operations
//         MathOperation addition = (a, b) -> a + b;
//         MathOperation subtraction = (a, b) -> a - b;
//         MathOperation multiplication = (a, b) -> a * b;
//         MathOperation division = (a, b) -> a / b;
        
//         // Performing operations
//         System.out.println("Addition: " + addition.operation(x, y));
//         System.out.println("Subtraction: " + subtraction.operation(x, y));
//         System.out.println("Multiplication: " + multiplication.operation(x, y));
//         System.out.println("Division: " + division.operation(x, y));
//     }
// }


//---------- Lambda Expression to calculate square ---------

// @FunctionalInterface
// interface MathOperation {
//     int operation(int a, int b);
// }

// class Demo {
//     public static void main(String[] args) {
//         int a = 5;
//         MathOperation square = (x, y) -> x * x;
//         // Performing operations
//         System.out.println("square: " + square.operation(a, 0));
//     }
// }


//---------- Lambda Expression to find maximum ---------

// @FunctionalInterface
// interface Maximum {
//     int max(int a, int b);
// }
// class Demo {
//     public static void main(String[] args) {
//         int a = 10, b = 20;
//         Maximum maximum = (x, y) -> (x > y) ? x : y;
//         // Performing operations
//         System.out.println("Maximum: " + maximum.max(a, b));
//     }
// }

//---------- Lambda Expression to join strings ---------

// @FunctionalInterface
// interface StringJoiner {
//     String join(String a, String b);
// }
// class Demo {
//     public static void main(String[] args) {
//         String str1 = "Hello, ";
//         String str2 = "World!";
//         StringJoiner stringJoiner = (a, b) -> a + b;
//         // Performing operations
//         System.out.println("Joined String: " + stringJoiner.join(str1, str2));
//     }
// }

//---------- Lambda Expression to check number id divisible by 5 ---------

// @FunctionalInterface
// interface DivisibleByFive {
//     boolean isDivisible(int a);
// }
// class Demo {
//     public static void main(String[] args) {
//         int number = 25;
//         DivisibleByFive divisibleByFive = (x) -> x % 5 == 0;
//         // Performing operations
//         System.out.println(number + " is divisible by 5: " + divisibleByFive.isDivisible(number));
//     }
// }

//---------- Lambda Expression to check if a number is greater than 10 ---------

// @FunctionalInterface
// interface GreaterThanTen {
//     boolean isGreater(int a);
// }
// class Demo {
//     public static void main(String[] args) {
//         int number = 9;
//         GreaterThanTen greaterThanTen = (x) -> x > 10;
//         // Performing operations
//         System.out.println(number + " is greater than 10: " + greaterThanTen.isGreater(number));
//     }
// }

//---------- Lambda Expression take no arguments and return the string hello ---------

// @FunctionalInterface
// interface Hello {
//     String sayHello();
// }
// class Demo {
//     public static void main(String[] args) {
//         Hello hello = () -> "Hello";
//         // Performing operations
//         System.out.println(hello.sayHello());
//     }
// }

//---------- Lambda Expression to implement is positive and return boolean ---------

// @FunctionalInterface
// interface IsPositive {
//     boolean check(int a);
// }
// class Demo {
//     public static void main(String[] args) {
//         int number = 5;
//         IsPositive isPositive = (x) -> x > 0;
//         // Performing operations
//         System.out.println(number + " is positive: " + isPositive.check(number));
//     }
// }

//---------- Method Reference Example  ---------

//---- 01 ----- static method reference---------

// @FunctionalInterface
// interface MathOperation {
//     int operation(int a, int b);
// }
// class Demo {
//     // Static method
//     public static int add(int a, int b) {
//         return a + b;
//     }

//     public static void main(String[] args) {
//         // Using method reference to refer to the static method 'add'
//         MathOperation addition = Demo::add;

//         // Performing operation
//         System.out.println("Addition: " + addition.operation(10, 20));
//     }
// }


//---- 02 ----- instance method reference ----------

// @FunctionalInterface
// interface StringOperation {
//     String toUpperCase(String str);
// }
// class Demo {
//     // Instance method
//     public String convertToUpper(String str) {
//         return str.toUpperCase();
//     }

//     public static void main(String[] args) {
//         Demo demo = new Demo();
//         // Using method reference to refer to the instance method 'convertToUpper'
//         StringOperation stringOperation = demo::convertToUpper;

//         // Performing operation
//         System.out.println("Uppercase: " + stringOperation.toUpperCase("hello world"));
//     }
// }


//---- 03 ----- constructor method reference ---------

// @FunctionalInterface
// interface PersonFactory {
//     Person create(String name, int age);
// }
// class Person {
//     String name;
//     int age;

//     // Constructor
//     public Person(String name, int age) {
//         this.name = name;
//         this.age = age;
//     }

//     @Override
//     public String toString() {
//         return "Person{name='" + name + "', age=" + age + "}";
//     }
// }

//---- 04 ----- Instance Method of Arbitrary Object ----------

// class Demo {
//     public static void main(String[] args) {
//         // Using constructor reference to create Person objects
//         PersonFactory personFactory = Person::new;

//         // Creating a new Person
//         Person person = personFactory.create("Alice", 30);
//         System.out.println(person);
//     }
// }

//----------- Stream API Example ---------

// import java.util.Arrays;
// import java.util.List;

//  class Demo {
//     public static void main(String[] args) {
//         // Using Stream API to filter and print even numbers from a list
//         List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        
//         System.out.println("Even numbers:");
//         numbers.stream()
//                .filter(n -> n % 2 == 0)
//                .forEach(System.out::println);
//     }
// }


//----------- Lambda Expression to perform addition ---------

// @FunctionalInterface
// interface Addition {
//     int add(int a, int b);
// }
// public class Demo {
//     public static void main(String[] args) {

//         Addition sum = (a, b) -> a + b;

//         System.out.println("Sum = " + sum.add(10, 20));
//     }
// }


// @FunctionalInterface
// interface Addition{
//     int add( int a, int b);
// }


// public class Demo{
//     public static void main(String[] args)
//  {
//        Addition sum = (a, b) -> a + b;

//         System.out.println("Sum = " + sum.add(10, 20));   
//     }
// }


// ---------- Lambda Expression to check even number ---------
// @FunctionalInterface
// interface even{
//     int num(int a);
// }

// public class Demo{
//     public static void main(String[] args) {
//         even e =(a)->{
//         if (a%2==0) {
//            System.out.println(a + " is even");
//            return 1;
//         } else {
//             System.out.println(a + " is not even");
//             return 0;
//         }};
//         System.out.println(e.num(30));
//     }
// }

// ---------- Lambda Expression to check odd number ---------
// @FunctionalInterface
// interface odd {
//     int num (int a);    
// }

// public class Demo {
//     public static void main(String[] args) {
//         odd n = (a)->{
//             if(a%2!=0){
//                 System.out.println(a + " is odd");
//                 return 1;   
//             }
//             return 0;
//         };
//         System.out.println(n.num(31));
//     }
// }

// ---------- Lambda Expression to perform addition ---------

// interface addition{
//     int add(int a, int b);
// }

// public class Demo {
//     public static void main(String[] args) {
//         addition sum = (a, b) -> a + b;
//         System.out.println("Sum = " + sum.add(10, 20));
//     }
// }

// ---------- Lambda Expression ---------

// interface Parent{
//     default void sayHello(){
//         System.out.println("Hello from Parent");
//     }
// }
// class child implements Parent{
//     @Override
//     public void sayHello() {
//         System.out.println("Hello from Child");
//     }
// }

// class Demo{
//     public static void main(String[] args) {
//         child c = new child();
//         c.sayHello();
//     }
// }

// ---------- Lambda Expression to return employee name ---------

// interface employe{
//     String getName();
// }

// class Demo{ 
//     public static void main(String[] args) {
//             employe e = () -> "Employee Name";
//             System.out.println(e.getName());
//     }
// }

// class Demo {
//     public static void main(String[] args) {
//         Runnable r = ()-> System.out.println("Hello from Runnable!");
//         r.run();
//     }
// }


// ---------- Lambda Expression to print numbers from 0 to 5 ---------

// class Demo {
//     public static void main(String[] args){
//         Runnable r = ()->{
//             for(int i =0; i<=5; i++)
//                 {
//                 System.out.println("Hello from Runnable! " + i);    
//                 }
//         };
//         r.run();
//     }
// }


// ---------- Lambda Expression to print elements of a list ---------
// import java.util.ArrayList;
// import java.util.List;

// class Demo{
//     public static void main(String[] args) {
//         List<String> l = new ArrayList<>();
//         l.add("Hello");
//         l.add("World");
//         l.forEach(System.out::println);
//     }
// }


// ---------- Lambda Expression to sort a list in descending order ---------

// import java.util.*;
// class Demo {
//     public static void main(String[] args) {
//         List<Integer> numbers = new ArrayList<>();
//         numbers.add(1);
//         numbers.add(2);
//         numbers.add(3);
//         numbers.add(4);
//         numbers.add(5);
//        Collections.sort(numbers, (a, b) -> b - a);
//        System.out.println(numbers);
//     }
// }


//------------- ARRANGE THE GIVEN DATA -------------
// import java.util.*;
// class Demo{
//     public static void main(String[] args) {
//         List<Integer>  num = new ArrayList<>();
//         num.add(04);
//         num.add(05);
//         num.add(06);

//         System.out.println(num);
//         Collections.sort(num, (a,b) -> b-a);
//         System.out.println(num);
//         Collections.sort(num ,(a,b)-> a -b);
//         System.out.println(num);
//     }
// }

//---------- sealed --------------

// Parent Sealed Class
// sealed class Animal permits Dog, Cat {
//     void sound() {
//         System.out.println("Animal makes sound");
//     }
// }

// // Child Class 1
// final class Dog extends Animal {
//     void bark() {
//         System.out.println("Dog barks");
//     }
// }

// // Child Class 2
// final class Cat extends Animal {
//     void meow() {
//         System.out.println("Cat meows");
//     }
// }

// public class Demo {
//     public static void main(String[] args) {
//         Dog d = new Dog();
//         d.sound();
//         d.bark();

//         Cat c = new Cat();
//         c.sound();
//         c.meow();
//     }
// }



// ---------------- RECORDS ---------

// class Person {
//     private final String name;
//     private final int Sallary;
//     private final int id;

//     public Person(String name, int Sallary, int id) {
//         this.name = name;
//         this.Sallary = Sallary;
//         this.id = id;
//     }
// }


// record Persons(String name, int Sallary, int id) {}

//  class Demo {
//     public static void main(String[] args) {
//         Persons p = new Persons("vaibhaw" , 45000, 06);
//         p.Sallary();
//         p.id();
//         p.name();
//         System.out.println(p);
//     }
// }


// --------- Lambda Function sum ------

// interface Add {
//     int sum(int a, int b);
// }

// public class Demo {
//     public static void main(String[] args) {
        
//         Add obj = (a, b) -> a + b;
        
//         System.out.println(obj.sum(5, 3));
//     }
// }



//--------- Lambda Function subtract ----------

// interface sub{
//     int subtract(int a, int b);
// }
// class Demo{
//     public static void main(){
//         sub obj = (a,b)-> a-b;
//         System.out.println(obj.subtract(120, 33));
//  }
// }


// import java.util.function.Predicate;

// class Demo{
//     public static void main(String[] args){

//         Predicate<Integer> p = x -> x>10;

//         System.out.println(p.test(20));
//     }
// }

