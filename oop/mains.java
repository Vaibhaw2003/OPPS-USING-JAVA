 class Pen {
    String  color;
    int  tip;
    String  brand;

    void write() {
        System.out.println("writing something");
    }
    public void pirntcolor(){
        System.out.println(this.color);
    }
    public void pirntbrand(){
        System.out.println(this.brand);
    }

}


 class Student{
    String name;
    int age;
    int rollno;

    public void study(){
        System.out.println("studying");
    }
    public void printname(){
        System.out.println(this.name);
    }
    public void printage(){
        System.out.println(this.age);
    }
}



public class mains {
    public static void main(String[] args) {
        Pen pen1 = new Pen();
        pen1.color = "blue";
        pen1.tip = 5;
        pen1.brand = "cello";
        pen1.write();
        pen1.pirntcolor();
        pen1.pirntbrand();
        

        Pen pen2 = new Pen();
        pen2.color = "black";
        pen2.tip = 6;
        pen2.brand = "reynolds";
        pen2.write();
        pen2.pirntcolor();
        pen2.pirntbrand();


        Student student1 = new Student();
        student1.name = "pk";
        student1.age = 20;
        student1.rollno =52;
        student1.study();
        student1.printname();
        student1.printage();



    }
}


