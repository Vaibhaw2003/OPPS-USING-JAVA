
package oop;

  class pen {
    String  color;
    int  tip;
    String  brand;
    void write() {
        System.out.println("writing something");
    }
}

public class main {

    public static void main(String[] args) {
        pen pen1 = new pen ();
        pen1.color = "blue";
        pen1.tip = 5;   
        pen1.write();
    }
}
