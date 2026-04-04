
/*
LinkedHashMap in Java:-

LinkedHashMap is a class that implements the Map interface and is part of the Java Collections Framework.

Key Features:-
Maintains Insertion Order
Elements are stored in the order they are added

Example: {3=A, 1=B, 2=C} → same order preserved

Key–Value Pairs
Stores data as key → value
No Duplicate Keys
Duplicate keys are not allowed
If repeated → value is updated
Allows Null
Allows one null key
Allows multiple null values
Uses Hash Table + Linked List
Combination of hashing + linked list to maintain order

Important Methods:-
put(key, value) → add data
get(key) → access value
remove(key) → delete
containsKey(key) → check key
*/



import java.util.*;
class linkehashmap
{
public static void main(String[] args){
    LinkedHashMap m = new LinkedHashMap();
    
    m.put("c",300);
    m.put("d",400);
    m.put("e",500);
    m.put("a",100);
    m.put("b",200);
    System.out.println(m);
    Set s = m.keySet();
    System.out.println(s);
     Collection c = m.values();
     System.out.println(c);
     Set s1 = m.entrySet();
     System.out.println(s1); 
     Iterator itr = s1.iterator();
     while(itr.hasNext()){
        Map.Entry m1 = (Map.Entry)itr.next();
        System.out.println(m1.getKey()+" "+m1.getValue());
     }

}
}