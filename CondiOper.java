class CondiOper{
    public static void main(String[] args) {
        int num1 = 10, num2 = 20;
       String result = (num1>num2)?"num1 is greater than num2":"num1 is less than or equal to num2";
       System.out.println(result);
    }
}
//operators                                  Precendence of operators in Java
////!,+,-,(unary operators)                   First
//*,/,%                                       Second             
//+,-                                         Third
//<<,>>                                       Fourth
//<,>,<=,>=                                   Fifth    
//==,!=                                       Sixth 
//&&                                          Seventh
//||                                          Eighth
// =(assignment operator)                     lowest

