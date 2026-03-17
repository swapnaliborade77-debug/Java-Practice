//OPERATORS IN JAVA
//1. Arithmetic operators:-addtion(+),subtraction(-),multiplication(*),division(/),modulus(%)
//2. Relational operators:-greater than(>),less than(<),greater than or equal to(>=),less than or equal to(<=),equal to(==),not equal to(!=)
//3. Logical operators:-AND(&&),OR(||),NOT(!)
//4. Assignment operators:-equal to(=),add and assign(+=),subtract and assign(-=),multiply and assign(*=),divide and assign(/=),modulus and assign(%=)
//5. Unary operators:-increment(++),decrement(--),logical NOT(!),bitwise NOT(~)
//6. Ternary operator:-condition ? expression1 : expression2


import java.util.Scanner;
class operator{
    public static void main(String[] args){
        int num1,num2;
        Scanner sc =new Scanner(System.in);
        num1=sc.nextInt();
        num2=sc.nextInt();
        System.out.println("Addition: "+(num1+num2));
        System.out.println("Subtraction: "+(num1-num2));    
        System.out.println("Multiplication: "+(num1*num2));
        System.out.println("Division: "+(num1/num2));//quotient
        System.out.println("Modulus: "+(num1%num2));
        
}
}