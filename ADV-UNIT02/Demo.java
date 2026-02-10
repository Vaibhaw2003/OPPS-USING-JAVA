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

