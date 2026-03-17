class UnaOper{
    public static void main(String[] args) {
        int num1=10 ,num2=20, num3=1,res;

        char ch = 'a';
        boolean flag  = true;
        res = +ch;
        System.out.println("Unary plus: "+res); 

        num3 = -num3;
        System.out.println("Unary minus: "+num3);

        res = num1++;
        System.out.println("Post-increment: "+res); //10

        res = ++num1;
        System.out.println("Pre-increment: "+res);//12
        

        res= num2--;
        System.out.println("Post-decrement: "+res); //20

        res = --num2;
        System.out.println("Pre-decrement: "+res); //18

        System.out.println("Logical NOT: "+!flag); //false

    }
}