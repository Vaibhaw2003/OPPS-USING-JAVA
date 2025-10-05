// -----ALL ABOUT OBJECT AND CLASSES-----

// class copy{
//     String name;
//     int price;
//     String brand;
//     String color;

//     public void write(){
//         System.out.println("welcome brother");
//     }

//     public void info(){
//         System.out.println(" buy copy");
//     }

//     public void name(){
//         System.out.println(this.name);
//     }

//     public void price(){
//         System.out.println(this.price);
//     }
// }

// public class poly {
//     public static void main(String[] args){
//         copy c1 =new copy();
//         c1.name = "plane copy";
//         c1.price = 500;
//         c1.brand =" classmate";
//         c1.color = "white";

//         copy c2 = new copy();
//         c2.name = "hidi copy";
//         c2.brand = "apshra";
//         c2.color = " green";
//         c2.price =600;

//         c1.write();
//         c2.info();
//         c2.price();
//         c1.price();

//     }
// }



// -----CLASSES AND OBJECTS----

// class Student{
//     String name ;
//     int age ;
//     int rollno;
//     int marks;

//     public void printinfo(){
//         System.out.println(this.name);
//         System.out.println(this.age);
//         System.out.println(this.rollno );
//     }
// }
// public class poly {
//     public static void main(String[] arg){
//         Student std1 = new Student();
//         std1.name = " vaibhaw singh";
//         std1.age = 22;
//         std1.marks = 90;
//         std1.rollno = 420;

//         std1.printinfo();
//     } 
// }



// -------CONTRUCTORE--------

// CONTRUCTORE OR CLASS KA NAME SAME HOTA HAI.
// THEIR ARE 3 TYPES  OF CONTRUCTORE.( IT MEANS KUCHH BANANAN YA CREAT KARNA)
// 1 = NON- PERAMITERISED(eshke under ehs () bracket me kuchh pass nhi karte),
// 2 = PERAMETRISED(jisme () esh bracket ke undar kuchh parameter pass karte hai)

// EXAMPLE ---

class Apple{
    String name;
    int price;
    String model;

    public void printinfo(){
        System.out.println(this.name);
        System.out.println(this.model);
        System.out.println(this.price);
    }

    // Apple(){
    //     System.out.println("new model launched soon"); // contructore non-parametrised
    // }

    Apple(String name, int price, String model){
        this.name = name;
        this.model= model;
        this.price = price;  
    }
}
public class Innerpoly {
    public static void main(String[] args){

        Apple app1 = new Apple( "harsh singh",15000,"latest");  // yaha pe parameter me value dena hai.

        // app1.name = " iphne 13";
        // app1.model =" iphone";

        app1.printinfo();

    }  
}