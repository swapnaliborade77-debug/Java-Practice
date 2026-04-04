/*
--A lambda expression is used to write small pieces of code (functions) in one line, mainly 
when working with functional interfaces.

Basic Syntax of Lambda Expression: (parameters) -> { body }
example: (a, b) -> a + b

*/



interface A{
    void show();
}



class Lambda{
    public static void main(String[] args)
    {
        A obj;
        obj = () ->System.out.println("Hello Sona!");
        obj.show();
    }
}