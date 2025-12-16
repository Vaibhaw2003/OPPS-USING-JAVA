//-------------TreeSet and HashSet-------------
/*   

import java.util.TreeSet;

public class Demo {
    public static void main(String[] args) {
        TreeSet<Integer> ts = new TreeSet<>();

        ts.add(50);
        ts.add(10);
        ts.add(30);
        ts.add(10); // duplicate ignored

        System.out.println(ts);
    }
}
*/

// -----------HashSet-----------
/* 
import java.util.HashSet;

public class Demo {
    public static void main(String[] args) {
        HashSet<Integer> hs = new HashSet<>();

        hs.add(10);
        hs.add(20);
        hs.add(30);
        hs.add(10); // duplicate ignored
        hs.add(null); // allowed

        System.out.println(hs);
    }
}
 */

//-----------HashMap--------
/*   
import java.util.HashMap;

public class Demo {
    public static void main(String[] args){
        HashMap<Integer, String> hs = new HashMap<>(); // yaha pe valuse ka secuance dena important hai ( int, stri).

        hs.put(2,"vaibhaw singh");// yaha pe pahle int dana hai or string.
        hs.put(3, "marco");
        hs.put(4,"harsh singh");

        System.out.println(hs);

    }
}
*/

//---------LinkedHash Map-----------
/*   
import java.util.LinkedHashMap;

public class Demo {
    public static void main(String[] args) {
        LinkedHashMap<Integer, String> map = new LinkedHashMap<>();

        map.put(3, "C");
        map.put(1, "Java");
        map.put(2, "Python");

        System.out.println(map);// duplicate key are not allow.
    }
}
*/

//----------ArrayList + Iterator----------

import java.util.*;

class Demo {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Java");
        list.add("Python");
        list.add("C++");

        Iterator<String> itr = list.iterator();

        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}








