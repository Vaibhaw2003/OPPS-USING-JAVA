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

//----- overloading---------Compile-Time Polymorphism (Static Polymorphism).
 
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


//----- overriding --------- Runtime Polymorphism (Dynamic Polymorphism)

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


// ---------- ANOTHER EXAMPLE OF OVERRIDING --------

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

//---------- Encapsulation (Data Hiding)---------

// class Student{
//     private  int roll ;

//     public void setroll( int roll){
//         this.roll = roll;
//     }

//     public int roll (){
//         return roll;
//     }
// }

// public class  Demo {
//     public static void main(String[] args) {
//         Student s = new Student();
//          s.setroll(238);          // value set
//         System.out.println(s.roll());  // value print
//     }
// }

//-----------  CONSTRUCTORE --------

// class Student {
//     Student(){
//         System.out.println("Object Created");

//     }
//     String name;
//     public void info(){
//         System.out.println(this.name);
//     }
// }

// class Demo{
//     public static void main(String[] args) {
//         Student s = new Student();
//         s.name = "vaibhaw";
//         s.info();
//         //System.out.println(s.name);
        
//     }
// }


//-----------  ANOTHER EXAMPLE OF CONSTRUCTORE --------

// class Student {
//     Student(String name){
//         this.name = name;
//     }
//     String name;
//     public void info(){
//         System.out.println(this.name);
//     }
// }

// class Demo{
//     public static void main(String[] args) {
//         Student s = new Student("vaibhaw");
//         s.info();
//         //System.out.println(s.name);
        
//     }
// }


//-----------  ANOTHER EXAMPLE OF CONSTRUCTORE --------

// class Student {
//     Student(String name, int roll){
//         this.name = name;
//         this.roll = roll;
//     }
//     String name;
//     int roll;
//     public void info(){
//         System.out.println(this.name);
//         System.out.println(this.roll);
//     }
// }
// class Demo{
//     public static void main(String[] args) {
//         Student s = new Student("vaibhaw", 238);
//         s.info();
//         //System.out.println(s.name);
        
//     }
// }


//----------- Abstraction (Hiding Complexity) ---------

// abstract class Shape{
//     abstract void area();
// }
// class Circle extends Shape{
//     int r;
//     Circle(int r){
//         this.r = r;
//     }
//     @Override
//     void area() {
//         System.out.println("Area of circle : " + 3.14*r*r);
//     }
// }

// class Demo{
//     public static void main(String[] args) {
//         Circle c = new Circle(5);
//         c.area();
//     }
// }


//--------------- INTERFACE ---------

// interface Drawable{
//     void draw();
// }
// class Circle implements Drawable{
//     @Override
//     public void draw() {
//         System.out.println("Drawing a circle");
//     }
// }   
// class Demo{
//     public static void main(String[] args) {
//         Circle c = new Circle();
//         c.draw();
//     }
// }

//------------------ ANOTHER EXAMPLE OF INTERFACE ---------

// interface Drawable{
//     void draw();
// }
// class Circle implements Drawable{
//     @Override
//     public void draw() {
//         System.out.println("Drawing a circle");
//     }
// }
// class Rectangle implements Drawable{
//     @Override
//     public void draw() {
//         System.out.println("Drawing a rectangle");
//     }
// }
// class Demo{
//     public static void main(String[] args) {
//         Circle c = new Circle();
//         Rectangle r = new Rectangle();
//         c.draw();
//         r.draw();
//     }
// }


//------------------ ANOTHER EXAMPLE OF INTERFACE ---------

// interface Animal{
//     void eat();
//     void sleep();
// }

// class Dog implements Animal{
//     @Override
//     public void eat() {
//         System.out.println("Dog can eat food");
//     }
//     public void sleep() {
//         System.out.println("Dog must have sleep");
//     }
// }

// class Demo{
//     public static void main(String[] args) {
//         Dog d = new Dog();
//         d.eat();
//         d.sleep();
//     }
// }


//------------------ ANOTHER EXAMPLE OF POLYMORPHISM ---------

// class Animal{
//     void eat(){
//         System.out.println("Animal can eat food");
//     }
// }
// class Dog extends Animal{
//     @Override
//     void eat(){
//         System.out.println("Dog can eat food");
//     }
//     void sleep(){
//         System.out.println("Dog must have sleep");
//     }
// }

// class Demo{
//     public static void main(String[] args) {
//         Dog d = new Dog();
//         d.eat();
//         d.sleep();
//     }
// }

//------------------- ANOTHER EXAMPLE OF POLYMORPHISM ---------

// class Calculator{
//     int sum (int a, int b){
//         return a +b;
//     }

//     double sum (double a, double b){
//         return a + b;
//     }
//     int sum (int a, int b, int c){
//         return a + b + c;
//     }
// }

// class Demo{
//     public static void main(String[] args) {
//         Calculator c  = new Calculator();
//         System.out.println(c.sum( 3, 5));
//         System.out.println(c.sum(2.3, 4.4));
//         System.out.println(c.sum(1, 2, 3));
//     }
// }
