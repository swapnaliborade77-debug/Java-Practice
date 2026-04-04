import java.io.*;

class Custom extends Exception{
    public Custom(String str){
        super(str);

    }
}

class ExceptionHandling2 {
    public static void main(String[] args){
        try{
              System.out.println("Not");//if exception occurs then this line will not be exected

        }

        catch(Exception e){
            System.out.println("exceptin occured");
        }
        finally{
            System.out.println("Finally block");
        }
    }
}