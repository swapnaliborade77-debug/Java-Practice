// for finite number of operations we can use for loop.
//for infinite number of operations we can use while loop.
//intialization done before the while loop
//syntax:- while(condition){inside the body increment or decrement do}

import java.util.Scanner;
class While_Loop{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int distance = sc.nextInt();
        int count = 0; //count variable
        int i = 1;
        while(distance>0){
            if(i%5 == 0)
                count++;
            i++;
            distance--;
        }
        System.out.println(count);

    }

}