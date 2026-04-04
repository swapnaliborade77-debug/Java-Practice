import java.io.*;
class ExceptionHandling1{
    public static void main(String[] args){
        try{
              System.out.println(25/0);
              System.out.println("Not");//if exception occurs then this line will not be exected

        }

        catch(Exception e){
            System.out.println("Divede by zero");
        }
        finally{
            System.out.println("Finally block");
        }
    }
}