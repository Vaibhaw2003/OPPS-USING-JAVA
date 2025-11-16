class Animal {
    void eat(){
         System.out.println("animal eat food");
    } 
}
 class Snake extends Animal {
    void poo(){
        System.out.println("snake can pooo");
    } 
}


public class supers {
    public static void main(String[] args){
        Snake s = new Snake();
        s.eat();
        s.poo();
    }
}  
