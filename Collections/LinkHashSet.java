/*LinkedHashSet:-
 It is child class hashset.
 It is the combination of HashSet and LinkedList. 
 LinkedHashSet maintains the insertion order of elements. */


 import java.util.*;
class LinkHashSet{
    public static void main(String[] args){
        LinkedHashSet h = new LinkedHashSet();
        h.add("A");
        h.add("B");
        h.add("C");
        h.add("D");
        h.add(null);
        h.add("z");
        h.add(10);
        h.add(null);
        System.out.println(h);
       // System.out.println(h.add("A"));   --->not allowed. 
    }
}