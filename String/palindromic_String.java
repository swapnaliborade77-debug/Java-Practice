import java.util.Scanner;
public class palindromic_String{
    static boolean palindromeCheck(String input){
        StringBuilder sb =new StringBuilder(input);
        String result = sb.reverse().toString();    //stringBuilder object stored in string object with the help of this toString method

        if(result.equals(input)){
            return true;
        }
        return false;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String input = sc.next();
        if(palindromeCheck(input)){
            System.out.println(input+" is a palindrome");
        }else{
            System.out.println("Not a palindrome");
        }
        

    }

    
}