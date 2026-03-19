//Best way to compare the two string is equal() method not double equal to operator 
//equal() method only check the value not the memory address but  "==" this operator check the memmory location or address thats why it gives incorrect output. 



class compare_string{
    public static void main(String[] args){
        String s1 ="iamneo";
         String s2 = new String("iamneo");
         String s3 = "Iamneo";
         System.out.println(s1 == s2); //false....//compate values between two objects not bet two varibale 
        //s2 created using new keyword and it create a new memory outside the constant pool.
        // ..thats why false ...not point to same memmory location       
        System.out.println(s1 == s3);//true
         //s1 and s2 point to the same memory location (in string constant pool ...which is inside the ram memory) that's why its is true
         System.out.println(s1.equals(s2)); //correct way to compare the string
         System.out.println(s1.equals(s3)); 
        System.out.println(s1.equalsIgnoreCase(s3)); //ignore the case sensitivity and only comapre values
    }
}