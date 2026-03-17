import java.util.Scanner;
class Nested_If{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int os = sc.nextInt();
        int ram = sc.nextInt();
        if(os>=64){
            if(ram>=8){
                System.out.println("Can install pubg or cod");

            }else{
                System.out.println("can install farcry");

            }
        }
        else{
            System.out.println("can install freefire");
        }
    }
   
    } 







