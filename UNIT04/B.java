import java.util.*;
import java.lang.*;


//-----------MULTITHREADING---------

// BY - EXTENDING THREAD -----

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
