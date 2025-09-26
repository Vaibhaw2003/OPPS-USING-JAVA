// public class person{
//     public static void main(String[] args){
//         int a =44;
//         int b =44;
       

        
//         if (a>b) {
//             System.out.println("a is greater");     

          
//             }
//          else if(a==b){
//                   System.out.println("a is equal");    

//             }

//         else{
//             System.out.println("b is greater");
//         }
//     }
    
// }


// import java.util.Scanner;

// public class person {

//     public static void main(String[] args ){

// int age;

// System.out.println("enter your age : ");
// Scanner obj = new Scanner(System.in);
// age=obj.nextInt();

// System.out.println("your age is "+age);



//     }
// }


import java.util.Scanner;
import java.util.Arrays;

public class person {

    public static void main(String[] args){

        int arra[]=new int[5];

        System.out.println("enter araay element: ");
        Scanner obj = new Scanner(System.in);
       for(int i=0; i<5 ; i++){
        arra[i]=obj.nextInt();
         System.out.println(arra);
       }
    }
}