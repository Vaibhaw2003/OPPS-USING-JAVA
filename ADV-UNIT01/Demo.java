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