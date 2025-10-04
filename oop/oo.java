//  class Pen {
//     String  color;
//     int  tip;
//     String  brand;

//     void write() {
//         System.out.println("writing something");
//     }
//     public void pirntcolor(){
//         System.out.println(this.color);
//     }
//     public void pirntbrand(){
//         System.out.println(this.brand);
//     }

// }


//  class Student{
//     String name;
//     int age;
//     int rollno;

//     public void study(){
//         System.out.println("studying");
//     }
//     public void printname(){
//         System.out.println(this.name);
//     }
//     public void printage(){
//         System.out.println(this.age);
//     }
// }



// public class mains {
//     public static void main(String[] args) {
//         Pen pen1 = new Pen();
//         pen1.color = "blue";
//         pen1.tip = 5;
//         pen1.brand = "cello";
//         pen1.write();
//         pen1.pirntcolor();
//         pen1.pirntbrand();
        

//         Pen pen2 = new Pen();
//         pen2.color = "black";
//         pen2.tip = 6;
//         pen2.brand = "reynolds";
//         pen2.write();
//         pen2.pirntcolor();
//         pen2.pirntbrand();


//         Student student1 = new Student();
//         student1.name = "pk";
//         student1.age = 20;
//         student1.rollno =52;
//         student1.study();
//         student1.printname();
//         student1.printage();



//     }
// }





// ----------POLIMORPHISM---------


//   class Student{
//     String name;
//     int age;
//     int rollno;

//     public void Printinfo (String name){
//         System.out.println(name);
//     }

//     public void Printinfo (int age){
//         System.out.println(age);
//     }

//     public void Printinfo (String name, int age){
//         System.out.println(name + " " + age);
//     }
    
//  }



//  public class mains {

//     public static void main(String[] args) {
//         Student student1 = new Student();
//         student1.name= "vaibhaw singh";
//         student1.age=22;
//         student1.rollno=52;
        

//         student1.Printinfo(student1.name , student1.age); // function overloading
//     }
// }



// -------INHARITANCE------

//   class Shape{
//     String color;
//   }

//    class Triangle extends Shape{
//     public void print( String color){
//       System.out.println(color);
//     }
    
//  }

//  public class oo {
//   public static void main (String[] args){
//     Triangle t1 = new Triangle();
//    t1 .color ="red";


//    t1.print(t1.color);

//   }
//  }





//-------MULTILEVEL INHARITANCE------


// class Shape{
//   String color;

// }

// class Triangle extends Shape{
//   String brand;

// }

// class Circal extends Triangle{
//   int price;
// }


// public class oo {

//   public static void main(String[] args){


//   }
// }



//--------HIERARICHAL INHARITANCE-----


// class Shape{
//   String color;

// }
// class Triangle extends Shape{
//   String brand;

// }

// class Circal extends Shape{
//   int price;

// }

// public class oo {
//   public static void main(String[] args){
//     Shape s1 = new Shape();
//     s1.color = "red";


//   }
// }



// ------HYBRID INHERITANCE------






// -----------INCAPSULATION ---------
// PACKAGE =  collection of same types of objects.
// EXCESS MODIFIRE = PUBLIC , PROTECTIV , PRIVATE, DEFAULT.
// ENCAPTULATION = DATA AND FUNCTION COMBINE TO EACH OTHER.
// ABTRACTION = IMPORTANT CHIJ USER KO DIKHA DENA NON IMPORTANT CHIJ USER SE CHHUPA LENA.



abstract class Animal{
  abstract void walk(); // abtract class can be define by abstact key words.
  public void eat(){
    System.out.println("animal can eat somthing");
  }
}

class Horse extends Animal{
  Horse(){
    System.out.println("creat a contructor");
  }
  public void walk(){
    System.out.println("wall on 4 legs");

  }
}

class Chiken extends Animal{
  public void walk(){
    System.out.println("it also have 4 legs");
  }
}


public class oo {
  public static void main(String[] args){
    Horse h1 = new Horse();
    h1.walk();
    h1.eat();
   
  }
}





