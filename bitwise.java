//The bitwise operators take two bit numbers and use OR/AND operations to determine the result on a bit by bit basis 
//Bitwise operators in Java
//1.Bitwise AND(&)
//2.Bitwise OR(|)
//3.Bitwise XOR(^)
//4.Bitwise NOT(~)
//<<(left shift), >>(right shift), >>>(unsigned right shift) are also bitwise operators but they are used for shifting bits and not for performing AND/OR/XOR operations.
class bitwise{
    public static void maain(String[] args){
        int num1=10,num2=5;
        // num1=10-->1010
        // num2=5-->0101
        System.out.println("Bitwise AND: "+(num1&num2));//0000-->0
        System.out.println("Bitwise OR: "+(num1|num2));//1111       
        System.out,println("Bitwise XOR:"+(num1^num2)) ;//1111
        System.out.println("Bitwise NOT: "+(~num1));//-11
        System.out.println("Left Shift: "+(num1<<2));//101000-->40---->>num*2^n=10*2^2=40
        System.out.println("Right Shift:"+(num1>>2));//10-->2
        System.out.println("Unsigned Right Shift: "+(num1>>>2));//10-->2



    }
}