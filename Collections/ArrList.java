import java.util.*;
class ArrList{ //ArrayList is a class that comes from Java’s standard library:                             
    public static void main(String[] args){
        ArrayList a = new ArrayList();//build in constructor of the  ArrayList class.
        a.add("A");
        a.add(10);
        a.add(null);
        System.out.println(a);
        a.remove(2);
        System.out.println(a);
        a.add(2,"S");
        a.add("K");
        System.out.println(a);

    }
}