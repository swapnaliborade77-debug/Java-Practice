class LogOper{
    public static void main(String[] args){
        int num1=10, num2=5;
        System.out.println("Logical AND: "+(num1>0 && num2>0)); //true
        System.out.println("Logical OR: "+(num1>0 || num2<0)); //true
        System.out.println("Logical NOT: "+!(num1>0)); //false
    }
}