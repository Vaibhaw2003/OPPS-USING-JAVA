//------ [ ALL ABOUT SET INTERFACE ]------------

//Set is an interface in Java that represents a collection of unique elements.

//🎓 Roll numbers in a class → every roll number is unique / 👉 NO duplicates allowed
//🎓 Set interface ko implement karne wali classes me se kuch popular classes hain: HashSet, LinkedHashSet, TreeSet

//-------------01 ---[ HashSet CLASS ]----------


//Stores elements using Hashing / No duplicates / Fast performance.

// import java.util.*;

// class Sets {
//     public static void main(String[] args) {
//         Set<Integer> set = new HashSet<>();
//         set.add(10);
//         set.add(20);
//         set.add(10); // ignored

//         System.out.println(set);
//     }
// }


//-------------02 ---[ LinkedHashSet CLASS ]----------

// HashSet + Insertion Order / No duplicates / Order maintained.

// import java.util.*;

// class Sets{
//     public static void main(String[] args) {
//         Set<String> set = new LinkedHashSet<>();
//           set.add("A");
//           set.add("B");
//           set.add("A");

//           System.out.println(set); // [A, B]

//     }
// }

//-------------03 ---[ TreeSet CLASS ]----------( sortedSet interface me Treeset ata hai ).

//Sorted implementation of Set using Red-Black Tree. / No duplicates 
// Elements stored in sorted (ascending) order.

import java.util.*;

class Sets {
    public static void main(String[] args) {
        Set<Integer> set = new TreeSet<>();
            set.add(30);
            set.add(10);
            set.add(20);

            System.out.println(set); // [10, 20, 30]       
    }
}



