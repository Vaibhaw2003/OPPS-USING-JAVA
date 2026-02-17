import java.util.Scanner;

class Demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number : ");
        int num1 = sc.nextInt();
        System.out.println("enter the second numbe : ");
        int num2 =sc.nextInt();

        int sum = num1 + num2;
        int mul = num1 * num2;

        System.out.println("sum : "+ sum);
        System.out.println("mul :" + mul);

    }
}

