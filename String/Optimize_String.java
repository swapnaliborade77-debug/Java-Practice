//String functions
//equals,equlasIgnoreCase,trim,compareTo,substring,startwith,endwith,charAt,indexof.
//In arr length() is a predefined property but  in the string we use it as a function 

public class Optimize_String{
    public static void main(String[] args){
        String s1 = " hello ";
        System.out.println(s1.length());
        System.out.println("After triming");
        System.out.println(s1.trim().length()); //trim() method is used to remove the extra space 
        

        String s2 = "welcome";
        System.out.println(s2.startsWith("we")); //true---->trie based search  use hashing
        System.out.println(s2.endsWith("me"));

        System.out.println(s2.charAt(3));

        System.out.println(s2.indexOf('e')); //it willtake first occurance of the e not last

        //welcome---wel
        System.out.println(s2.substring(0,3)); //4 is excluded

        String s3 = new String("Hello");
        System.out.println(s1.equals(s3)); 
        System.out.println(s1.equalsIgnoreCase(s3));

    }

}