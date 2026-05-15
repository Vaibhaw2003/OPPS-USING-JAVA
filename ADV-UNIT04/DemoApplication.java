//-------- unit04/----  Spring Framework  --------
//Spring Framework ek powerful Java framework hai jo enterprise applications banane ke liye use hota hai.


// Car car = new Car();
// Engine engine = new Engine();
// car.setEngine(engine);

// @Component
// class Engine {}

// @Component
// class Car {

//     @Autowired
//     private Engine engine;

//     public void drive() {
//         System.out.println("Car is running...");
//     }
// }


//-------- Spring Boot --------

// import org.springframework.boot.SpringApplication;
// import org.springframework.boot.autoconfigure.SpringBootApplication;
// import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.PostMapping;
// import org.springframework.web.bind.annotation.RequestBody;
// import org.springframework.web.bind.annotation.RestController;
// @SpringBootApplication
// public class DemoApplication {
//     public static void main(String[] args) {
//         SpringApplication.run(DemoApplication.class, args);
//     }

//     @GetMapping("/hello")
//     public String sayHello() {
//         return "Hello, World!";
//     }

//     @PostMapping("/greet")
//     public String greet(@RequestBody String name) {
//         return "Hello, " + name + "!";  
//     }
// }
