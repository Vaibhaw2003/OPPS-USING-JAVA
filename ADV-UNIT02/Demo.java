//--------- unit 02 ---------

//--------- Creating Streams ---------

// import java.util.*;
// import java.util.stream.*;
// import java.nio.file.*;
// import java.io.IOException;

// public class Demo {

//     public static void main(String[] args) throws IOException {

//           From Collection (List)
//         List<String> names = Arrays.asList("Don", "Raj", "Aman", "Vijay");
//         System.out.println("Stream from List:");
//         names.stream().forEach(System.out::println);

//           From Set
//         Set<Integer> numbers = new HashSet<>(Arrays.asList(10, 20, 30));
//         System.out.println("\nStream from Set:");
//         numbers.stream().forEach(System.out::println);

//           From Array
//         int[] arr = {1, 2, 3, 4, 5};
//         System.out.println("\nStream from Array:");
//         Arrays.stream(arr).forEach(System.out::println);

//           Using Stream.of()
//         System.out.println("\nStream using Stream.of():");
//         Stream.of("Java", "Python", "C++")
//               .forEach(System.out::println);

//          Using Stream.generate() (Infinite Stream)
//         System.out.println("\nStream.generate():");
//         Stream.generate(() -> "Hello")
//               .limit(3)
//               .forEach(System.out::println);

//           Using Stream.iterate()
//         System.out.println("\nStream.iterate():");
//         Stream.iterate(1, n -> n + 2)
//               .limit(5)
//               .forEach(System.out::println);

//           Using Files.lines() (From File)
//          (File must exist in project folder)
//         System.out.println("\nStream from File:");
//         Path path = Paths.get("sample.txt");
//         if(Files.exists(path)) {
//             Files.lines(path).forEach(System.out::println);
//         } else {
//             System.out.println("sample.txt file not found.");
//         }

//         
//         System.out.println("\nRandom Stream:");
//         new Random().ints(5)
//                     .forEach(System.out::println);
//     }
// }


//--------- Filtering Streams ---------(Filtering streams is used to filter the elements of the stream using a predicate such as filter, distinct, limit, skip etc.)

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

//--------- Mapping Streams ---------(Mapping streams is used to transform the elements of the stream using a function such as map, flatMap etc.)

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

//--------- Reducing Streams ---------(Reducing streams is used to reduce the elements of the stream to a single value using a binary operator such as sum, product, max, min etc.)

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

//--------- Sorting Streams ---------(Sorting streams is used to sort the elements of the stream in natural order or custom order)

// import java.util.List;
// class Demo{
//     public static void main(String[] args) {
//         List<Integer> num = List.of(1,2,3,4,5);
//        int div= num.stream().reduce(1, (a,b)-> a*b);
//        System.out.println("div:"+ div);

//        int sum = num.stream().reduce(0, (a,b)-> a+b);
//        System.out.println("sum:"+ sum);
//        num.stream().sorted((a,b)-> b-a).forEach(System.out::println);
//     }
// }

//--------- Collecting Streams ---------(Collecting streams is used to collect the elements of the stream into a collection such as List, Set, Map etc.)

// import java.util.List;
// class Demo{
//     public static void main(String[] args) {
//             List<Integer> num = List.of(1,2,3,4,5);
//             int div= num.stream().reduce(1, (a,b)-> a*b);
//             System.out.println("div:"+ div);
    
//             int sum = num.stream().reduce(0, (a,b)-> a+b);
//             System.out.println("sum:"+ sum);

//             int sub = num.stream().reduce(2,(a,b)-> a-b); // reduce is used to get the difference of all numbers in the stream starting with 2 as the initial value
//             System.out.println("sub:"+ sub);
//     }
// }

//--------- Limiting Streams ---------(Limiting streams is used to limit the number of elements in the stream)

// import java.util.List;
// import java.util.stream.Stream;
// class Demo{
//     public static void main(String[] args) {
//         List<Integer> num = List.of(1,2,3,4,5);
//         int even = num.stream().filter(n -> n%2==0).reduce(0, (a,b)-> a+b); // filter is used to get only even numbers and reduce is used to get the sum of even numbers
//         System.out.println("even:"+ even);

//         Stream<Integer> limit = Stream.iterate(0, n -> n+1).limit(100);// infinite stream with limit use for loop to print
//         System.out.println("limit:" + limit.count()); // count is used to get the number of elements in the stream

//     }
// }


//--------- Combining Streams ---------(Combining streams is used to combine two or more streams into one stream)

// import java.util.List;
// class Demo{
//     public static void main(String[] args) {
//         List<Integer> num = List.of(1,2,3,4,5);
        
//         int sub = num.stream().reduce(2,(a,b)-> a-b); // reduce is used to get the difference of all numbers in the stream starting with 2 as the initial value
//         System.out.println("sub:"+ sub);

//         Stream<String> Limit = Stream.generate(() -> "hello").limit(100);// generate is used to create an infinite stream of "hello" and limit is used to limit the stream to 100 elements
//         System.out.println("limit:" + Limit.count()); // count is used to get the number of elements in the stream


//         List<Integer> evenNumbers = num.stream()
//                             .filter(n -> n % 2 == 0)
//                             .toList();

//         System.out.println("Even numbers: " + evenNumbers);

//     }
// }



//--------- forEach ---------(forEach is used to perform an action for each element of the stream)

