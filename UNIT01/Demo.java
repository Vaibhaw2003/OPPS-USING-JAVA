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


import java.util.Scanner;
class Demo {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter marks: ");
        int marks = sc.nextInt();

        if (marks>=90) {
            System.out.println("pass");
        }else{
            System.out.println("failed");
        }
    }
}

