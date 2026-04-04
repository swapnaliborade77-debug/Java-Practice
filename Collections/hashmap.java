
/*Map Interface in Java:-
if we want to represent a group of object as key vlaue pair then go with map. 
both keys and values are object only.
duplicate keys are not allowed but duplicate values are allowed.
each key value pair is called one entry.
Map interface is not a child interface of collection hence we canot apply collection mathods here.
Map has its own specific methods.
1. put(key,value) → to insert data
2. get(key) → to get value
3. remove(key) → to delete entry
4. containsKey(key) → to check key
5. firstKey() → to get smallest key
6. lastKey() → to get largest key
7. higherKey() → to get next greater key
8. lowerKey() → to get next smaller key
9. keySet() → to get all keys
10. values() → to get all values
11. entrySet() → to get all key value pair as set

Map is considred as group of entry objects.
Interface entries are defined inside map interface.
we have three method in entry interface.
1. getKey() → to get key from entry object
2. getValue() → to get value from entry object
3. setValue() → to update value in entry object

 */

import java.util.*;
class hashmap
{
public static void main(String[] args){
    HashMap m = new HashMap();
    m.put("a",100);
    m.put("b",200);
    m.put("c",300);
    m.put("d",400);
    m.put("e",500);
    System.out.println(m);
    Set s = m.keySet();//store all keys in set collection because keys are unique.
    System.out.println(s);
     Collection c = m.values();
     System.out.println(c);
     Set s1 = m.entrySet();
     System.out.println(s1); 
     Iterator itr = s1.iterator(); //object of iterator to iterate entry objects.
     while(itr.hasNext()){
        Map.Entry m1 = (Map.Entry)itr.next();
        System.out.println(m1.getKey()+" "+m1.getValue());
     }

}
}
