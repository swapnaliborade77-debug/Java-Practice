//scanner class in java - reads the input from the keyboard / 
//scanner class belongs to util package
//we have to import the scanner class to use it in our program
import java.util.Scanner;
public class scanner{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        float f = sc.nextFloat();
        double d = sc.nextDouble();
        
        String s = sc.next();// to read a single word of input foe this if we write a sentence then it only read single word bcz space next to the word it consider it as a end of a word but if we want to read the whole line of input then we have to use nextLine() method of the scanner class

         String str = sc.nextLine(); // to read the whole line of input

        char ch = sc.next().charAt(0);
       //System.out.println(n);
      //System.out.println(f);
     // System.out.println(d);
    // System.out.println(s);
      //System.out.println(ch);
        System.out.println(str);
    }
}