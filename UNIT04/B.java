import java.util.*;
import java.lang.*;


//-----------MULTITHREADING---------

// BY -IMPLEMENTING EXTENDING THREAD -----
/*   
class A extends Thread{
    @Override
    public void run(){ 
        try {
               for( int i = 0 ; i<= 5 ; i++)
        {
            System.out.println("thise is threds");
            Thread.sleep(1000);
        }
            
        } catch (Exception e) {
            System.out.println("ERROR");
        }
    }
}

class B {
    public static void main(String[] arg){
        A t = new A();
        t.start();  // es child thread ka ak hi kam hai apne thred ko run karna.

        for(int j = 1; j<=5; j++){
            System.out.println("harsh singh");
        }
    }
}
     */

// BY ---  IMPLEMENTING RUNNABLE THREDS.
/*   
class A implements Runnable {
    public void run(){
        System.out.println("vaibhaw singh is s good person as you know that.");
    }
}

class B {
    public static void main(String[] args){
        A r = new A();
        Thread t = new Thread(r);
        t.start();
    }
}
    */

// ----02 ---example----
/*   
class G implements Runnable {
    public void run(){
        for(int i = 1; i<=5 ; i++){
            System.out.println("vaibhaw singh ");
        }
    } 
}


public class B {
    public static void main(String[] args){
        G r = new G();
        Thread t = new Thread(r);
        t.start();
        for( int i = 1; i<=5; i++){
            System.out.println("jay shri ram");
        }
    }
}
    */
// ------- THREAD SCHEDULAR ----------

class A extends Thread{
    public void run(){
        String n =Thread.currentThread().getName();
        System.out.println(n);
    }
}

class B {
    public static void main(String[] args){
        A t1 = new A();
        A t2 = new A();
        A t3 = new A();

        t1.setName("marco");
        t2.setName("harsh singh");
        t3.setName("vaibhaw singh");

        t1.start();
        t2.start();
        t3.start();
    }
}
