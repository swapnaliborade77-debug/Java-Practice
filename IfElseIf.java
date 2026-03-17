import java.util.Scanner;
class IfElseIf{
   public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        int amount = sc.nextInt();
        int min_fullframe = sc.nextInt();
        int min_halfframe = sc.nextInt();
        int min_frameless = sc.nextInt();
        if(amount>=min_fullframe){
            System.out.println("can buy full frame specs");
        }
        else if(amount>=min_halfframe){
            System.out.println("can buy half frame specs");
        }
        else if(amount>=min_frameless){
            System.out.println("can buy frameless specs");
        }
        else{
            System.out.println("No specs available");
        }


    }

}