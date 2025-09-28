package OBJECTS;

class Pen{
    String color ;
    String brand;
    public void write(){
        System.out.println("writing something");
    }
}

class Oops{
    public static void main(String args[]){
        Pen p =new Pen();
        p.color="blue";
        p.brand="cello";
        p.write();
        System.out.println(p.color);
        System.out.println(p.brand);
    }



}