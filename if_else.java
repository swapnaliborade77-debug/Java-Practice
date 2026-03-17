//Types:-
//1. if-else statement
//2. if -else-if statement
//3. nested if statement
//4. switch statement

//1. if-else statement:-

import java.util.Scanner;
class if_else{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int obt_mark = sc.nextInt();
        int min_mark = sc.nextInt();
        if(obt_mark>=min_mark){
            System.out.println("Pass");
        } 
        else{
            System.out.println("Fail");
        }
    }
}