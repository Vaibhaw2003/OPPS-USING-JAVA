//-------- unit05/----  Spring Boot  --------
//Spring Boot ek extension hai Spring Framework ka, jo application development ko aur bhi asaan banata hai. Isme embedded servers, auto-configuration, aur production-ready features hote hain.
//👉 Spring Boot = Spring Framework ka simplified + auto-configured version

//--------- Create Simple REST API --------

@RestController
public class Demo{

    @GetMapping("/hello")
    public String sayHello() {
        return "Hello Don 🚀";
    }
}
