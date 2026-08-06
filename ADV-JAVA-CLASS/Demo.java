//----------- ADVANCED JAVA CLASS ----------

// --- 1. Average of 3 numbers --------

// import java.util.*;

// class Demo {
//     static double average(int a, int b, int c) {
//         return (a + b + c) / 3;
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("enter the number : ");
//         int a = sc.nextInt(),
//          b = sc.nextInt(),
//          c = sc.nextInt();

//         System.out.println("Average = " + average(a, b, c));
//     }
// }

//---- 2. Sum of odd numbers from 1 to n ----------

// class Demo {
//     static int sumOdd(int n) {
//         int sum = 0;
//         for(int i = 1; i <= n; i += 2) {
//             sum += i;
//         }
//         return sum;
//     }
//     public static void main(String[] args) {
//         System.out.println(sumOdd(10));
//     }
// }

//-------- 3. Greater of two numbers ------

// class Demo {
//     static int max(int a, int b) {
//         return (a > b) ? a : b;
//     }

//     public static void main(String[] args) {
//         System.out.println(max(10, 20));
//     }
// }

//------ 4. Circumference of circle --------

// class Demo {
//     static double circumference(double r) {
//         return 2 * Math.PI * r;
//     }

//     public static void main(String[] args) {
//         System.out.println(circumference(5));
//     }
// }

//-------- 5. Voting eligibility ---------

// class Demo {
//     static boolean isEligible(int age) {
//         return age > 18;
//     }

//     public static void main(String[] args) {
//         System.out.println(isEligible(20));
//     }
// }

//----- 6. Infinite loop using do-while -------

// class Demo {
//     public static void main(String[] args) {
//         do {
//             System.out.println("Infinite Loop");
//         } while(true);
//     }
// }

//----- 7. Count positive, negative & zero --------

// import java.util.*;

// class Demo {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int pos = 0, neg = 0, zero = 0;

//         char choice;
//         do {
//             System.out.println("enter the number : ");
//             int num = sc.nextInt();

//             if(num > 0) pos++;
//             else if(num < 0) neg++;
//             else zero++;

//             System.out.println("Continue? (y/n)");
//             choice = sc.next().charAt(0);

//         } while(choice == 'y');

//         System.out.println("Positive: " + pos);
//         System.out.println("Negative: " + neg);
//         System.out.println("Zero: " + zero);
//     }
// }

//--------- 8. Power function (x^n) ----

// class Demo {
//     static int power(int x, int n) {
//         int result = 1;
//         for(int i = 0; i < n; i++) {
//             result *= x;
//         }
//         return result;
//     }

//     public static void main(String[] args) {
//         System.out.println(power(2, 3));
//     }
// }

//----- 9. GCD of 2 numbers -------

// class Demo {
//     static int gcd(int a, int b) {
//         while(b != 0) {
//             int temp = b;
//             b = a % b;
//             a = temp;
//         }
//         return a;
//     }
//     public static void main(String[] args) {
//         System.out.println(gcd(12, 18));
//     }
// }

//------ 10. Fibonacci series -----

// class Demo {
//     static void fibonacci(int n) {
//         int a = 0, b = 1;
//         for(int i = 0; i < n; i++) {
//             System.out.print(a + " ");
//             int next = a + b;
//             a = b;
//             b = next;
//         }
//     }
//     public static void main(String[] args) {
//         fibonacci(10);
//     }
// }



//--------- Lambda Expression to check if a number is even ---------

// import java.util.function.Predicate;
// class Demo{
//     public static void main(String[] args) {
//         System.out.println("Hello, World!");
//         Predicate<Integer> isEven = x -> x % 2 == 0;
//         System.out.println("Is 4 even? " + isEven.test(4));
//     }
// }



