//------ [ ALL ABOUT LIST INTERFACE ]------------

//List is an interface in the Java Collection Framework that represents an ordered collection.

//-------------01 ---[ ARRAYLIST CLASS ]----------

//ArrayList is a resizable (dynamic) array implementation of List.

// import java.util.ArrayList;

// class Lists {
//     public static void main(String[] args) {
//         ArrayList<Integer> age = new ArrayList<>();

//         age.add(44);
//         age.add(66);
//         age.add(99);

//         System.out.println(age);
//     }
// }

//-------------02 ---[ LinkedList CLASS ]----------

//LinkedList is a doubly linked list implementation of List.

// import java.util.LinkedList;

// class Lists {
//     public static void main(String[] srgs){
//         LinkedList<String> name = new LinkedList<>();

//         name.add("vaibhaw singh ");
//         name.add("harsh sing ");
//         name.add("marco singh");

//         System.out.println(name);
//     }
// }

//-------------03 ---[ Vector CLASS ]----------

// Vector is a legacy class similar to ArrayList but thread-safe.

// import java.util.Vector;

// class Lists {
//     public static void main(String[] args) {
//         Vector<Integer> marks = new Vector<>();

//         marks.add(90);
//         marks.add(80);
//         marks.add(60);

//         System.out.println(marks);

//         marks.remove(0);

//         System.out.println(marks);
//     }
// }


//-------------04 ---[ Stack CLASS ]----------

// Stack is a class in Java that follows LIFO principle.

import java.util.Stack;

class Lists {
    public static void main(String[] args) {

        Stack<Integer> s = new Stack<>();

        s.push(10); // yaha pe element add karne ke liye push ka use hota hai.
        s.push(20);
        s.push(30);

        System.out.println(s);  
        System.out.println(s.pop()); // delete karne ke liye pop ka use hota hai.
        
    }
}
