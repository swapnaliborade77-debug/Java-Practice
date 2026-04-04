/*
 TreeSet in Java

TreeSet is a class in Java that implements the Set interface and is part of the Java Collections Framework.

Key Features:-
No Duplicates
Like all sets, it does not allow duplicate elements
Sorted Order
Elements are stored in ascending (natural) order
Example: 10, 5, 20 → stored as 5, 10, 20
No Insertion Order
It does NOT keep the order in which elements were added
Uses Tree Structure
Internally uses a Red-Black Tree (self-balancing BST)
No Null Values
Does not allow null (can throw exception)

Important Methods:-
add() → adds element
remove() → removes element
contains() → checks element
first() → smallest element
last() → largest element
higher() → next greater element
lower() → next smaller element */


import java.util.*;
class treeset0{
    public static void main(String[] args){
        TreeSet h = new TreeSet();
        
        h.add("C");
        h.add("D");
        //h.add(null);
        h.add("z");
        h.add("A");
        h.add("B");

       // h.add(10);
        //h.add(null);
        System.out.println(h);
       
    }
}