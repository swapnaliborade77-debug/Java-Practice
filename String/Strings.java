//In java strings are object.
//Internally it will be converted into char array ---->it is not exposed to the develpoers
// string object not be created using new keyword rather it can be created like primittives 
//it is immutbale.
//It is non-primitive datatype because string considered as object.
//string literals placed in heap memory-->knows as string pool constant
//string class has very useful siblings called as --->
//string buffer and string builder-->both the class consist same method.
//string builder is little faster and strring buffer is threat synchronized.
//function which is applicable t stringBuilder it can also applicable to the stringBuffer.




class Strings{
    public static void main(String[] args){
        String str =new String(); //using keyword new
        String str1 = new String("abcd");
        char[] ch = {'a','b','c','d'};
        String str2 = new String(ch);
        String str3 = "abcd";//most common useable ---->prefearble way



        
//HOW TO CREATE STRING OBJECT:-
//Two types:- 1.String literal 2.new keyword

        //Using Litearl:-
        String s1 ="iamneo"; //value directly assigned 

        //Using new Keyword:-
        String s2 = new String("Welcome");

        //Immutable property
        System.out.println(s1+ " developer");//s1 joined with developer 
        System.out.println(s1);

    }
}