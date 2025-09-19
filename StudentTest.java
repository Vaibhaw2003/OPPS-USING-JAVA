// Student.java
class Student {
    int rollNo;
    String name;
    int age;

    // Constructor
    Student(int rollNo, String name, int age) {
        this.rollNo = rollNo;
        this.name = name;
        this.age = age;
    }

    // Method to display student details
    void displayInfo() {
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}


public class StudentTest {
    public static void main(String[] args) {
        // Creating a Student object
        Student student = new Student(1, "Alice", 20);
        // Displaying student details
        student.displayInfo();  
    }
}