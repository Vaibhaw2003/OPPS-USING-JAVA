//--------- unit 02 ---------

//--------- Creating Streams ---------

// import java.util.*;
// import java.util.stream.*;
// import java.nio.file.*;
// import java.io.IOException;

// public class Demo {

//     public static void main(String[] args) throws IOException {

//         // 1️⃣ From Collection (List)
//         List<String> names = Arrays.asList("Don", "Raj", "Aman", "Vijay");
//         System.out.println("Stream from List:");
//         names.stream().forEach(System.out::println);

//         // 2️⃣ From Set
//         Set<Integer> numbers = new HashSet<>(Arrays.asList(10, 20, 30));
//         System.out.println("\nStream from Set:");
//         numbers.stream().forEach(System.out::println);

//         // 3️⃣ From Array
//         int[] arr = {1, 2, 3, 4, 5};
//         System.out.println("\nStream from Array:");
//         Arrays.stream(arr).forEach(System.out::println);

//         // 4️⃣ Using Stream.of()
//         System.out.println("\nStream using Stream.of():");
//         Stream.of("Java", "Python", "C++")
//               .forEach(System.out::println);

//         // 5️⃣ Using Stream.generate() (Infinite Stream)
//         System.out.println("\nStream.generate():");
//         Stream.generate(() -> "Hello")
//               .limit(3)
//               .forEach(System.out::println);

//         // 6️⃣ Using Stream.iterate()
//         System.out.println("\nStream.iterate():");
//         Stream.iterate(1, n -> n + 2)
//               .limit(5)
//               .forEach(System.out::println);

//         // 7️⃣ Using Files.lines() (From File)
//         // (File must exist in project folder)
//         System.out.println("\nStream from File:");
//         Path path = Paths.get("sample.txt");
//         if(Files.exists(path)) {
//             Files.lines(path).forEach(System.out::println);
//         } else {
//             System.out.println("sample.txt file not found.");
//         }

//         // 8️⃣ Using Random numbers
//         System.out.println("\nRandom Stream:");
//         new Random().ints(5)
//                     .forEach(System.out::println);
//     }
// }


//--------- Filtering Streams ---------

// import java.util.List;

// class Demo{
//     public static void main(String[] args) {
//         List<String> names = List.of("Don", "Raj", "Aman", "Vijay");
//         names.stream().forEach(System.out::println);

//         List<Integer> numbers = List.of(10, 20, 30);
//         numbers.stream().forEach(System.out::println);

//         List<Integer>arr = List.of(1, 2, 3, 4, 5);
//         arr.stream().filter(n -> n % 2 == 0).forEach(System.out::println);
//     }
// }

//--------- Mapping Streams ---------

// import java.util.List;

// class Demo{
//     public static void main(String[] args) {
//         List<String> names = List.of("Don", "Raj", "Aman", "Vijay");
//         names.stream().map(n -> n.toUpperCase()).forEach(System.out::println);

//         List<Integer> numbers = List.of(129, 20, 30);
//         numbers.stream().map(n -> n%2==0).forEach(System.out::println);

//         List<Integer>arr = List.of(1, 2, 3, 4, 5);
//         arr.stream().map(n -> n * n).forEach(System.out::println);

//         List<String> names2 = List.of("Don", "Raj", "Aman", "Vijay");
//         names2.stream().map(n -> n.length()).forEach(System.out::println);
//     }
// }

//--------- Reducing Streams ---------

// import java.util.List;
// class Demo{
//     public static void main(String[] args) {
//         List<Integer> numbers = List.of(10, 20, 30);
//         numbers.stream().forEach(System.out::println);

//         List<Integer>arr = List.of(1, 2, 3, 4, 5);
//         int sum = arr.stream().reduce(0, (a, b) -> a + b);
//         System.out.println("Sum: " + sum);

//             int product = arr.stream().reduce(1, (a, b) -> a * b);
//         System.out.println("Product: " + product);

//         int max = arr.stream().reduce(arr.get(0), (a, b) -> a > b ? a : b);
//         System.out.println("Max: " + max);

//        int div = arr.stream().reduce(2,(a,c )-> a/c);
//        System.out.println("div:"+ div);

//     }
// }