// import java.util.List;
// import java.util.stream.Stream;

// class Demo{
//     public static void main(String[] args) {
//         System.out.println("Hello World");
//         List<Integer> num = List.of(1,2,3,4,5);
//         int sub = num.stream().filter(n -> n%2==0).reduce(0, (a,b) -> a+b);
//         System.out.println("Sum of even numbers: " + sub);

//         Stream<Integer> sq = num.stream().map(n -> n*n);
//         sq.forEach(System.out::println);

//             Stream<Integer> limit = Stream.iterate(0, n -> n+1)
//             .skip(1)
//             .sorted()
//             .sorted((a,b) -> b-a)
//             .limit(100);//iterate is used to create an infinite stream of numbers starting from 0 and limit is used to limit the stream to 100 elements
//             System.out.println("Count of numbers from 0 to 99: " + limit.count());  //skip is used to skip the first element of the stream which is 0 and count is used to get the number of elements in the stream

//             Stream<String> name = Stream.of("Don", "Raj", "Aman", "Vijay").distinct().filter(n -> n.length() > 3);// distinct is used to get only unique names and filter is used to get names with length greater than 3
//             System.out.println("Names with length greater than 3:");
//             name.forEach(System.out::println);

//             Stream<Integer> sorted = num.stream()
//             .skip(3)
//             .sorted((a,b) -> b-a);// sorted is used to sort the numbers in descending order
//             System.out.println("Numbers sorted in descending order:");
//             sorted.forEach(System.out::println);
//     }
// }


//--------- skip ---------(Skip is used to skip the first n elements of the stream)

// import java.util.stream.Stream;
// class Demo{
//     public static void main(String[] args) {
//         System.out.println("Hello World");

//         Stream<Integer> limit =  Stream.iterate(0, n -> n+1).limit(100).skip(1).sorted().sorted((a,b) -> b-a);
//         System.out.println("Count of numbers from 0 to 99: " + limit.count());

//         Stream<String> name = Stream.of("Don", "Raj", "Aman", "Vijay").distinct().filter(n -> n.length() > 3);
//         System.out.println("Names with length greater than 3:");
//         name.forEach(System.out::println);

//             Stream<Integer> sorted = Stream.of(1,2,3,4,5).skip(3).sorted((a,b) -> b-a);
//             System.out.println("Numbers sorted in descending order:");
//             sorted.forEach(System.out::println);


//     }
// }

//--------- Distinct ---------(Distinct is used to get only unique elements from the stream)

// import java.util.stream.Stream;
// class Demo{
//     public static void main(String[] args) {
//         Stream<String> name = Stream.of("Don", "Raj", "Aman", "Vijay", "Don")
//         .distinct() // distinct is used to get only unique names from the stream
//         .filter(n -> n.length() > 3);
//         System.out.println("Names with length greater than 3:");
//         name.forEach(System.out::println); // forEach is used to print the names in the stream
//     }
// }


//List of integers , filter number div by 3 but not 5 .....

// import java.util.*;
// class Demo {
//     public static void main(String[] args) {

//         List<Integer> l = Arrays.asList(12,14,10,15,18,20,25);

//         l.stream()
//          .filter(n -> n % 3 == 0 && n % 5 != 0)
//          .forEach(System.out::print);
//     }
// }


//--------- TO USE REDUCED FUCTION() -------

//In the Java Streams API, reduce() is used to combine all elements of a stream into a single result.

// import java.util.ArrayList;
// import java.util.Arrays;
// import java.util.List;

// public class Demo {

//     public static void main(String[] args) {
        // List<Integer> str = new ArrayList<>();
        // str.add(23);
        // str.add(22);
        // System.out.println(str);


    // List<Integer> l = Arrays.asList(12, 33, 44, 55, 66, 77);
        
    //    var ans = l.stream().filter(n-> n%2==0 )
    //     .reduce(0, (a,b)-> a+b );
    //     System.out.println(ans);

    //Sum of all elements

    // var ans = l.stream().reduce(0,(a, b)-> a+b);
    // System.out.println(ans);

    //Product of elements

    // var ans = l.stream().reduce(0,(a,b)-> a*b);
    // System.out.println(ans);

    //Division of elements

    // var ans = l.stream().reduce(0,(a, b)-> a/2);
    // System.out.println(ans);

    //count element 

    // var ans = l.stream().reduce(0,(a,b )-> a +1);
    // System.out.println(ans);

    //Find Maximum

    // var ans = l.stream().reduce(0,(a,b)-> a> b ? a : b);
    // System.out.println(ans);
        
    //  var ans = l.stream().reduce(0,(a,b)-> a< b ? a : b);
    // System.out.println(ans); 

//     }
// }


//-------- Concatenate Strings --------

// import java.util.Arrays;
// import java.util.List;

// public class Demo {

//      public static void main(String[] args) {
//        List<String> l = Arrays.asList("A", "B", "C");
        
//        String result = l.stream().reduce("", (a, b) -> a + b);
//         System.out.println(result);
//      }
// }


//------------ Concatenate Integar -------

// import java.util.Arrays;
// import java.util.List;

// public class Demo {

//      public static void main(String[] args) {
//         List<Integer> l = Arrays.asList(1,2,3,4,5,5,6);
//         int ans = l.stream().reduce(0,(a,b)-> a+b);
//         System.out.println(ans);
//      }
// }