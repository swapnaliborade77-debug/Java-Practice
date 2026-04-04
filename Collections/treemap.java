/*
TreeMap in Java:-

TreeMap is a class in Java that implements the Map interface and is part of the Java Collections Framework.

 Key Features:-
Stores Key–Value Pairs
Data is stored like: key → value
Sorted Order (by Keys)
Keys are automatically stored in ascending order
Example: {3=A, 1=B, 2=C} → {1=B, 2=C, 3=A}
No Duplicate Keys
Duplicate keys are NOT allowed
If repeated → value gets updated
Allows Duplicate Values
Multiple keys can have same value
No Null Key
Does NOT allow null key
(may allow multiple null values)
Uses Tree Structure
Internally uses Red-Black Tree

 Important Methods:-
put(key, value) → insert data
get(key) → get value
remove(key) → delete entry
containsKey(key) → check key
firstKey() → smallest key
lastKey() → largest key
higherKey() → next greater key
lowerKey() → next smaller key
*/


import java.util.*;
class treemap{
    public static void main(String[] args){
        TreeMap t = new TreeMap();
        t.put(100,"aaa");
        t.put(200,"bbb");
        t.put(300,"ccc");
        t.put(400,"ddd");
        System.out.println(t);    
    }
}