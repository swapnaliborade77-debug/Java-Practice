/*
Abstarct class cannot be instantiated, but it can be subclassed. An abstract class may contain abstract methods, which are declared without an implementation. Subclasses of the abstract class must provide implementations for the abstract methods.
Example:- Calcualting rate of interest for  different bank account. 
Account---->rate of interest()
like SBI---->7%
HDFC---->6%  
ICICI---->5% 
*/

abstract class Account{
    abstract void rateOfInterest();
    //abstract void display();---->all subclasses throw an error bcz this abstarct class in not defined in all subclass i.e whatever absract class we create in our program, we have to define it in all subclass.
}

class SBI extends Account{
    void rateOfInterest(){
        System.out.println("Rate of interest for SBI is 7%");
    }
}

class HDFC extends Account{
    void rateOfInterest(){
        System.out.println("Rate of interest for HDFC is 6%");
    }
}

class ICICI extends Account{
    void rateOfInterest(){
        System.out.println("Rate of interest for ICICI is 5%");
    }
}

class Abstract_class_real_time{
    public static void main(String[] args){
        Account sbi = new SBI();
        Account hdfc = new HDFC();
        Account icici = new ICICI();

            sbi.rateOfInterest();
            hdfc.rateOfInterest();
            icici.rateOfInterest();     
    }
    
}


