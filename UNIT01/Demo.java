// --------------JAVA UNIT-01--------------
/*

----- TO PRINT NAME -----------

class Demo {
    public static void main(String[] args){
        System.out.println("vaibhaw singh");
    }
}
*/

//--------GETTING INPUT FROM THE USE ------------
/* 
import java.util.*;
import java.util.Scanner;

class Demo {
    public static void main(String[] args){

         Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = sc.nextLine();

         System.out.print("Enter your age: ");
        int age = sc.nextInt();

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        sc.close();
    }
}
*/
/*   
// import java.util.Scanner;
// class Demo {
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("enter marks: ");
//         int marks = sc.nextInt();

//         if (marks>=90) {
//             System.out.println("pass");
//         }else{
//             System.out.println("failed");
//         }
//     }
// }

*/
// ----------[ write a code to find max and min from a array ]------------
/*  
import java.util.Scanner;

class Demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input array size
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        // Input array elements
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Assume first element as max and min
        int max = arr[0];
        int min = arr[0];

        // Find max and min
        for (int i = 1; i < n; i++) {
            if (arr[i] > max)
                max = arr[i];

            if (arr[i] < min)
                min = arr[i];
        }

        // Output
        System.out.println("Maximum value = " + max);
        System.out.println("Minimum value = " + min);
    }
}
*/

//------[ Write a program to check if a number is prime or not ]------------
/*  
import java.util.Scanner;

class Demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        boolean isPrime = true;

        if (num <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i <= num / 2; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        if (isPrime)
            System.out.println(num + " is a Prime number");
        else
            System.out.println(num + " is NOT a Prime number");
    }
}
*/

//------[ Write a program to reverse a string without using built-in functions. ]-----
/*
import java.util.Scanner;

class Demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        String rev = "";

        // Reverse logic
        for (int i = str.length() - 1; i >= 0; i--) {
            rev = rev + str.charAt(i);
        }
        System.out.println("Reversed string: " + rev);
    }
}
*/

// ----------[ marks criteria Apply the concept of switch-case ]-------

// import java.util.Scanner;

// class Demo {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter marks (0 - 100): ");
//         int marks = sc.nextInt();

//         if (marks < 0 || marks > 100) {
//             System.out.println("Invalid marks");
//             return;
//         }

//         // Divide marks by 10 for switch-case
//         switch (marks / 10) {
//             case 10:
//             case 9:
//                 System.out.println("Grade: A");
//                 break;

//             case 8:
//                 System.out.println("Grade: B");
//                 break;

//             case 7:
//                 System.out.println("Grade: C");
//                 break;

//             case 6:
//                 System.out.println("Grade: D");
//                 break;

//             default:
//                 System.out.println("Grade: Fail");
//         }
//     }
// }

// ---------- while loop || do while loop ---------

// class Demo {
//     public static void main(String[] args) {
//         int i = 0;
//         while (i<=10) {
//             System.out.println("ram ram ");
//             i++;
            
//         }
//     }
// }

//--------- do while loop -------

// class Demo {
//     public static void main(String[] args) {
//         int i=0;
//         do{
//             System.out.println("ram");
//             i++;
//         }
//         while(i <=4);
//     }
// }

//--------- TO PRINT THE SUME OF N NATURAL NO.--------

// import java.util.Scanner;
// class Demo{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter a number: ");
//         int n = sc.nextInt();
//         int sum = 0;
//         for(int i=1; i<=n; i++){
//             sum += i;

//         }
//         System.out.println("Sum of first " + n + " natural numbers is: " + sum);
//     }
// }


//--------- INHERITANCE ---------

// class A{
//     void display(){
//         System.out.println("Hello from class A");
//     }

//     int subtract(int x, int y){
//         return x - y;
//     }

//     int add(int x, int y, int z){
//         return x + y + z;
//     }
// }

// class B extends A{
//     void show(){
//         System.out.println("Hello from class B");
//     }

//     int add(int x, int y){
//         return x + y;
//     }

