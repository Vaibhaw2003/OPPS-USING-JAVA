class copy{
    String name;
    int price;
    String brand;
    String color;

    public void write(){
        System.out.println("welcome brother");
    }

    public void info(){
        System.out.println(" buy copy");
    }

    public void name(){
        System.out.println(this.name);
    }
}

public class poly {
    public static void main(String[] args){
        copy c1 =new copy();
        c1.name = "plane copy";
        c1.price = 500;
        c1.brand =" classmate";
        c1.color = "white";

        copy c2 = new copy();
        c2.name = "hidi copy";
        c2.brand = "apshra";
        c2.color = " green";
        c2.price =600;


        c1.write();
        c2.info();

        c1.name();
        c2.name();


    }
}