//-------------- OOPS REVISION ------------------

//-------- CLASS AND OBJECTS ---------

// class Student{
//     String name = "vaibhaw";
//     int age = 20;
//     String course = "BCA";
// }

// class Demo{
//     public static void main(String[] args) {
//         Student s = new Student();

//         System.out.println("Name: " + s.name);
//         System.out.println("Age: " + s.age);
//         System.out.println("Course: " + s.course);
//     }
// }

//-------- CONSTRUCTOR ---------
// a constructor is a special method that is called when an object is instantiated. It is used to initialize the object.

class Student{
    String name;
    int age;
    String course;

    // constructor
    Student(String name, int age, String course){
        this.name = name;
        this.age = age;
        this.course = course;
    }
}
//
class Demo {
    public static void main(String[] args) {
        Student s = new Student("vaibhaw", 20, "BCA");

        System.out.println("Name: " + s.name);
        System.out.println("Age: " + s.age);
        System.out.println("Course: " + s.course);
    }
}





//-------- inheritance ---------
//-------- abstraction ---------
//-------- encapsulation ---------
//-------- polymorphism ---------