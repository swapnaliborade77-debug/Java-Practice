/*Set Interface:- 
It is a child interface of Collection.
If we want to represent the group of indivisual object as a singe entity whwre duplicates are not allowed where insertion order is not preserved then we use Set interface.
There are 3 classes in set interface:-
1)HashSet
2)LinkedHashSet
3)TreeSet  ---->comes under sorted set interface.  


A Set uses methods from the Collection interface and does not support List-specific methods like index-based access because the Set interface does not define them. 
Also, a Set does not allow duplicate elements, and ordering depends on the implementation.

*/
import java.util.*;
class Hashset{
    public static void main(String[] args){
        HashSet h = new HashSet();
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