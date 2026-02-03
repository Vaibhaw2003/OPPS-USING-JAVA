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

import java.util.Scanner;

@FunctionalInterface
interface MathOperation {
    int operation(int a, int b);
}

class Demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int x = sc.nextInt();
        System.out.print("Enter second number: ");
        int y = sc.nextInt();

        // Using Lambda Expressions to define operations
        MathOperation addition = (a, b) -> a + b;
        MathOperation subtraction = (a, b) -> a - b;
        MathOperation multiplication = (a, b) -> a * b;
        MathOperation division = (a, b) -> a / b;
        
        // Performing operations
        System.out.println("Addition: " + addition.operation(x, y));
        System.out.println("Subtraction: " + subtraction.operation(x, y));
        System.out.println("Multiplication: " + multiplication.operation(x, y));
        System.out.println("Division: " + division.operation(x, y));
    }
}
