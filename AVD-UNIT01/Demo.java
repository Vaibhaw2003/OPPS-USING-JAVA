//--------- Functional Interface : AVD-UNIT01 ---------

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

//---------- Lambda Expression Example : AVD-UNIT02 ---------

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