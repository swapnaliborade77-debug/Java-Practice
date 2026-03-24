/*Multiple Inheritance:-
It is --->two base class and one derived class.
Java does not support multiple inheritance.--->Here creats confusin or ambiguity happens that is which  dispaly function should call upon.
 
 Method overriding---->laptop bag ---->dress and kits  (same name but diffrent utility)
 happens in between two class where this two classes are related with inheritance relationship that why it is called as-->
-----> class A IS-A B  --Inheritance relationship
*/

 class A{            //A()-->at backend default constructor is created and properties of the this class are given a memmory in to  constructor
    void display(){
        System.out.println("welcome base");
    }
 }

 class B{
    void display(){
        System.out.println("base2");
    }
 }

 class C extends A{                                               
//super.display()--->this is a default object to refer a base class in java
    void display(){
        System.out.println("welcome derived");
    }
 }

 class Multiple_Inherit{
    public static void main(String[] args){
    C ob =new C();
    ob.display();
 }
}
