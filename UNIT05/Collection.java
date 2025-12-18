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