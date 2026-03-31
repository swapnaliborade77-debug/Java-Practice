/*Abtrsct class:-
1. It is a class which is declared with the abstract keyword.
2. It may or may not contain abstract method.
3.An abstarct class can have non abstract method.
4.It must have an abstract method.
Abstract method---->A method which is declared using abstract keyword.
5.Abstarct method are implemented in its derived class.

 */



abstract class A{
    //not mandatory to have abstract method in abstract class.
    void display(){     //It is a non abstract method,we can defined the body of this method.
        System.out.println("This is a non abstract method");
        } 
        
     //this mathod is only declared but not defined,so it is an abstract method.   
    abstract void test();  //It is an abstract method,we can't define the body of this method.
    //abstract definition is not allowed.
}

class B extends A{
    void test(){
        System.out.println("This is an abstract method");

    }


}

class Abstract_class{
    public static void main(String[] args){
        B obj = new B();
        obj.display();
        obj.test();
    }
}