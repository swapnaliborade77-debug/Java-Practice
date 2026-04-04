/* LinkedList :- when we have a frequent need to insert or delete elements from the middle of the list the linked list is the best choice. 
                - It is a linear data structure where each element is a separate object.
                - Each element (node) of a list is comprising of two items - the data and a reference to the next node.
                - The last node has a reference to null. 
                - The entry point into a linked list is called the head of the list. 
                - It should be noted that head is not a separate node, but the reference to the first node.
                -In linked list duplicate values are allow.

                There are six specific methods in linked lists:
                1. addFirst() :- adds an element at the beginning of the list.
                2. addLast() :- adds an element at the end of the list. 
                3. removeFirst() :- removes the first element from the list.
                4. removeLast() :- removes the last element from the list.
                5. getFirst() :- returns the first element in the list.
                6. getLast() :- returns the last element in the list.    


*/


import java.util.*;
class LinkList{
    public static void main(String[] args){
        LinkedList l = new LinkedList();
        l.add("Neo");
        l.add(30);
        l.add("hello");
        System.out.println(l);
        l.add(null);
        System.out.println(l);
        l.set(0,"Iamneo");
        System.out.println(l);
        l.removeLast();
        System.out.println(l);
        l.removeFirst();
        System.out.println(l);
    }
}