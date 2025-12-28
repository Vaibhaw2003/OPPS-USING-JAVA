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

import java.util.Scanner;

class Demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter marks (0 - 100): ");
        int marks = sc.nextInt();

        if (marks < 0 || marks > 100) {
            System.out.println("Invalid marks");
            return;
        }

        // Divide marks by 10 for switch-case
        switch (marks / 10) {
            case 10:
            case 9:
                System.out.println("Grade: A");
                break;

            case 8:
                System.out.println("Grade: B");
                break;

            case 7:
                System.out.println("Grade: C");
                break;

            case 6:
                System.out.println("Grade: D");
                break;

            default:
                System.out.println("Grade: Fail");
        }
    }
}


