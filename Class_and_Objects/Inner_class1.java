/*Classes are nested  judt like the loop ,one class is nested inside another class.
i.e one class defination inside another class.
Inner classes in java are the classes which are defined inside the scope of another class.
Inner classes are also called as nested classes.
Innner classes need--> because some times we program such way that no other classes access it,
it would be better to enclose it within the another class.
If all the class object are the part of the outer object  then it would be easy to nest the class inside outer class. 
Outer class can access the all the objects of the inner class

syntax:-
class outerclass{
//outer body
    class innerclass{
    //inner body
    }
}


--There are four inner classes in java:-
1.Nested inner class---->the inner class access the private member of the outer class
2.local inner class
3.Anonymous inner class
4.Static nested classes---->we can access the class without havinf the object of the outer class.


*/

class OuterClass{
    //we can not create inner class without outer class.
    //need of outerclass object to use it.
    class InnerClass{
        public void print(){             //illegal static declaration in inner and outer class.
        System.out.println("Inner class");
        }
    }
    //No need of outerclass object to use it
    static class InnClass{
        public void print(){             //illegal static declaration in inner and outer class.
        System.out.println("Inner class (static)");
        }
    }
}



class Inner_class1{
    public static void main(String[] args){
        //Access non-ststic inner class
        OuterClass outer = new OuterClass();   // Step 1: create outer object
        OuterClass.InnerClass in1 = outer.new InnerClass();  // Step 2: create inner object
        in1.print();
        
        //Access static inner class
        OuterClass.InnClass in2 = new OuterClass.InnClass();//need not to crate object of outer class to access inner class by making inner class static.
        in2.print();
    

    }

}