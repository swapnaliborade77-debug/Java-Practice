/*Polymorphism-->poly=many ,morph=forms
Example :- A person --->employee-->customer-->passenger ==>same person but different roles. 
Ability of objects to take mutiple forms is called polymorphism. 
Method overriding--->inheritance
Polymorphism will be achieved only with the help of overrding and inheritance.
Two types of polymorphism:-compile time and run time
1.Compile time polymorphism-->also known as static polymorphism......e.g--method overloading
run time polymorphism--->virtual method invocation -->called it as dynamic binding.*/



class A{
    void display(){
        System.out.println("Welcome");

    }
} 
class B extends A{
    void display(){
        System.out.println("derived");
        
    }
}
public class Introduction{
    public static void main(String[] args){
        A base = new B(); //assign constructor of the derived class i.e reference memmory of the drived class .
        B derived = new B();
        base.display();
        derived.display();
        //Compile time---->compile base function
        // Run time---->In the constructor it will virtual invoke the deroved class method by overriding the base class compilation function.

    }
}