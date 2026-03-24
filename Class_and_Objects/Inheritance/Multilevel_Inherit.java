/*Multilevel Inheritance:-
grand parent-->parent---->child.
*/

class A{
    void display(){
        System.out.println("HI");

    }
} 
class B extends A{
    void test(){
        System.out.println("Hello");
        
    }
} 

class C extends B{
    void foo(){
        System.out.println("How are you?");
        
    }
} 

//for this class,class C is super class and it inherit the class C
class D extends C{
    void print(){
        System.out.println("I am good!");
        
    }
} 




class Multilevel_Inherit{
    public static void main(String[] args){
        D ob = new D();
        ob.print();
        ob.foo();
        ob.display();
        ob.test();

    }
}