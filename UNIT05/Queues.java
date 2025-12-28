//------ [ ALL ABOUT QUEUE INTERFACE ]------------

//Queue is an interface in Java used to store elements in FIFO order.

//FIFO = First In First Out

//-------------01 ---[ PIORITY_QUEUE CLASS ]----------

//Elements are stored by priority, not FIFO.

// import java.util.PriorityQueue;

// class Queues {
//     public static void main(String[] args) {
//         PriorityQueue<Integer> age = new PriorityQueue<>();
//         age.add(90);
//         age.add(80);
//         age.add(70);
//         age.add(50);

//         System.out.println(age); // order not guaranteed
//          System.out.println(age.poll());
//     }
// }


//-------------02 ---[ LinkedList_QUEUE CLASS ]----------

// Because LinkedList implements Queue and Deque interfaces.

// import java.util.*;

// class Queues {
//     public static void main(String[] args) {

//         Queue<String> q = new LinkedList<>();

//         q.offer("A");  // LinkedList me element add karne ke liye offer ka use hota hai
//         q.offer("B");
//         q.offer("C");

//         System.out.println(q);        // [A, B, C]
//         System.out.println(q.peek()); // A ( first element ko dekhne ke liye peek ka use hota hai )
//         System.out.println(q.poll()); // A  ( first element delet ho jayega )
//         System.out.println(q);        // [B, C]
//     }
// }


//-------------03 ---[ ArrayDeque CLASS ]----------

// ArrayDeque is a resizable array implementation of the Deque (Double Ended Queue) interface.

import java.util.*;

class Queues {
    public static void main(String[] args) {

        Deque<Integer> q = new ArrayDeque<>();

        q.offer(10);  // Array deque me element add karne ke liye offer ka use hota hai
        q.offer(20);
        q.offer(30);

        System.out.println(q);        // [10, 20, 30]
        System.out.println(q.poll()); // 10 ( first element delet ho jayega )
        System.out.println(q.peek()); // 20 ( first element ko dekhne ke liye peek ka use hota hai )
        System.out.println(q.remove(20));        // [20, 30] ( specific element ko delet karne ke liye remove ka use hota hai )
    }
}
