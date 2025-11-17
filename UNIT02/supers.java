// class Animal {
//     void eat(){
//          System.out.println("animal eat food");
//     } 
// }
//  class Snake extends Animal {
//     void poo(){
//         System.out.println("snake can pooo");
//     } 
// }


// public class supers {
//     public static void main(String[] args){
//         Snake s = new Snake();
//         s.eat();
//         s.poo();
//     }
// }  


//Methode overloading....

// class Calculatore {
//     int add(int a, int b){
//         return a + b;
//     }
//     float add(float a, float b){
//         return a + b;
//     }
//     double add ( double a,  double b){
//         return a + b;
//     }
// }
// public class supers {
//     public static void main(String[] args){
//         Calculatore c = new Calculatore();
//         System.out.println(c.add(12, 200)); 
//         System.out.println(c.add(1.2, 1.33));
//         System.out.println(c.add(1.2, 13.3));
//     }
// }


//Method OVERRIDING.....

// class Animal {
//     void eat(){
//         System.out.println("animal can eat");
//     }
// }

// class Dog extends Animal {
//     @Override
//     void eat(){
//         System.out.println("dog can also eat");
//     }
// }

// public class supers {
//     public static void main(String[] arg){
//         Animal a = new Dog();

//         a.eat();
//      }
// }  


// INCAPSULATION.....
/*class Bank {
    Private int bal = 1000;

    public int
}
 */





// ABTRACTION ......

// abstract class Animal {
//    abstract void sound();
//    void eat(){
//     System.out.println("animal is eating");
//    }  
// }

// class Dog extends Animal{
//     void sound(){
//         System.out.println("animal can speek");
//     }
// }

// public class supers {
//     public static void main(String[] args){
//         Animal a = new Dog();
//         a.eat();
//         a.sound();
//     }   
// }

//INTERFACE........

 interface Animal {
    void sound();
}


class Dog implements Animal{
   public void sound(){
        System.out.println("dog are braks ");
    }
} 

 interface flyable {
    void fly();    
}

class Bird implements flyable{
    public void fly(){
        System.out.println("Bird is flying");
    }
}



public class supers {
    public static void main(String[] args){
        flyable obj = new Bird();
        Animal a = new Dog();
        obj.fly();
        a.sound();
    }  
}




