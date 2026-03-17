//Looping/Iteration
//Types:-1.for , 2.while , 3.do-while

//syntax:-  for(intialization;condition;inc/dec){body} 

import java.util.Scanner;
class For_Loop{
    public static void main(String[] args ){
        Scanner sc = new Scanner(System.in);
        int bench = sc.nextInt();
        for(int i = 1;i<=bench;i++){
             if(i%2 == 0){
                System.out.println("12th");
            }else{
                System.out.println("10th");
            } 
        } 
    }

}