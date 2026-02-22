//------------- OOPS ----------
//Core OOPs Concepts (4 Pillars)

// Encapsulation (Data Hiding)  ||  Inheritance (Code Reusability) || Polymorphism (Many Forms) || Abstraction (Hiding Complexity) .

// ------------ Inharitance ----------

// class Animal{
//     void eat(){
//         System.out.println("Animal can eat food");
//     }
// }

// class Dog extends Animal{
//     void sleep(){
//         System.out.println("Animal must have sleep ");
//     }
// }
// class Demo {
//     public static void main(String[] args) {
//         Dog d = new Dog();
//         d.eat();
//         d.sleep();
//     }
// }

//--------- Polymorphism ------------


//----- overloading---------
 
// class calculatore{
//     int sum (int a, int b){
//         return a +b;
//     }

//     double sum (double a, double b){
//         return a + b;
//     }
// }

// class Demo{
//     public static void main(String[] args) {
//         calculatore c  = new calculatore();
//         c.sum( 3, 5);
//         c.sum(2.3, 4.4);
        
        
//     }
// }


//----- overriding ---------

// class sum {
//     void add( ){
//         System.out.println("vaibhaw singh");
//     }
// }
// class cal extends sum{
//     @Override
//     void add(){ 
//         System.out.println("my name is marco");
//     }
// }

// class Demo{
//     public static void main(String[] args) {
//         cal c = new cal();
//         c.add();
//     }
// }


// ---------- NOTHER EXAMPLE OF OVERRIDING --------
// class mul{
//     int mul (int a, int b){
//         return 0;
//     }
// }
// class add extends mul{
//     @Override

//     int mul (int a, int b){
//         return a*b;
//     }
//     int add( int a, int b){
//         return a +b;

//     }
// }

// class Demo{
//     public static void main(String[] args){
//         add a=  new add();
//         System.out.println("addition : " + a.add(23, 45));
//         System.out.println("multiply :  "  + a.mul(34, 3));
//     }
// }
