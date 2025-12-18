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

import java.util.LinkedList;
import java.util.Queue;

class Collection {
    public static void main(String[] args) {
        Queue<Integer> qu = new LinkedList<>();

        qu.offer(22);
        qu.offer(23);
        qu.offer(25);

        System.out.println(qu);
        qu.poll();
        System.out.println(qu);
        qu.peek();
        System.out.println(qu);
       
    }
}