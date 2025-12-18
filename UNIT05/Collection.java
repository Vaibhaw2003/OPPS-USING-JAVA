//-------------[ Collection Framework ]-----------

//----------[01] ArrayList -------------
/*  
import java.util.ArrayList;   // ArrayList ko use karne keliye utill package ko istall karna hoga.

class Collection {
    public static void main(String[] ags){
       ArrayList<String> name = new ArrayList<>();

       name.add("vaibhaw singh ");
       name.add("marco");

       System.out.println(name);

    }
}
*/


//----------[ remove ]----------

/*  
import java.util.ArrayList;

class Collection {
    public static void main(String[] args){
        ArrayList<Integer> age  = new ArrayList<>();

        age.add(22);
        age.add(33);

        System.out.println(age);
        age.remove(0);
        System.out.println(age);

    }
}
*/


// --------[ set ]--------( yah valuse ko replesh kar deta hai ).
/*  
import java.util.ArrayList;

class Collection {
    public static void main(String[] args) {
        ArrayList<String> name = new ArrayList<>();
        name.add("vaibhaw singh");
        name.add("harsh singh");
        name.add("marco");

        System.out.println(name);
        name.set(1, "birendra");
        name.remove(0);
        System.out.println(name.get(1)); // name.get ( se hame jisko bhi print karana chahte ho ushka index de ke print kara sakte hai.)
        name.clear();// ye methode sab kuch arraay ke element ko clear kar dega.
        System.out.println(name);

        }
}
*/

//------------[ LinkedList ]----------
/*   
import java.util.LinkedList;

class Collection{
    public static void main(String[] args) {
        LinkedList<String> name = new LinkedList<>();

        name.add("vaibhaw singh ");
        name.add("marco");

        System.out.println(name);
        name.addFirst("harsh singh"); // ye methode se start me add hoga.
        name.addLast("raunak singh"); //ye methode se last  me add hoga.
        name.add(1,"janavi singh");
        
        for( String str:name){  //  fro ka use kar ke hame values ko coloum wose print kar sakte hai.
            System.out.println(str);
        }
    }
}
*/

//----------[ STACK ]---------
/*    
import java.util.Stack;

class Collection {
    public static void main(String[] args) {
        Stack<String> name = new Stack<>();  // it have espacial feature called  [ LIFO ].

        name.push("vaibhaw singh "); //  element add karne ke liye push or delet karne ke liye pop. 
        name.push("marco");
        name.push("harsh singh");

        System.out.println(name);
        name.pop();  // pop ka use hame element ko delet karne ke liye hota hai.
        System.out.println(name);
    }
}
    */

// -------------[ ArrayDeque ]-----------

// import java.util.ArrayDeque;

// class Collection {
//     public static void main(String[] args) {
//         ArrayDeque<String> name = new ArrayDeque<>();  // its work in [ FIFO ] methodes.

//         name.add("vaibhaw singh");
//         name.push("marco");
//         name.push("harsh singh");

//         System.out.println(name);
//         name.pop();  // pop ka use hame element ko delet karne ke liye hota hai.
//         System.out.println(name);
//     }
// }

//---------[ QUEUE ]----------

// import java.util.LinkedList;
// import java.util.Queue;

// class Collection {
//     public static void main(String[] args) {
//         Queue<Integer> qu = new LinkedList<>();

//         qu.offer(22);
//         qu.offer(23);
//         qu.offer(25);

//         System.out.println(qu);
//         qu.poll();
//         System.out.println(qu);
//         qu.peek();
//         System.out.println(qu);
       
//     }
// }

//----------[ PRIORITY QUEUE ]-----------

// import java.util.PriorityQueue;

// class Collection {
//     public static void main(String[] args){
//         PriorityQueue<Integer> pq = new PriorityQueue<>();

//         pq.offer(45);
//         pq.offer(55);
//         pq.offer(66);
//         pq.offer(23);
//         pq.offer(34);

//         System.out.println(pq);
//         pq.poll();
//         System.out.println(pq);
        
//         System.out.println(pq.peek());
//     }
// }

//-------------[ SET ]----------

// import java.util.HashSet;
// import java.util.Set;

// class Collection{
//     public static void main(String[] args) {
//         Set<Integer> set = new HashSet<>();

//         set.add(23);
//         set.add(45);
//         set.add(66);
        
//         System.out.println(set);

       
//         System.out.println( set.contains(4000)); // eska use hota hai index me element ko finde karne ke liye, hoga to true nhi to false.

//         System.out.println(set.isEmpty()); // ye use hota hai set ka element chek karne ke liye. 

//         System.out.println(set.size());
//     }
// }

//-------------[ LinkedHashSet ]----------

// import java.util.LinkedHashSet;
// import java.util.Set;

// class Collection{
//     public static void main(String[] args) {
//         Set<Integer> set = new LinkedHashSet<>(); // eshame order mantain rahta hai .

//         set.add(45);
//         set.add(23);
//         set.add(456);
//         set.add(66);

//         System.out.println(set);
//     }
// }

//-------------[ TreeSet ]----------

// import java.util.Set;
// import java.util.TreeSet;

// class Collection{
//     public static void main(String[] args) {
//         Set<Integer> set = new TreeSet<>();

//         set.add(44);
//         set.add(88);
//         set.add(99);

//         System.out.println(set);
//     }
// }

// -------------[ MAP ]---------

// import java.util.HashMap;
// import java.util.Map;

// class Collection  { 
//     public static void main(String[] args){
//         Map<String ,Integer> m = new HashMap<>();  // ye wala Hash Map tha --

//         m.put("vaibhaw", 05);
//         m.put("harsh ", 06);

//         System.out.println(m);

//         for( Map.Entry<String , Integer > e : m.entrySet()) // it is called itirates.
//             //System.out.println(e);
//             System.out.println(e.getValue()); // key ka value pane ke liye use hota hai. 

//     }
// }


//---------[ Tree Map ]-----------

import java.util.Map;
import java.util.TreeMap;

class Collection  { 
    public static void main(String[] args){
        Map<String ,Integer> m = new TreeMap<>();  // ye wala tree Map hai ye key values ke uppper kam karta hai 

        m.put("vaibhaw", 05);
        m.put("harsh ", 06);

        System.out.println(m);

        // for( Map.Entry<String , Integer > e : m.entrySet()) // it is called itirates.
        //     //System.out.println(e);
        //     System.out.println(e.getValue()); // key ka value pane ke liye use hota hai. 

    }
}