//     int subtract(int x, int y, int z){
//         return x - y - z;
//     }
// }
// class Demo{
//     public static void main(String[] args){
//         B obj = new B();
//              obj.display();
//             obj.show();
//             System.out.println("Sum: " + obj.add(10, 20));
//             System.out.println("Difference: " + obj.subtract(20, 10));
//             System.out.println("Sum with three parameters: " + obj.add(10, 20, 30));
//             System.out.println("Difference with three parameters: " + obj.subtract(30, 10, 5));

//     }
// }

//------- POLYMORPHISM ---------

// Method Overloading (Compile-time Polymorphism)

// class Cal {
//     int sum(int a , int b){
//         return a + b;
//     }
//     double sum(double a , double b){
//         return a + b;
//     }
//      int sum(int a , int b, int c){
//         return a + b + c;
//     }
// }
// class Demo{
//     public static void main(String[] args) {
//         Cal obj = new Cal();
//         System.out.println("Sum of 2 integers: " + obj.sum(10, 20));
//         System.out.println("Sum of 2 doubles: " + obj.sum(10.5, 20.5));
//         System.out.println("Sum of 3 integers: " + obj.sum(10, 20, 30));
        
//     }
// }

//----------  Method Overriding (Runtime Polymorphism) ----------

// class A{
//     void display(){
//         System.out.println("Hello from class A");
//     }
// }

// class B extends A{
//     @Override
//     void display(){
//         System.out.println("Hello from class B");
//     }
// }

// class Demo{
//     public static void main(String[] args) {
//         A objA = new A();
//         B objB = new B();

//         objA.display(); // Calls A's display
//         objB.display(); // Calls B's display

//         // Polymorphism in action
//         A ref;
//         ref = objA;
//         ref.display(); // Calls A's display

//         ref = objB;
//         ref.display(); // Calls B's display (runtime polymorphism)
//     }
// }


//--------- Polymorphism with Animals ---------

// class Animal {
//     void sound() {
//         System.out.println("Animal makes a sound");
//     }
// }

// class Dog extends Animal {
//    @Override
//    void sound() {
//         System.out.println("Dog barks");
//     }
// }
// class Demo{
//     public static void main(String[] args){
//         System.out.println("Hello World");
//         Dog dog = new Dog();
//         dog.sound(); // Calls Dog's sound method
//         Animal animal = new Animal();
//         animal.sound(); // Calls Animal's sound method
//     }
// }


//--------- Polymorphism with Interfaces ---------

// interface Animal {
//     void sound();
// }

// class Dog implements Animal {
//     @Override
//     public void sound() {
//         System.out.println("Dog barks");
//     }
// }

// public class Demo {

//     public static void main(String[] args) {
//         Dog dog = new Dog();
//         dog.sound(); // Calls Dog's sound method
//     }
// }


//----------- TAKING INPUT FROM THE USE -------

// import java.util.*;;
// class Demo{
//     public static void main(String[] args){
//         System.out.println("enter the number : ");
//         Scanner sc = new Scanner(System.in);
//         int num = sc.nextInt();

//         for(int i =0; i<=num; i++){
//             System.out.println(i);
//         }

//     }
// }


//------------ find odd number from the use -----------

// import java.util.*;;
// class Demo{
//     public static void main(String[] args){
//         System.out.println("enter the number : ");
//         Scanner sc = new Scanner(System.in);
//         int num = sc.nextInt();
//         for(int i =0; i<=num; i++){
//             if(i % 2 != 0){
//                 System.out.println(i);
//             }
//         }
//     }
// }


//------------ Inheritance Demo class student  -----------

// class Demos {
//     String name;
//     int age;
//     int rollNo;

// }

// class Student extends Demos {
//     void display() {
//         System.out.println("Name: " + name);
//         System.out.println("Age: " + age);
//         System.out.println("Roll No: " + rollNo);
//     }
// }

// class Demo{
//     public static void main(String[] args) {
//         Student student = new Student();
//         student.name = "Vaibhaw Singh";
//         student.age = 20;
//         student.rollNo = 101;

//         student.display();
//     }
// }