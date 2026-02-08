//-------- unit04/----  Spring Framework  --------
//Spring Framework ek powerful Java framework hai jo enterprise applications banane ke liye use hota hai.


Car car = new Car();
Engine engine = new Engine();
car.setEngine(engine);

@Component
class Engine {}

@Component
class Car {

    @Autowired
    private Engine engine;

    public void drive() {
        System.out.println("Car is running...");
    }
}
